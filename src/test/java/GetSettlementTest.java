import api.Address;
import api.BaseApiTest;
import api.Settlement;
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

public class GetSettlementTest extends BaseApiTest {
    String API_key = "5d77c41062f127845411d9d64ebd0da8";
    Map<String, Object> reqBody = new HashMap<>();

    @BeforeEach
    public void setReqBody() {
        Map<String, String> methodProperties = new HashMap<>();
        methodProperties.put("Warehouse", "1");
        methodProperties.put("FindByString", "Київ");

        reqBody.put("apiKey", API_key);
        reqBody.put("modelName", "Address");
        reqBody.put("calledMethod", "getSettlements");
        reqBody.put("methodProperties", methodProperties);
    }

    @Test
    public void checkSettlementJsonSchema() {
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
                        "\\src\\main\\resources\\validators\\np_settlement_schema.json")));
    }

    @Test
    public void checkAreaDescription(){

        List<Settlement> settlementList = given()
                .spec(requestSpecification)
                .body(reqBody)
                .contentType(ContentType.JSON)
                .when()
                .post()
                .then()
                .spec(responseSpecification)
                .extract()
                .body().jsonPath().getList("data", Settlement.class);

        System.out.println(settlementList);
        settlementList.forEach(x -> Assertions.assertTrue(x.getAreaDescription().contains("Сумська область")));
    }
}
