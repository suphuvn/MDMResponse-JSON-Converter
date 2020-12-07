
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
    "organizationName",
    "effectiveDate",
    "primaryPosition",
    "internationalAssignment",
    "titleOfPosition",
    "positionName",
    "employmentType",
    "timeType",
    "scheduledWeeklyHours",
    "payRateType",
    "jobName",
    "jobCategory",
    "jobGroupname",
    "businessSite",
    "businessSiteName",
    "businessSiteRegion",
    "businessSiteCity",
    "businessSitePostalCode",
    "businessSiteCountry",
    "supervisoryOrgCode",
    "supervisoryOrgName",
    "companyCode",
    "companyName",
    "costCenterCode",
    "costCenterName",
    "locationHierarchyCode",
    "locationHierarchyName",
    "locationName",
    "workerType",
    "managementLevel",
    "jobManagementLevel"
})
public class Position {

    @JsonProperty("id")
    private String id;
    @JsonProperty("organizationName")
    private String organizationName;
    @JsonProperty("effectiveDate")
    private String effectiveDate;
    @JsonProperty("primaryPosition")
    private String primaryPosition;
    @JsonProperty("internationalAssignment")
    private String internationalAssignment;
    @JsonProperty("titleOfPosition")
    private String titleOfPosition;
    @JsonProperty("positionName")
    private String positionName;
    @JsonProperty("employmentType")
    private String employmentType;
    @JsonProperty("timeType")
    private String timeType;
    @JsonProperty("scheduledWeeklyHours")
    private String scheduledWeeklyHours;
    @JsonProperty("payRateType")
    private String payRateType;
    @JsonProperty("jobName")
    private String jobName;
    @JsonProperty("jobCategory")
    private String jobCategory;
    @JsonProperty("jobGroupname")
    private String jobGroupname;
    @JsonProperty("businessSite")
    private String businessSite;
    @JsonProperty("businessSiteName")
    private String businessSiteName;
    @JsonProperty("businessSiteRegion")
    private String businessSiteRegion;
    @JsonProperty("businessSiteCity")
    private String businessSiteCity;
    @JsonProperty("businessSitePostalCode")
    private String businessSitePostalCode;
    @JsonProperty("businessSiteCountry")
    private String businessSiteCountry;
    @JsonProperty("supervisoryOrgCode")
    private String supervisoryOrgCode;
    @JsonProperty("supervisoryOrgName")
    private String supervisoryOrgName;
    @JsonProperty("companyCode")
    private String companyCode;
    @JsonProperty("companyName")
    private String companyName;
    @JsonProperty("costCenterCode")
    private String costCenterCode;
    @JsonProperty("costCenterName")
    private String costCenterName;
    @JsonProperty("locationHierarchyCode")
    private String locationHierarchyCode;
    @JsonProperty("locationHierarchyName")
    private String locationHierarchyName;
    @JsonProperty("locationName")
    private String locationName;
    @JsonProperty("workerType")
    private String workerType;
    @JsonProperty("managementLevel")
    private String managementLevel;
    @JsonProperty("jobManagementLevel")
    private String jobManagementLevel;
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

    @JsonProperty("organizationName")
    public String getOrganizationName() {
        return organizationName;
    }

    @JsonProperty("organizationName")
    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    @JsonProperty("effectiveDate")
    public String getEffectiveDate() {
        return effectiveDate;
    }

    @JsonProperty("effectiveDate")
    public void setEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    @JsonProperty("primaryPosition")
    public String getPrimaryPosition() {
        return primaryPosition;
    }

    @JsonProperty("primaryPosition")
    public void setPrimaryPosition(String primaryPosition) {
        this.primaryPosition = primaryPosition;
    }

    @JsonProperty("internationalAssignment")
    public String getInternationalAssignment() {
        return internationalAssignment;
    }

    @JsonProperty("internationalAssignment")
    public void setInternationalAssignment(String internationalAssignment) {
        this.internationalAssignment = internationalAssignment;
    }

    @JsonProperty("titleOfPosition")
    public String getTitleOfPosition() {
        return titleOfPosition;
    }

    @JsonProperty("titleOfPosition")
    public void setTitleOfPosition(String titleOfPosition) {
        this.titleOfPosition = titleOfPosition;
    }

    @JsonProperty("positionName")
    public String getPositionName() {
        return positionName;
    }

    @JsonProperty("positionName")
    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

    @JsonProperty("employmentType")
    public String getEmploymentType() {
        return employmentType;
    }

    @JsonProperty("employmentType")
    public void setEmploymentType(String employmentType) {
        this.employmentType = employmentType;
    }

    @JsonProperty("timeType")
    public String getTimeType() {
        return timeType;
    }

    @JsonProperty("timeType")
    public void setTimeType(String timeType) {
        this.timeType = timeType;
    }

    

    public String getScheduledWeeklyHours() {
		return scheduledWeeklyHours;
	}

	public void setScheduledWeeklyHours(String scheduledWeeklyHours) {
		this.scheduledWeeklyHours = scheduledWeeklyHours;
	}

	@JsonProperty("payRateType")
    public String getPayRateType() {
        return payRateType;
    }

    @JsonProperty("payRateType")
    public void setPayRateType(String payRateType) {
        this.payRateType = payRateType;
    }

