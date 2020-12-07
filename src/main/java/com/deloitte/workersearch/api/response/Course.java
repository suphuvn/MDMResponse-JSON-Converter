
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
    "id",
    "name",
    "description",
    "enrollmentDate",
    "startDate",
    "completionStatus",
    "completionDate"
})
public class Course {

    @JsonProperty("id")
    private String id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("description")
    private String description;
    @JsonProperty("enrollmentDate")
    private String enrollmentDate;
    @JsonProperty("startDate")
    private String startDate;
    @JsonProperty("completionStatus")
    private String completionStatus;
    @JsonProperty("completionDate")
    private String completionDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("enrollmentDate")
    public String getEnrollmentDate() {
        return enrollmentDate;
    }

    @JsonProperty("enrollmentDate")
    public void setEnrollmentDate(String enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }

    @JsonProperty("startDate")
    public String getStartDate() {
        return startDate;
    }

    @JsonProperty("startDate")
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    @JsonProperty("completionStatus")
    public String getCompletionStatus() {
        return completionStatus;
    }

    @JsonProperty("completionStatus")
    public void setCompletionStatus(String completionStatus) {
        this.completionStatus = completionStatus;
    }

    @JsonProperty("completionDate")
    public String getCompletionDate() {
        return completionDate;
    }

    @JsonProperty("completionDate")
    public void setCompletionDate(String completionDate) {
        this.completionDate = completionDate;
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
