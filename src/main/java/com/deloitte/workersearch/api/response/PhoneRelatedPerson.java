
package com.deloitte.workersearch.api.response;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "deviceType",
    "isPublic",
    "isPrimary",
    "formattedPhoneNumber",
    "internationalPhoneCode",
    "areaCode",
    "phoneNumber"
})
public class PhoneRelatedPerson {

    @JsonProperty("type")
    private String type;
    @JsonProperty("deviceType")
    private String deviceType;
    @JsonProperty("isPublic")
    private Boolean isPublic;
    @JsonProperty("isPrimary")
    private Boolean isPrimary;
    @JsonProperty("formattedPhoneNumber")
    private String formattedPhoneNumber;
    @JsonProperty("internationalPhoneCode")
    private String internationalPhoneCode;
    @JsonProperty("areaCode")
    private Integer areaCode;
    @JsonProperty("phoneNumber")
    private String phoneNumber;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("deviceType")
    public String getDeviceType() {
        return deviceType;
    }

    @JsonProperty("deviceType")
    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    @JsonProperty("isPublic")
    public Boolean getIsPublic() {
        return isPublic;
    }

    @JsonProperty("isPublic")
    public void setIsPublic(Boolean isPublic) {
        this.isPublic = isPublic;
    }

    @JsonProperty("isPrimary")
    public Boolean getIsPrimary() {
        return isPrimary;
    }

    @JsonProperty("isPrimary")
    public void setIsPrimary(Boolean isPrimary) {
        this.isPrimary = isPrimary;
    }

    @JsonProperty("formattedPhoneNumber")
    public String getFormattedPhoneNumber() {
        return formattedPhoneNumber;
    }

    @JsonProperty("formattedPhoneNumber")
    public void setFormattedPhoneNumber(String formattedPhoneNumber) {
        this.formattedPhoneNumber = formattedPhoneNumber;
    }

    @JsonProperty("internationalPhoneCode")
    public String getInternationalPhoneCode() {
        return internationalPhoneCode;
    }

    @JsonProperty("internationalPhoneCode")
    public void setInternationalPhoneCode(String internationalPhoneCode) {
        this.internationalPhoneCode = internationalPhoneCode;
    }

    @JsonProperty("areaCode")
    public Integer getAreaCode() {
        return areaCode;
    }

    @JsonProperty("areaCode")
    public void setAreaCode(Integer areaCode) {
        this.areaCode = areaCode;
    }

    @JsonProperty("phoneNumber")
    public String getPhoneNumber() {
        return phoneNumber;
    }

    @JsonProperty("phoneNumber")
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
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
