import api.Address;
import api.BaseApiTest;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItems;

public class APITest extends BaseApiTest {
    String API_key = "5d77c41062f127845411d9d64ebd0da8";
    Map<String, Object> reqBody = new HashMap<>();

    @BeforeEach
    public void setReqBody() {
        Map<String, String> methodProperties = new HashMap<>();
        methodProperties.put("CityName", "Київ");
        methodProperties.put("Limit", "5");

        reqBody.put("apiKey", API_key);
        reqBody.put("modelName", "Address");
        reqBody.put("calledMethod", "searchSettlements");
        reqBody.put("methodProperties", methodProperties);
    }


    @Test
    public void checkThatSuccess() {
        given()
                .spec(requestSpecification)
                .contentType(ContentType.JSON)
                .body(reqBody)
                .when()
                .post()
                .then()
                .spec(responseSpecification)
                .assertThat()
                .body("success", equalTo(true));
    }

    @Test
    public void checkJsonSchema() {
        given()
                .spec(requestSpecification)
                .body(reqBody)
                .contentType(ContentType.JSON)
                .when()
                .post()
                .then()
                .spec(responseSpecification)
                .statusCode(200)
                .assertThat()
                .body(matchesJsonSchema(new File(System.getProperty("user.dir") +
                        "\\src\\main\\resources\\validators\\np_address_schema.json")));
    }

    @Test
    public void checkRegions() {
        given()
                .spec(requestSpecification)
                .body(reqBody)
                .contentType(ContentType.JSON)
                .when()
                .post()
                .then()
                .spec(responseSpecification)
                .statusCode(200)
                .assertThat()
                .body("success", equalTo(true))
                .body("data[0].Addresses[0].Present", equalTo("м. Київ, Київська обл."))
                .body("data[0].TotalCount", equalTo(9));
    }

    @Test
    public void checkRegionsWithPojoUsage(){

     List<Address> addressList = given()
                .spec(requestSpecification)
                .body(reqBody)
                .contentType(ContentType.JSON)
                .when()
                .post()
                .then()
                .spec(responseSpecification)
                .extract()
                .body().jsonPath().getList("data[0].Addresses", Address.class);

        System.out.println(addressList);
        addressList.forEach(x -> Assertions.assertTrue(x.getPresent().contains("Київ")));
    }
}
