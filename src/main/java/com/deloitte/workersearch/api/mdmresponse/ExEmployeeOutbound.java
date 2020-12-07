package com.deloitte.workersearch.api.mdmresponse;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ExEmployeeOutbound {
	    public List<Link> link;
	    public String rowidObject;
	    public String label;
	    @JsonProperty("ExEmployeeId") 
	    public String exEmployeeId;
	    @JsonProperty("ExEmployeeName") 
	    public String exEmployeeName;
	    @JsonProperty("ExEmploymentStatus") 
	    public ExEmploymentStatus exEmploymentStatus;
	    @JsonProperty("ExHireDt") 
	    public String exHireDt;
	    @JsonProperty("ExSeniorityDt") 
	    public String exSeniorityDt;
	    @JsonProperty("ExEndEmploymentDt") 
	    public String exEndEmploymentDt;
	    @JsonProperty("ExEmploymentTyp") 
	    public ExEmploymentTyp exEmploymentTyp;
	    @JsonProperty("ExLeaderFlg") 
	    public ExLeaderFlg exLeaderFlg;
	    @JsonProperty("ExPaidCountryNm") 
	    public String exPaidCountryNm;
	    @JsonProperty("ExworkShift") 
	    public ExworkShift exworkShift;
	    @JsonProperty("ExWorkScheduleType") 
	    public ExWorkScheduleType exWorkScheduleType;
	    @JsonProperty("ExCompanyCd") 
	    public ExCompanyCd exCompanyCd;
	    @JsonProperty("ExWorkerTimeType") 
	    public ExWorkerTimeType exWorkerTimeType;
	    @JsonProperty("ExContractorVendorCd") 
	    public String exContractorVendorCd;
	    @JsonProperty("ExContractorVendorNm") 
	    public String exContractorVendorNm;
	    @JsonProperty("ExServiceMasterId") 
	    public String exServiceMasterId;
	    @JsonProperty("ExServiceMasterDesc") 
	    public String exServiceMasterDesc;
	    @JsonProperty("ExWorkCenter") 
	    public String exWorkCenter;
	    @JsonProperty("ExSiteBan") 
	    public String exSiteBan;
	    @JsonProperty("ExPayRateType") 
	    public ExPayRateType exPayRateType;
	    @JsonProperty("ExWorkHourProfile") 
	    public ExWorkHourProfile exWorkHourProfile;
	    @JsonProperty("ExDefaultWeeklyHours") 
	    public ExDefaultWeeklyHours exDefaultWeeklyHours;
	    @JsonProperty("ExScheduledWeeklyHours") 
	    public ExScheduledWeeklyHours exScheduledWeeklyHours;
	    @JsonProperty("ExCountryName") 
	    public ExCountryName exCountryName;
	    @JsonProperty("ExPhoneNumber") 
	    public String exPhoneNumber;
	    @JsonProperty("ExOriginalHireDate") 
	    public String exOriginalHireDate;
	    @JsonProperty("ExPositionId") 
	    public String exPositionId;
	    @JsonProperty("ExPartyIdentificationAccessId_1_rowidObject")
	    public String exPartyIdentificationAccessId_1_rowidObject;
	    @JsonProperty("ExPartyLocation_1_ExLocation_ExAddress_rowidObject") 
	    public String exPartyLocation_1_ExLocation_ExAddress_rowidObject;
	    @JsonProperty("ExPartyEmploymentPosition_1_ExPosition_rowidObject") 
	    public String exPartyEmploymentPosition_1_ExPosition_rowidObject;
	    @JsonProperty("ExPartyLocation_1_rowidObject") 
	    public String exPartyLocation_1_rowidObject;
	    @JsonProperty("ExPartyIdentification_1_rowidObject") 
	    public String exPartyIdentification_1_rowidObject;
	    @JsonProperty("ExPartyEmployment_1_rowidObject") 
	    public String exPartyEmployment_1_rowidObject;
	    @JsonProperty("ExPartyEmploymentPosition_1_rowidObject") 
	    public String exPartyEmploymentPosition_1_rowidObject;
	    @JsonProperty("ExPartyLocation_1_ExLocation_rowidObject") 
	    public String exPartyLocation_1_ExLocation_rowidObject;
	    @JsonProperty("ExPartyPhoneCommunication_1_rowidObject") 
	    public String exPartyPhoneCommunication_1_rowidObject;
	    @JsonProperty("ExAlternateName") 
	    public ExAlternateName exAlternateName;
	    @JsonProperty("ExPhone") 
	    public ExPhone exPhone;
	    @JsonProperty("ExEmail") 
	    public ExEmail exEmail;
	    @JsonProperty("ExAddress") 
	    public ExAddress exAddress;
	    @JsonProperty("ExSupervisorDetails") 
	    public ExSupervisorDetails exSupervisorDetails;
	    @JsonProperty("ExLocation") 
	    public ExLocation exLocation;
	    @JsonProperty("ExOrganization") 
	    public ExOrganization exOrganization;
	    @JsonProperty("ExJob") 
	    public ExJob exJob;
	    @JsonProperty("ExPosition") 
	    public ExPosition exPosition;
	    @JsonProperty("ExFirstName")
	    public String exFirstName;
	    @JsonProperty("ExMiddleName")
	    public String exMiddleName;
	    @JsonProperty("ExLastName")
	    public String exLastName;
	    @JsonProperty("ExAccessCardId")
	    public String exAccessCardId;
	    
	   
		public String getExPartyIdentificationAccessId_1_rowidObject() {
			return exPartyIdentificationAccessId_1_rowidObject;
		}
		public void setExPartyIdentificationAccessId_1_rowidObject(String exPartyIdentificationAccessId_1_rowidObject) {
			this.exPartyIdentificationAccessId_1_rowidObject = exPartyIdentificationAccessId_1_rowidObject;
		}
		public String getExFirstName() {
			return exFirstName;
		}
		public void setExFirstName(String exFirstName) {
			this.exFirstName = exFirstName;
		}
		public String getExMiddleName() {
			return exMiddleName;
		}
		public void setExMiddleName(String exMiddleName) {
			this.exMiddleName = exMiddleName;
		}
		public String getExLastName() {
			return exLastName;
		}
		public void setExLastName(String exLastName) {
			this.exLastName = exLastName;
		}
		public String getExAccessCardId() {
			return exAccessCardId;
		}
		public void setExAccessCardId(String exAccessCardId) {
			this.exAccessCardId = exAccessCardId;
		}
		public List<Link> getLink() {
			return link;
		}
		public void setLink(List<Link> link) {
			this.link = link;
		}
		public String getRowidObject() {
			return rowidObject;
		}
		public void setRowidObject(String rowidObject) {
			this.rowidObject = rowidObject;
		}
		public String getLabel() {
			return label;
		}
		public void setLabel(String label) {
			this.label = label;
		}
		public String getExEmployeeId() {
			return exEmployeeId;
		}
		public void setExEmployeeId(String exEmployeeId) {
			this.exEmployeeId = exEmployeeId;
		}
		public String getExEmployeeName() {
			return exEmployeeName;
		}
		public void setExEmployeeName(String exEmployeeName) {
			this.exEmployeeName = exEmployeeName;
		}
		public ExEmploymentStatus getExEmploymentStatus() {
			return exEmploymentStatus;
		}
		public void setExEmploymentStatus(ExEmploymentStatus exEmploymentStatus) {
			this.exEmploymentStatus = exEmploymentStatus;
		}
		public String getExHireDt() {
			return exHireDt;
		}
		public void setExHireDt(String exHireDt) {
			this.exHireDt = exHireDt;
		}
		public String getExSeniorityDt() {
			return exSeniorityDt;
		}
		public void setExSeniorityDt(String exSeniorityDt) {
			this.exSeniorityDt = exSeniorityDt;
		}
		public String getExEndEmploymentDt() {
			return exEndEmploymentDt;
		}
		public void setExEndEmploymentDt(String exEndEmploymentDt) {
			this.exEndEmploymentDt = exEndEmploymentDt;
		}
		public ExEmploymentTyp getExEmploymentTyp() {
			return exEmploymentTyp;
		}
		public void setExEmploymentTyp(ExEmploymentTyp exEmploymentTyp) {
			this.exEmploymentTyp = exEmploymentTyp;
		}
		public ExLeaderFlg getExLeaderFlg() {
			return exLeaderFlg;
		}
		public void setExLeaderFlg(ExLeaderFlg exLeaderFlg) {
			this.exLeaderFlg = exLeaderFlg;
		}
		public String getExPaidCountryNm() {
			return exPaidCountryNm;
		}
		public void setExPaidCountryNm(String exPaidCountryNm) {
			this.exPaidCountryNm = exPaidCountryNm;
		}
		public ExworkShift getExworkShift() {
			return exworkShift;
		}
		public void setExworkShift(ExworkShift exworkShift) {
			this.exworkShift = exworkShift;
		}
		public ExWorkScheduleType getExWorkScheduleType() {
			return exWorkScheduleType;
		}
		public void setExWorkScheduleType(ExWorkScheduleType exWorkScheduleType) {
			this.exWorkScheduleType = exWorkScheduleType;
		}
		public ExCompanyCd getExCompanyCd() {
			return exCompanyCd;
		}
		public void setExCompanyCd(ExCompanyCd exCompanyCd) {
			this.exCompanyCd = exCompanyCd;
		}
		public ExWorkerTimeType getExWorkerTimeType() {
			return exWorkerTimeType;
		}
		public void setExWorkerTimeType(ExWorkerTimeType exWorkerTimeType) {
			this.exWorkerTimeType = exWorkerTimeType;
		}
		public String getExContractorVendorCd() {
			return exContractorVendorCd;
		}
		public void setExContractorVendorCd(String exContractorVendorCd) {
			this.exContractorVendorCd = exContractorVendorCd;
		}
		public String getExContractorVendorNm() {
			return exContractorVendorNm;
		}
		public void setExContractorVendorNm(String exContractorVendorNm) {
			this.exContractorVendorNm = exContractorVendorNm;
		}
		public String getExServiceMasterId() {
			return exServiceMasterId;
		}
		public void setExServiceMasterId(String exServiceMasterId) {
			this.exServiceMasterId = exServiceMasterId;
		}
		public String getExServiceMasterDesc() {
			return exServiceMasterDesc;
		}
		public void setExServiceMasterDesc(String exServiceMasterDesc) {
			this.exServiceMasterDesc = exServiceMasterDesc;
		}
		public String getExWorkCenter() {
			return exWorkCenter;
		}
		public void setExWorkCenter(String exWorkCenter) {
			this.exWorkCenter = exWorkCenter;
		}
		public String getExSiteBan() {
			return exSiteBan;
		}
		public void setExSiteBan(String exSiteBan) {
			this.exSiteBan = exSiteBan;
		}
		public ExPayRateType getExPayRateType() {
			return exPayRateType;
		}
		public void setExPayRateType(ExPayRateType exPayRateType) {
			this.exPayRateType = exPayRateType;
		}
		public ExWorkHourProfile getExWorkHourProfile() {
			return exWorkHourProfile;
		}
		public void setExWorkHourProfile(ExWorkHourProfile exWorkHourProfile) {
			this.exWorkHourProfile = exWorkHourProfile;
		}
		public ExDefaultWeeklyHours getExDefaultWeeklyHours() {
			return exDefaultWeeklyHours;
		}
		public void setExDefaultWeeklyHours(ExDefaultWeeklyHours exDefaultWeeklyHours) {
			this.exDefaultWeeklyHours = exDefaultWeeklyHours;
		}
		public ExScheduledWeeklyHours getExScheduledWeeklyHours() {
			return exScheduledWeeklyHours;
		}
		public void setExScheduledWeeklyHours(ExScheduledWeeklyHours exScheduledWeeklyHours) {
			this.exScheduledWeeklyHours = exScheduledWeeklyHours;
		}
		public ExCountryName getExCountryName() {
			return exCountryName;
		}
		public void setExCountryName(ExCountryName exCountryName) {
			this.exCountryName = exCountryName;
		}
		public String getExPhoneNumber() {
			return exPhoneNumber;
		}
		public void setExPhoneNumber(String exPhoneNumber) {
			this.exPhoneNumber = exPhoneNumber;
		}
		public String getExOriginalHireDate() {
			return exOriginalHireDate;
		}
		public void setExOriginalHireDate(String exOriginalHireDate) {
			this.exOriginalHireDate = exOriginalHireDate;
		}
		public String getExPositionId() {
			return exPositionId;
		}
		public void setExPositionId(String exPositionId) {
			this.exPositionId = exPositionId;
		}
		public String getExPartyLocation_1_ExLocation_ExAddress_rowidObject() {
			return exPartyLocation_1_ExLocation_ExAddress_rowidObject;
		}
		public void setExPartyLocation_1_ExLocation_ExAddress_rowidObject(
				String exPartyLocation_1_ExLocation_ExAddress_rowidObject) {
			this.exPartyLocation_1_ExLocation_ExAddress_rowidObject = exPartyLocation_1_ExLocation_ExAddress_rowidObject;
		}
		public String getExPartyEmploymentPosition_1_ExPosition_rowidObject() {
			return exPartyEmploymentPosition_1_ExPosition_rowidObject;
		}
		public void setExPartyEmploymentPosition_1_ExPosition_rowidObject(
				String exPartyEmploymentPosition_1_ExPosition_rowidObject) {
			this.exPartyEmploymentPosition_1_ExPosition_rowidObject = exPartyEmploymentPosition_1_ExPosition_rowidObject;
		}
		public String getExPartyLocation_1_rowidObject() {
			return exPartyLocation_1_rowidObject;
		}
		public void setExPartyLocation_1_rowidObject(String exPartyLocation_1_rowidObject) {
			this.exPartyLocation_1_rowidObject = exPartyLocation_1_rowidObject;
		}
		public String getExPartyIdentification_1_rowidObject() {
			return exPartyIdentification_1_rowidObject;
		}
		public void setExPartyIdentification_1_rowidObject(String exPartyIdentification_1_rowidObject) {
			this.exPartyIdentification_1_rowidObject = exPartyIdentification_1_rowidObject;
		}
		public String getExPartyEmployment_1_rowidObject() {
			return exPartyEmployment_1_rowidObject;
		}
		public void setExPartyEmployment_1_rowidObject(String exPartyEmployment_1_rowidObject) {
			this.exPartyEmployment_1_rowidObject = exPartyEmployment_1_rowidObject;
		}
		public String getExPartyEmploymentPosition_1_rowidObject() {
			return exPartyEmploymentPosition_1_rowidObject;
		}
		public void setExPartyEmploymentPosition_1_rowidObject(String exPartyEmploymentPosition_1_rowidObject) {
			this.exPartyEmploymentPosition_1_rowidObject = exPartyEmploymentPosition_1_rowidObject;
		}
		public String getExPartyLocation_1_ExLocation_rowidObject() {
			return exPartyLocation_1_ExLocation_rowidObject;
		}
		public void setExPartyLocation_1_ExLocation_rowidObject(String exPartyLocation_1_ExLocation_rowidObject) {
			this.exPartyLocation_1_ExLocation_rowidObject = exPartyLocation_1_ExLocation_rowidObject;
		}
		public String getExPartyPhoneCommunication_1_rowidObject() {
			return exPartyPhoneCommunication_1_rowidObject;
		}
		public void setExPartyPhoneCommunication_1_rowidObject(String exPartyPhoneCommunication_1_rowidObject) {
			this.exPartyPhoneCommunication_1_rowidObject = exPartyPhoneCommunication_1_rowidObject;
		}
		public ExAlternateName getExAlternateName() {
			return exAlternateName;
		}
		public void setExAlternateName(ExAlternateName exAlternateName) {
			this.exAlternateName = exAlternateName;
		}
		public ExPhone getExPhone() {
			return exPhone;
		}
		public void setExPhone(ExPhone exPhone) {
			this.exPhone = exPhone;
		}
		public ExEmail getExEmail() {
			return exEmail;
		}
		public void setExEmail(ExEmail exEmail) {
			this.exEmail = exEmail;
		}
		public ExAddress getExAddress() {
			return exAddress;
		}
		public void setExAddress(ExAddress exAddress) {
			this.exAddress = exAddress;
		}
		public ExSupervisorDetails getExSupervisorDetails() {
			return exSupervisorDetails;
		}
		public void setExSupervisorDetails(ExSupervisorDetails exSupervisorDetails) {
			this.exSupervisorDetails = exSupervisorDetails;
		}
		public ExLocation getExLocation() {
			return exLocation;
		}
		public void setExLocation(ExLocation exLocation) {
			this.exLocation = exLocation;
		}
		public ExOrganization getExOrganization() {
			return exOrganization;
		}
		public void setExOrganization(ExOrganization exOrganization) {
			this.exOrganization = exOrganization;
		}
		public ExJob getExJob() {
			return exJob;
		}
		public void setExJob(ExJob exJob) {
			this.exJob = exJob;
		}
		public ExPosition getExPosition() {
			return exPosition;
		}
		public void setExPosition(ExPosition exPosition) {
			this.exPosition = exPosition;
		}
	    
	    

}
