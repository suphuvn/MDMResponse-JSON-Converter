
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
    "positionId",
    "annualSalaryAmount",
    "effectiveDate",
    "changeReason",
    "totalBasePay",
    "basePayFrequency",
    "basePayCurrency"
})
public class Compensation {

    @JsonProperty("positionId")
    private Integer positionId;
    @JsonProperty("annualSalaryAmount")
    private Double annualSalaryAmount;
    @JsonProperty("effectiveDate")
    private String effectiveDate;
    @JsonProperty("changeReason")
    private String changeReason;
    @JsonProperty("totalBasePay")
    private Double totalBasePay;
    @JsonProperty("basePayFrequency")
    private String basePayFrequency;
    @JsonProperty("basePayCurrency")
    private String basePayCurrency;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("positionId")
    public Integer getPositionId() {
        return positionId;
    }

    @JsonProperty("positionId")
    public void setPositionId(Integer positionId) {
        this.positionId = positionId;
    }

    @JsonProperty("annualSalaryAmount")
    public Double getAnnualSalaryAmount() {
        return annualSalaryAmount;
    }

    @JsonProperty("annualSalaryAmount")
    public void setAnnualSalaryAmount(Double annualSalaryAmount) {
        this.annualSalaryAmount = annualSalaryAmount;
    }

    @JsonProperty("effectiveDate")
    public String getEffectiveDate() {
        return effectiveDate;
    }

    @JsonProperty("effectiveDate")
    public void setEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    @JsonProperty("changeReason")
    public String getChangeReason() {
        return changeReason;
    }

    @JsonProperty("changeReason")
    public void setChangeReason(String changeReason) {
        this.changeReason = changeReason;
    }

    @JsonProperty("totalBasePay")
    public Double getTotalBasePay() {
        return totalBasePay;
    }

    @JsonProperty("totalBasePay")
    public void setTotalBasePay(Double totalBasePay) {
        this.totalBasePay = totalBasePay;
    }

    @JsonProperty("basePayFrequency")
    public String getBasePayFrequency() {
        return basePayFrequency;
    }

    @JsonProperty("basePayFrequency")
    public void setBasePayFrequency(String basePayFrequency) {
        this.basePayFrequency = basePayFrequency;
    }

    @JsonProperty("basePayCurrency")
    public String getBasePayCurrency() {
        return basePayCurrency;
    }

    @JsonProperty("basePayCurrency")
    public void setBasePayCurrency(String basePayCurrency) {
        this.basePayCurrency = basePayCurrency;
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