    @JsonProperty("jobName")
    public String getJobName() {
        return jobName;
    }

    @JsonProperty("jobName")
    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    @JsonProperty("jobCategory")
    public String getJobCategory() {
        return jobCategory;
    }

    @JsonProperty("jobCategory")
    public void setJobCategory(String jobCategory) {
        this.jobCategory = jobCategory;
    }

    @JsonProperty("jobGroupname")
    public String getJobGroupname() {
        return jobGroupname;
    }

    @JsonProperty("jobGroupname")
    public void setJobGroupname(String jobGroupname) {
        this.jobGroupname = jobGroupname;
    }

    @JsonProperty("businessSite")
    public String getBusinessSite() {
        return businessSite;
    }

    @JsonProperty("businessSite")
    public void setBusinessSite(String businessSite) {
        this.businessSite = businessSite;
    }

    @JsonProperty("businessSiteName")
    public String getBusinessSiteName() {
        return businessSiteName;
    }

    @JsonProperty("businessSiteName")
    public void setBusinessSiteName(String businessSiteName) {
        this.businessSiteName = businessSiteName;
    }

    @JsonProperty("businessSiteRegion")
    public String getBusinessSiteRegion() {
        return businessSiteRegion;
    }

    @JsonProperty("businessSiteRegion")
    public void setBusinessSiteRegion(String businessSiteRegion) {
        this.businessSiteRegion = businessSiteRegion;
    }

    @JsonProperty("businessSiteCity")
    public String getBusinessSiteCity() {
        return businessSiteCity;
    }

    @JsonProperty("businessSiteCity")
    public void setBusinessSiteCity(String businessSiteCity) {
        this.businessSiteCity = businessSiteCity;
    }

    @JsonProperty("businessSitePostalCode")
    public String getBusinessSitePostalCode() {
        return businessSitePostalCode;
    }

    @JsonProperty("businessSitePostalCode")
    public void setBusinessSitePostalCode(String businessSitePostalCode) {
        this.businessSitePostalCode = businessSitePostalCode;
    }

    @JsonProperty("businessSiteCountry")
    public String getBusinessSiteCountry() {
        return businessSiteCountry;
    }

    @JsonProperty("businessSiteCountry")
    public void setBusinessSiteCountry(String businessSiteCountry) {
        this.businessSiteCountry = businessSiteCountry;
    }

    @JsonProperty("supervisoryOrgCode")
    public String getSupervisoryOrgCode() {
        return supervisoryOrgCode;
    }

    @JsonProperty("supervisoryOrgCode")
    public void setSupervisoryOrgCode(String supervisoryOrgCode) {
        this.supervisoryOrgCode = supervisoryOrgCode;
    }

    @JsonProperty("supervisoryOrgName")
    public String getSupervisoryOrgName() {
        return supervisoryOrgName;
    }

    @JsonProperty("supervisoryOrgName")
    public void setSupervisoryOrgName(String supervisoryOrgName) {
        this.supervisoryOrgName = supervisoryOrgName;
    }

    @JsonProperty("companyCode")
    public String getCompanyCode() {
        return companyCode;
    }

    @JsonProperty("companyCode")
    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    @JsonProperty("companyName")
    public String getCompanyName() {
        return companyName;
    }

    @JsonProperty("companyName")
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @JsonProperty("costCenterCode")
    public String getCostCenterCode() {
        return costCenterCode;
    }

    @JsonProperty("costCenterCode")
    public void setCostCenterCode(String costCenterCode) {
        this.costCenterCode = costCenterCode;
    }

    @JsonProperty("costCenterName")
    public String getCostCenterName() {
        return costCenterName;
    }

    @JsonProperty("costCenterName")
    public void setCostCenterName(String costCenterName) {
        this.costCenterName = costCenterName;
    }

    @JsonProperty("locationHierarchyCode")
    public String getLocationHierarchyCode() {
        return locationHierarchyCode;
    }

    @JsonProperty("locationHierarchyCode")
    public void setLocationHierarchyCode(String locationHierarchyCode) {
        this.locationHierarchyCode = locationHierarchyCode;
    }

    @JsonProperty("locationHierarchyName")
    public String getLocationHierarchyName() {
        return locationHierarchyName;
    }

    @JsonProperty("locationHierarchyName")
    public void setLocationHierarchyName(String locationHierarchyName) {
        this.locationHierarchyName = locationHierarchyName;
    }

    @JsonProperty("locationName")
    public String getLocationName() {
        return locationName;
    }

    @JsonProperty("locationName")
    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    @JsonProperty("workerType")
    public String getWorkerType() {
        return workerType;
    }

    @JsonProperty("workerType")
    public void setWorkerType(String workerType) {
        this.workerType = workerType;
    }

    @JsonProperty("managementLevel")
    public String getManagementLevel() {
        return managementLevel;
    }

    @JsonProperty("managementLevel")
    public void setManagementLevel(String managementLevel) {
        this.managementLevel = managementLevel;
    }

    @JsonProperty("jobManagementLevel")
    public String getJobManagementLevel() {
        return jobManagementLevel;
    }

    @JsonProperty("jobManagementLevel")
    public void setJobManagementLevel(String jobManagementLevel) {
        this.jobManagementLevel = jobManagementLevel;
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
