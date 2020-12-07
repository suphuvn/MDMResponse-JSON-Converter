
package com.deloitte.workersearch.api.response;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


public class NameDataRelatedPerson {

    @JsonProperty("type")
    private String type;
    @JsonProperty("firstName")
    private String firstName;
    @JsonProperty("middleName")
    private String middleName;
    @JsonProperty("lastName")
    private String lastName;
    @JsonProperty("formattedName")
    private String formattedName;
    @JsonProperty("reportingName")
    private String reportingName;
    @JsonProperty("additionalType")
    private String additionalType;
    @JsonProperty("additionalFirstName")
    private String additionalFirstName;
    @JsonProperty("additionalMiddleName")
    private String additionalMiddleName;
    @JsonProperty("additionalLastName:")
    private String additionalLastName;
    @JsonProperty("additionalFormattedName")
    private String additionalFormattedName;
    @JsonProperty("additionalReportingName")
    private String additionalReportingName;
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

    @JsonProperty("firstName")
    public String getFirstName() {
        return firstName;
    }

    @JsonProperty("firstName")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @JsonProperty("middleName")
    public String getMiddleName() {
        return middleName;
    }

    @JsonProperty("middleName")
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    @JsonProperty("lastName")
    public String getLastName() {
        return lastName;
    }

    @JsonProperty("lastName")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @JsonProperty("formattedName")
    public String getFormattedName() {
        return formattedName;
    }

    @JsonProperty("formattedName")
    public void setFormattedName(String formattedName) {
        this.formattedName = formattedName;
    }

    @JsonProperty("reportingName")
    public String getReportingName() {
        return reportingName;
    }

    @JsonProperty("reportingName")
    public void setReportingName(String reportingName) {
        this.reportingName = reportingName;
    }

    @JsonProperty("additionalType")
    public String getAdditionalType() {
        return additionalType;
    }

    @JsonProperty("additionalType")
    public void setAdditionalType(String additionalType) {
        this.additionalType = additionalType;
    }

    @JsonProperty("additionalFirstName")
    public String getAdditionalFirstName() {
        return additionalFirstName;
    }

    @JsonProperty("additionalFirstName")
    public void setAdditionalFirstName(String additionalFirstName) {
        this.additionalFirstName = additionalFirstName;
    }

    @JsonProperty("additionalMiddleName")
    public String getAdditionalMiddleName() {
        return additionalMiddleName;
    }

    @JsonProperty("additionalMiddleName")
    public void setAdditionalMiddleName(String additionalMiddleName) {
        this.additionalMiddleName = additionalMiddleName;
    }

    @JsonProperty("additionalLastName:")
    public String getAdditionalLastName() {
        return additionalLastName;
    }

    @JsonProperty("additionalLastName:")
    public void setAdditionalLastName(String additionalLastName) {
        this.additionalLastName = additionalLastName;
    }

    @JsonProperty("additionalFormattedName")
    public String getAdditionalFormattedName() {
        return additionalFormattedName;
    }

    @JsonProperty("additionalFormattedName")
    public void setAdditionalFormattedName(String additionalFormattedName) {
        this.additionalFormattedName = additionalFormattedName;
    }

    @JsonProperty("additionalReportingName")
    public String getAdditionalReportingName() {
        return additionalReportingName;
    }

    @JsonProperty("additionalReportingName")
    public void setAdditionalReportingName(String additionalReportingName) {
        this.additionalReportingName = additionalReportingName;
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
