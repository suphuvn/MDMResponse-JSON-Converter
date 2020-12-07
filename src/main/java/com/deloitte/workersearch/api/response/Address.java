
package com.deloitte.workersearch.api.response;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

public class Address {

    @JsonProperty("addressType")
    private String addressType;
    @JsonProperty("isAddessPublic")
    private Boolean isAddessPublic;
    @JsonProperty("isPrimaryAddess")
    private Boolean isPrimaryAddess;
    @JsonProperty("buildingDescription")
    private String buildingDescription;
    @JsonProperty("addressLine1")
    private String addressLine1;
    @JsonProperty("city")
    private String city;
    @JsonProperty("region")
    private String region;
    @JsonProperty("regionCode")
    private String regionCode;
    @JsonProperty("zipPostalCode")
    private String zipPostalCode;
    @JsonProperty("countryName")
    private String countryName;
    @JsonProperty("addressLine2")
    private String addressLine2;
    
    
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    
    
    public String getRegionCode() {
		return regionCode;
	}

	public void setRegionCode(String regionCode) {
		this.regionCode = regionCode;
	}

	@JsonProperty("addressType")
    public String getAddressType() {
        return addressType;
    }

    @JsonProperty("addressType")
    public void setAddressType(String addressType) {
        this.addressType = addressType;
    }

    @JsonProperty("isAddessPublic")
    public Boolean getIsAddessPublic() {
        return isAddessPublic;
    }

    @JsonProperty("isAddessPublic")
    public void setIsAddessPublic(Boolean isAddessPublic) {
        this.isAddessPublic = isAddessPublic;
    }

    @JsonProperty("isPrimaryAddess")
    public Boolean getIsPrimaryAddess() {
        return isPrimaryAddess;
    }

    @JsonProperty("isPrimaryAddess")
    public void setIsPrimaryAddess(Boolean isPrimaryAddess) {
        this.isPrimaryAddess = isPrimaryAddess;
    }
    @JsonProperty("buildingDescription")
    public String getBuildingDescription() {
        return buildingDescription;
    }

    @JsonProperty("buildingDescription")
    public void setBuildingDescription(String buildingDescription) {
        this.buildingDescription = buildingDescription;
    }

    @JsonProperty("addressLine1")
    public String getAddressLine1() {
        return addressLine1;
    }

    @JsonProperty("addressLine1")
    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    @JsonProperty("region")
    public String getRegion() {
        return region;
    }

    @JsonProperty("region")
    public void setRegion(String region) {
        this.region = region;
    }

    @JsonProperty("zipPostalCode")
    public String getZipPostalCode() {
        return zipPostalCode;
    }

    @JsonProperty("zipPostalCode")
    public void setZipPostalCode(String zipPostalCode) {
        this.zipPostalCode = zipPostalCode;
    }

    @JsonProperty("countryName")
    public String getCountryName() {
        return countryName;
    }

    @JsonProperty("countryName")
    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    @JsonProperty("addressLine2")
    public String getAddressLine2() {
        return addressLine2;
    }

    @JsonProperty("addressLine2")
    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
