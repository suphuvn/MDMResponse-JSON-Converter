
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
    "isRescinded",
    "isCorrected"
})
public class Transaction {

    @JsonProperty("type")
    private String type;
    @JsonProperty("isRescinded")
    private Boolean isRescinded;
    @JsonProperty("isCorrected")
    private Boolean isCorrected;
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

    @JsonProperty("isRescinded")
    public Boolean getIsRescinded() {
        return isRescinded;
    }

    @JsonProperty("isRescinded")
    public void setIsRescinded(Boolean isRescinded) {
        this.isRescinded = isRescinded;
    }

    @JsonProperty("isCorrected")
    public Boolean getIsCorrected() {
        return isCorrected;
    }

    @JsonProperty("isCorrected")
    public void setIsCorrected(Boolean isCorrected) {
        this.isCorrected = isCorrected;
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
