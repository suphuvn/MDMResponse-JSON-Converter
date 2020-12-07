
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
    "profileId",
    "titleOfPosition",
    "employmentStatusName",
    "managementLevel",
    "level",
    "familyId",
    "familyGroup",
    "familyName"
})
public class Job {

    @JsonProperty("profileId")
    private Integer profileId;
    @JsonProperty("titleOfPosition")
    private String titleOfPosition;
    @JsonProperty("employmentStatusName")
    private String employmentStatusName;
    @JsonProperty("managementLevel")
    private String managementLevel;
    @JsonProperty("level")
    private String level;
    @JsonProperty("familyId")
    private String familyId;
    @JsonProperty("familyGroup")
    private String familyGroup;
    @JsonProperty("familyName")
    private String familyName;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("profileId")
    public Integer getProfileId() {
        return profileId;
    }

    @JsonProperty("profileId")
    public void setProfileId(Integer profileId) {
        this.profileId = profileId;
    }

    @JsonProperty("titleOfPosition")
    public String getTitleOfPosition() {
        return titleOfPosition;
    }

    @JsonProperty("titleOfPosition")
    public void setTitleOfPosition(String titleOfPosition) {
        this.titleOfPosition = titleOfPosition;
    }

    @JsonProperty("employmentStatusName")
    public String getEmploymentStatusName() {
        return employmentStatusName;
    }

    @JsonProperty("employmentStatusName")
    public void setEmploymentStatusName(String employmentStatusName) {
        this.employmentStatusName = employmentStatusName;
    }

    @JsonProperty("managementLevel")
    public String getManagementLevel() {
        return managementLevel;
    }

    @JsonProperty("managementLevel")
    public void setManagementLevel(String managementLevel) {
        this.managementLevel = managementLevel;
    }

    @JsonProperty("level")
    public String getLevel() {
        return level;
    }

    @JsonProperty("level")
    public void setLevel(String level) {
        this.level = level;
    }

    @JsonProperty("familyId")
    public String getFamilyId() {
        return familyId;
    }

    @JsonProperty("familyId")
    public void setFamilyId(String familyId) {
        this.familyId = familyId;
    }

    @JsonProperty("familyGroup")
    public String getFamilyGroup() {
        return familyGroup;
    }

    @JsonProperty("familyGroup")
    public void setFamilyGroup(String familyGroup) {
        this.familyGroup = familyGroup;
    }

    @JsonProperty("familyName")
    public String getFamilyName() {
        return familyName;
    }

    @JsonProperty("familyName")
    public void setFamilyName(String familyName) {
        this.familyName = familyName;
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
