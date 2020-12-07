
package com.deloitte.workersearch.api.response;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

public class Organization {

    @JsonProperty("id")
    private String id;
    @JsonProperty("code")
    private String code;
    @JsonProperty("type")
    private String type;
    @JsonProperty("name")
    private String name;
    @JsonProperty("description")
    private String description;
    @JsonProperty("subType")
    private String subType;
    @JsonProperty("isInactive")
    private Boolean isInactive;
    @JsonProperty("manager")
    private String manager;
    @JsonProperty("superiorOrganization")
    private String superiorOrganization;
    @JsonProperty("primaryBusinessSiteReference")
    private String primaryBusinessSiteReference;
    @JsonProperty("availablityDate")
    private String availablityDate;
    @JsonProperty("orgLevels")
    private List<OrgLevel> orgLevels = null;
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

    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
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

    @JsonProperty("subType")
    public String getSubType() {
        return subType;
    }

    @JsonProperty("subType")
    public void setSubType(String subType) {
        this.subType = subType;
    }

    @JsonProperty("isInactive")
    public Boolean getIsInactive() {
        return isInactive;
    }

    @JsonProperty("isInactive")
    public void setIsInactive(Boolean isInactive) {
        this.isInactive = isInactive;
    }

    @JsonProperty("manager")
    public String getManager() {
        return manager;
    }

    @JsonProperty("manager")
    public void setManager(String manager) {
        this.manager = manager;
    }

    @JsonProperty("superiorOrganization")
    public String getSuperiorOrganization() {
        return superiorOrganization;
    }

    @JsonProperty("superiorOrganization")
    public void setSuperiorOrganization(String superiorOrganization) {
        this.superiorOrganization = superiorOrganization;
    }

    @JsonProperty("primaryBusinessSiteReference")
    public String getPrimaryBusinessSiteReference() {
        return primaryBusinessSiteReference;
    }

    @JsonProperty("primaryBusinessSiteReference")
    public void setPrimaryBusinessSiteReference(String primaryBusinessSiteReference) {
        this.primaryBusinessSiteReference = primaryBusinessSiteReference;
    }

    @JsonProperty("availablityDate")
    public String getAvailablityDate() {
        return availablityDate;
    }

    @JsonProperty("availablityDate")
    public void setAvailablityDate(String availablityDate) {
        this.availablityDate = availablityDate;
    }

    @JsonProperty("orgLevels")
    public List<OrgLevel> getOrgLevels() {
        return orgLevels;
    }

    @JsonProperty("orgLevels")
    public void setOrgLevels(List<OrgLevel> orgLevels) {
        this.orgLevels = orgLevels;
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
