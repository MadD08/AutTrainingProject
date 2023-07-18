package api;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;

@JsonDeserialize(as = Settlement.class)
public class Settlement {
    @JsonProperty("Ref")
    private String Ref;
    @JsonProperty("SettlementType")
    private String SettlementType;
    @JsonProperty("Latitude")
    private String Latitude;
    @JsonProperty("Longitude")
    private String Longitude;
    @JsonProperty("Description")
    private String Description;
    @JsonProperty("DescriptionRu")
    private String DescriptionRu;
    @JsonProperty("DescriptionTranslit")
    private String DescriptionTranslit;
    @JsonProperty("SettlementTypeDescription")
    private String SettlementTypeDescription;
    @JsonProperty("SettlementTypeDescriptionRu")
    private String SettlementTypeDescriptionRu;
    @JsonProperty("SettlementTypeDescriptionTranslit")
    private String SettlementTypeDescriptionTranslit;
    @JsonProperty("Region")
    private String Region;
    @JsonProperty("RegionsDescription")
    private String RegionsDescription;
    @JsonProperty("RegionsDescriptionRu")
    private String RegionsDescriptionRu;
    @JsonProperty("RegionsDescriptionTranslit")
    private String RegionsDescriptionTranslit;
    @JsonProperty("Area")
    private String Area;
    @JsonProperty("AreaDescription")
    private String AreaDescription;
    @JsonProperty("AreaDescriptionRu")
    private String AreaDescriptionRu;
    @JsonProperty("AreaDescriptionTranslit")
    private String AreaDescriptionTranslit;
    @JsonProperty("Index1")
    private String Index1;
    @JsonProperty("Index2")
    private String Index2;
    @JsonProperty("IndexCOATSU1")
    private String IndexCOATSU1;
    @JsonProperty("Delivery1")
    private String Delivery1;
    @JsonProperty("Delivery2")
    private String Delivery2;
    @JsonProperty("Delivery3")
    private String Delivery3;
    @JsonProperty("Delivery4")
    private String Delivery4;
    @JsonProperty("Delivery5")
    private String Delivery5;
    @JsonProperty("Delivery6")
    private String Delivery6;
    @JsonProperty("Delivery7")
    private String Delivery7;
    @JsonProperty("SpecialCashCheck")
    private String SpecialCashCheck;
    @JsonProperty("Warehouse")
    private String Warehouse;

    @JsonCreator
    public Settlement(@JsonProperty("Ref") String ref,
                      @JsonProperty("SettlementType") String settlementType,
                      @JsonProperty("Latitude") String latitude,
                      @JsonProperty("Longitude") String longitude,
                      @JsonProperty("Description") String description,
                      @JsonProperty("DescriptionRu") String descriptionRu,
                      @JsonProperty("DescriptionTranslit") String descriptionTranslit,
                      @JsonProperty("SettlementTypeDescription") String settlementTypeDescription,
                      @JsonProperty("SettlementTypeDescriptionRu") String settlementTypeDescriptionRuntTypeDescription,
                      @JsonProperty("SettlementTypeDescriptionTranslit") String settlementTypeDescriptionTranslit,
                      @JsonProperty("Region") String region,
                      @JsonProperty("RegionsDescription") String regionsDescription,
                      @JsonProperty("RegionsDescriptionRu") String regionsDescriptionRu,
                      @JsonProperty("RegionsDescriptionTranslit") String regionsDescriptionTranslit,
                      @JsonProperty("Area") String area,
                      @JsonProperty("AreaDescription") String areaDescription,
                      @JsonProperty("AreaDescriptionRu") String areaDescriptionRu,
                      @JsonProperty("AreaDescriptionTranslit") String areaDescriptionTranslit,
                      @JsonProperty("Index1") String index1,
                      @JsonProperty("Index2") String index2,
                      @JsonProperty("IndexCOATSU1") String indexCOATSU1,
                      @JsonProperty("Delivery1") String delivery1,
                      @JsonProperty("Delivery2") String delivery2,
                      @JsonProperty("Delivery3") String delivery3,
                      @JsonProperty("Delivery4") String delivery4,
                      @JsonProperty("Delivery5") String delivery5,
                      @JsonProperty("Delivery6") String delivery6,
                      @JsonProperty("Delivery7") String delivery7,
                      @JsonProperty("SpecialCashCheck") String specialCashCheck,
                      @JsonProperty("Warehouse") String warehouse) {
        this.Ref = ref;
        this.SettlementType = settlementType;
        this.Latitude = latitude;
        this.Longitude = longitude;
        this.Description = description;
        this.SettlementTypeDescription = settlementTypeDescription;
        this.Region = region;
        this.RegionsDescription = regionsDescription;
        this.Area = area;
        this.AreaDescription = areaDescription;
        this.Index1 = index1;
        this.IndexCOATSU1 = indexCOATSU1;
        this.Warehouse = warehouse;
    }


    @Getter
    public String getRef() {
        return Ref;
    }

    @Setter
    public void setRef(String ref) {
        Ref = ref;
    }

    @Getter
    public String getSettlementType() {
        return SettlementType;
    }

    @Setter
    public void setSettlementType(String settlementType) {
        SettlementType = settlementType;
    }

    @Getter
    public String getLatitude() {
        return Latitude;
    }

    @Setter
    public void setLatitude(String latitude) {
        Latitude = latitude;
    }

    @Getter
    public String getRegionsDescription() {
        return RegionsDescription;
    }

    @Setter
    public void setRegionsDescription(String regionsDescription) {
        RegionsDescription = regionsDescription;
    }

    @Getter
    public String getAreaDescription() {
        return AreaDescription;
    }

    @Setter
    public void setAreaDescription(String areaDescription) {
        AreaDescription = areaDescription;
    }
}
