
package com.deloitte.workersearch.api.response;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Employee {

    @JsonProperty("id")
    private String id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("genderName")
    private String genderName;
    @JsonProperty("dateOfBirth")
    private String dateOfBirth;
    @JsonProperty("staffingEventDate")
    private String staffingEventDate;
    @JsonProperty("staffingEvent")
    private String staffingEvent;
    @JsonProperty("status")
    private String status;
    @JsonProperty("isActive")
    private String isActive;
    @JsonProperty("activeStatusDate")
    private String activeStatusDate;
    @JsonProperty("hireDate")
    private String hireDate;
    @JsonProperty("originalHireDate")
    private String originalHireDate;
    @JsonProperty("hireReason")
    private String hireReason;
    @JsonProperty("employmentStartDate")
    private String employmentStartDate;
    @JsonProperty("isRetired")
    private String isRetired;
    @JsonProperty("seniorityDate")
    private String seniorityDate;
    @JsonProperty("isTerminated")
    private String isTerminated;
    @JsonProperty("terminationDate")
    private String terminationDate;
    @JsonProperty("isHireRescinded")
    private String isHireRescinded;
    @JsonProperty("lastDayOfWork")
    private String lastDayOfWork;
    @JsonProperty("hasInternationalAssignment")
    private String hasInternationalAssignment;
    @JsonProperty("countryName")
    private String countryName;
    @JsonProperty("isRehire")
    private String isRehire;
    @JsonProperty("currentStatus")
    private String currentStatus;
    @JsonProperty("currentStatusDescription")
    private String currentStatusDescription;
    @JsonProperty("currentStatusReasonDescription")
    private String currentStatusReasonDescription;
    @JsonProperty("activeInactiveStatus")
    private String activeInactiveStatus;
    @JsonProperty("detailedStatus")
    private String detailedStatus;
    @JsonProperty("statusCode")
    private String statusCode;
    @JsonProperty("employerPhoneNumber")
    private String employerPhoneNumber;
    @JsonProperty("employmentStatusCode")
    private String employmentStatusCode;
    @JsonProperty("isLeader")
    private boolean isLeader;
    @JsonProperty("paidCountryName")
    private String paidCountryName;
    @JsonProperty("totalReward")
    private String totalReward;
    @JsonProperty("timeReportingType")
    private String timeReportingType;
    @JsonProperty("scheduleId")
    private String scheduleId;
    @JsonProperty("workSchedule")
    private String workSchedule;
    @JsonProperty("workShift")
    private String workShift;
    @JsonProperty("positionId")
    private String positionId;
    @JsonProperty("accessCardId")
    private String accessCardId;
    
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    
    @JsonProperty("accessCardId")
	public String getAccessCardId() {
		return accessCardId;
	}
    
    @JsonProperty("accessCardId")
	public void setAccessCardId(String accessCardId) {
		this.accessCardId = accessCardId;
	}

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

    @JsonProperty("genderName")
    public String getGenderName() {
        return genderName;
    }

    @JsonProperty("genderName")
    public void setGenderName(String genderName) {
        this.genderName = genderName;
    }

    @JsonProperty("dateOfBirth")
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    @JsonProperty("dateOfBirth")
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @JsonProperty("staffingEventDate")
    public String getStaffingEventDate() {
        return staffingEventDate;
    }

    @JsonProperty("staffingEventDate")
    public void setStaffingEventDate(String staffingEventDate) {
        this.staffingEventDate = staffingEventDate;
    }

    @JsonProperty("staffingEvent")
    public String getStaffingEvent() {
        return staffingEvent;
    }

    @JsonProperty("staffingEvent")
    public void setStaffingEvent(String staffingEvent) {
        this.staffingEvent = staffingEvent;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("isActive")
    public String getIsActive() {
        return isActive;
    }

    @JsonProperty("isActive")
    public void setIsActive(String isActive) {
        this.isActive = isActive;
    }

    @JsonProperty("activeStatusDate")
    public String getActiveStatusDate() {
        return activeStatusDate;
    }

    @JsonProperty("activeStatusDate")
    public void setActiveStatusDate(String activeStatusDate) {
        this.activeStatusDate = activeStatusDate;
    }

    @JsonProperty("hireDate")
    public String getHireDate() {
        return hireDate;
    }

    @JsonProperty("hireDate")
    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }

    @JsonProperty("originalHireDate")
    public String getOriginalHireDate() {
        return originalHireDate;
    }

    @JsonProperty("originalHireDate")
    public void setOriginalHireDate(String originalHireDate) {
        this.originalHireDate = originalHireDate;
    }

    @JsonProperty("hireReason")
    public String getHireReason() {
        return hireReason;
    }

    @JsonProperty("hireReason")
    public void setHireReason(String hireReason) {
        this.hireReason = hireReason;
    }

    @JsonProperty("employmentStartDate")
    public String getEmploymentStartDate() {
        return employmentStartDate;
    }

    @JsonProperty("employmentStartDate")
    public void setEmploymentStartDate(String employmentStartDate) {
        this.employmentStartDate = employmentStartDate;
    }

    @JsonProperty("isRetired")
    public String getIsRetired() {
        return isRetired;
    }

    @JsonProperty("isRetired")
    public void setIsRetired(String isRetired) {
        this.isRetired = isRetired;
    }

    @JsonProperty("seniorityDate")
    public String getSeniorityDate() {
        return seniorityDate;
    }

    @JsonProperty("seniorityDate")
    public void setSeniorityDate(String seniorityDate) {
        this.seniorityDate = seniorityDate;
    }

    @JsonProperty("isTerminated")
    public String getIsTerminated() {
        return isTerminated;
    }

    @JsonProperty("isTerminated")
    public void setIsTerminated(String isTerminated) {
        this.isTerminated = isTerminated;
    }

    @JsonProperty("terminationDate")
    public String getTerminationDate() {
        return terminationDate;
    }

    @JsonProperty("terminationDate")
    public void setTerminationDate(String terminationDate) {
        this.terminationDate = terminationDate;
    }

    @JsonProperty("isHireRescinded")
    public String getIsHireRescinded() {
        return isHireRescinded;
    }

    @JsonProperty("isHireRescinded")
    public void setIsHireRescinded(String isHireRescinded) {
        this.isHireRescinded = isHireRescinded;
    }

    @JsonProperty("lastDayOfWork")
    public String getLastDayOfWork() {
        return lastDayOfWork;
    }

    @JsonProperty("lastDayOfWork")
    public void setLastDayOfWork(String lastDayOfWork) {
        this.lastDayOfWork = lastDayOfWork;
    }

    @JsonProperty("hasInternationalAssignment")
    public String getHasInternationalAssignment() {
        return hasInternationalAssignment;
    }

    @JsonProperty("hasInternationalAssignment")
    public void setHasInternationalAssignment(String hasInternationalAssignment) {
        this.hasInternationalAssignment = hasInternationalAssignment;
    }

    @JsonProperty("countryName")
    public String getCountryName() {
        return countryName;
    }

    @JsonProperty("countryName")
    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    @JsonProperty("isRehire")
    public String getIsRehire() {
        return isRehire;
    }

    @JsonProperty("isRehire")
    public void setIsRehire(String isRehire) {
        this.isRehire = isRehire;
    }

    @JsonProperty("currentStatus")
    public String getCurrentStatus() {
        return currentStatus;
    }

    @JsonProperty("currentStatus")
    public void setCurrentStatus(String currentStatus) {
        this.currentStatus = currentStatus;
    }

    @JsonProperty("currentStatusDescription")
    public String getCurrentStatusDescription() {
        return currentStatusDescription;
    }

    @JsonProperty("currentStatusDescription")
    public void setCurrentStatusDescription(String currentStatusDescription) {
        this.currentStatusDescription = currentStatusDescription;
    }

    @JsonProperty("currentStatusReasonDescription")
    public String getCurrentStatusReasonDescription() {
        return currentStatusReasonDescription;
    }

    @JsonProperty("currentStatusReasonDescription")
    public void setCurrentStatusReasonDescription(String currentStatusReasonDescription) {
        this.currentStatusReasonDescription = currentStatusReasonDescription;
    }

    @JsonProperty("activeInactiveStatus")
    public String getActiveInactiveStatus() {
        return activeInactiveStatus;
    }

    @JsonProperty("activeInactiveStatus")
    public void setActiveInactiveStatus(String activeInactiveStatus) {
        this.activeInactiveStatus = activeInactiveStatus;
    }

    @JsonProperty("detailedStatus")
    public String getDetailedStatus() {
        return detailedStatus;
    }

    @JsonProperty("detailedStatus")
    public void setDetailedStatus(String detailedStatus) {
        this.detailedStatus = detailedStatus;
    }

    @JsonProperty("statusCode")
    public String getStatusCode() {
        return statusCode;
    }

    @JsonProperty("statusCode")
    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    @JsonProperty("employerPhoneNumber")
    public String getEmployerPhoneNumber() {
        return employerPhoneNumber;
    }

    @JsonProperty("employerPhoneNumber")
    public void setEmployerPhoneNumber(String employerPhoneNumber) {
        this.employerPhoneNumber = employerPhoneNumber;
    }

    @JsonProperty("employmentStatusCode")
    public String getEmploymentStatusCode() {
        return employmentStatusCode;
    }

    @JsonProperty("employmentStatusCode")
    public void setEmploymentStatusCode(String employmentStatusCode) {
        this.employmentStatusCode = employmentStatusCode;
    }

    @JsonProperty("isLeader")
    public boolean getIsLeader() {
        return isLeader;
    }

    @JsonProperty("isLeader")
    public void setIsLeader(boolean isLeader) {
        this.isLeader = isLeader;
    }

    @JsonProperty("paidCountryName")
    public String getPaidCountryName() {
        return paidCountryName;
    }

    @JsonProperty("paidCountryName")
    public void setPaidCountryName(String paidCountryName) {
        this.paidCountryName = paidCountryName;
    }

    @JsonProperty("totalReward")
    public String getTotalReward() {
        return totalReward;
    }

    @JsonProperty("totalReward")
    public void setTotalReward(String totalReward) {
        this.totalReward = totalReward;
    }

    @JsonProperty("timeReportingType")
    public String getTimeReportingType() {
        return timeReportingType;
    }

    @JsonProperty("timeReportingType")
    public void setTimeReportingType(String timeReportingType) {
        this.timeReportingType = timeReportingType;
    }

    @JsonProperty("scheduleId")
    public String getScheduleId() {
        return scheduleId;
    }

    @JsonProperty("scheduleId")
    public void setScheduleId(String scheduleId) {
        this.scheduleId = scheduleId;
    }

    @JsonProperty("workSchedule")
    public String getWorkSchedule() {
        return workSchedule;
    }

    @JsonProperty("workSchedule")
    public void setWorkSchedule(String workSchedule) {
        this.workSchedule = workSchedule;
    }

    @JsonProperty("workShift")
    public String getWorkShift() {
        return workShift;
    }

    @JsonProperty("workShift")
    public void setWorkShift(String workShift) {
        this.workShift = workShift;
    }

    @JsonProperty("positionId")
    public String getPositionId() {
        return positionId;
    }

    @JsonProperty("positionId")
    public void setPositionId(String positionId) {
        this.positionId = positionId;
    }
	
	public void setLeader(boolean isLeader) {
		this.isLeader = isLeader;
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
