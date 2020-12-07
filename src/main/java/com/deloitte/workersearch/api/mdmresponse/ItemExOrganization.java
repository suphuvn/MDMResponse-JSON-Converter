package com.deloitte.workersearch.api.mdmresponse;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ItemExOrganization {
	 public String rowidObject;
	    public String label;
	    @JsonProperty("ExOrganizationRefId") 
	    public String exOrganizationRefId;
	    @JsonProperty("ExOrganizatinNm") 
	    public String exOrganizatinNm;
	    @JsonProperty("ExLastEffctvChngDt") 
	    public String exLastEffctvChngDt;
	    @JsonProperty("ExOrganizationCd") 
	    public String exOrganizationCd;
	    @JsonProperty("ExOrganizationStatus") 
	    public ExOrganizationStatus exOrganizationStatus;
	    @JsonProperty("ExOrganizationTyp") 
	    public ExOrganizationTyp exOrganizationTyp;
	    @JsonProperty("ExOrganizationSubTyp") 
	    public ExOrganizationSubTyp exOrganizationSubTyp;
	    @JsonProperty("ExOrganizationStartDt") 
	    public String exOrganizationStartDt;
	    @JsonProperty("ExSupervisoryOrgNm") 
	    public String exSupervisoryOrgNm;
	    @JsonProperty("ExOrganizationMgr") 
	    public String exOrganizationMgr;
	    @JsonProperty("ExOrgDetails_ExOrg_1_rowidObject") 
	    public String exOrgDetails_ExOrg_1_rowidObject;
	    @JsonProperty("ExOrgDetails_rowidObject") 
	    public String exOrgDetails_rowidObject;
	    @JsonProperty("ExOrgDetails_ExManagerDetails_1_rowidObject") 
	    public String exOrgDetails_ExManagerDetails_1_rowidObject;
	    @JsonProperty("ExOrgDetails_ExSupervisoryOrg_1_ExSupervisoryOrgDetails_rowidObject") 
	    public String exOrgDetails_ExSupervisoryOrg_1_ExSupervisoryOrgDetails_rowidObject;
	    @JsonProperty("ExOrgDetails_ExSupervisoryOrg_1_rowidObject") 
	    public String exOrgDetails_ExSupervisoryOrg_1_rowidObject;
	    @JsonProperty("ExOrgDetails_ExManagerDetails_1_ExManager_rowidObject") 
	    public String exOrgDetails_ExManagerDetails_1_ExManager_rowidObject;
	    @JsonProperty("ExOrgDetails_ExManagerDetails_1_ExManager_ExWorker_1_rowidObject") 
	    public String exOrgDetails_ExManagerDetails_1_ExManager_ExWorker_1_rowidObject;
	    @JsonProperty("ExOrgDetails_ExSupervisoryOrg_1_ExSupervisoryOrgDetails_ExSupervisoryOrgDetails_1_rowidObject") 
	    public String exOrgDetails_ExSupervisoryOrg_1_ExSupervisoryOrgDetails_ExSupervisoryOrgDetails_1_rowidObject;
	    @JsonProperty("ExOrganizationManagerName") 
	    public String exOrganizationManagerName;
	    
	    
		
	    public String getExOrganizationManagerName() {
			return exOrganizationManagerName;
		}
		public void setExOrganizationManagerName(String exOrganizationManagerName) {
			this.exOrganizationManagerName = exOrganizationManagerName;
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
		public String getExOrganizationRefId() {
			return exOrganizationRefId;
		}
		public void setExOrganizationRefId(String exOrganizationRefId) {
			this.exOrganizationRefId = exOrganizationRefId;
		}
		public String getExOrganizatinNm() {
			return exOrganizatinNm;
		}
		public void setExOrganizatinNm(String exOrganizatinNm) {
			this.exOrganizatinNm = exOrganizatinNm;
		}
		public String getExLastEffctvChngDt() {
			return exLastEffctvChngDt;
		}
		public void setExLastEffctvChngDt(String exLastEffctvChngDt) {
			this.exLastEffctvChngDt = exLastEffctvChngDt;
		}
		public String getExOrganizationCd() {
			return exOrganizationCd;
		}
		public void setExOrganizationCd(String exOrganizationCd) {
			this.exOrganizationCd = exOrganizationCd;
		}
		public ExOrganizationStatus getExOrganizationStatus() {
			return exOrganizationStatus;
		}
		public void setExOrganizationStatus(ExOrganizationStatus exOrganizationStatus) {
			this.exOrganizationStatus = exOrganizationStatus;
		}
		public ExOrganizationTyp getExOrganizationTyp() {
			return exOrganizationTyp;
		}
		public void setExOrganizationTyp(ExOrganizationTyp exOrganizationTyp) {
			this.exOrganizationTyp = exOrganizationTyp;
		}
		public ExOrganizationSubTyp getExOrganizationSubTyp() {
			return exOrganizationSubTyp;
		}
		public void setExOrganizationSubTyp(ExOrganizationSubTyp exOrganizationSubTyp) {
			this.exOrganizationSubTyp = exOrganizationSubTyp;
		}
		public String getExOrganizationStartDt() {
			return exOrganizationStartDt;
		}
		public void setExOrganizationStartDt(String exOrganizationStartDt) {
			this.exOrganizationStartDt = exOrganizationStartDt;
		}
		public String getExSupervisoryOrgNm() {
			return exSupervisoryOrgNm;
		}
		public void setExSupervisoryOrgNm(String exSupervisoryOrgNm) {
			this.exSupervisoryOrgNm = exSupervisoryOrgNm;
		}
		public String getExOrganizationMgr() {
			return exOrganizationMgr;
		}
		public void setExOrganizationMgr(String exOrganizationMgr) {
			this.exOrganizationMgr = exOrganizationMgr;
		}
		public String getExOrgDetails_ExOrg_1_rowidObject() {
			return exOrgDetails_ExOrg_1_rowidObject;
		}
		public void setExOrgDetails_ExOrg_1_rowidObject(String exOrgDetails_ExOrg_1_rowidObject) {
			this.exOrgDetails_ExOrg_1_rowidObject = exOrgDetails_ExOrg_1_rowidObject;
		}
		public String getExOrgDetails_rowidObject() {
			return exOrgDetails_rowidObject;
		}
		public void setExOrgDetails_rowidObject(String exOrgDetails_rowidObject) {
			this.exOrgDetails_rowidObject = exOrgDetails_rowidObject;
		}
		public String getExOrgDetails_ExManagerDetails_1_rowidObject() {
			return exOrgDetails_ExManagerDetails_1_rowidObject;
		}
		public void setExOrgDetails_ExManagerDetails_1_rowidObject(String exOrgDetails_ExManagerDetails_1_rowidObject) {
			this.exOrgDetails_ExManagerDetails_1_rowidObject = exOrgDetails_ExManagerDetails_1_rowidObject;
		}
		public String getExOrgDetails_ExSupervisoryOrg_1_ExSupervisoryOrgDetails_rowidObject() {
			return exOrgDetails_ExSupervisoryOrg_1_ExSupervisoryOrgDetails_rowidObject;
		}
		public void setExOrgDetails_ExSupervisoryOrg_1_ExSupervisoryOrgDetails_rowidObject(
				String exOrgDetails_ExSupervisoryOrg_1_ExSupervisoryOrgDetails_rowidObject) {
			this.exOrgDetails_ExSupervisoryOrg_1_ExSupervisoryOrgDetails_rowidObject = exOrgDetails_ExSupervisoryOrg_1_ExSupervisoryOrgDetails_rowidObject;
		}
		public String getExOrgDetails_ExSupervisoryOrg_1_rowidObject() {
			return exOrgDetails_ExSupervisoryOrg_1_rowidObject;
		}
		public void setExOrgDetails_ExSupervisoryOrg_1_rowidObject(String exOrgDetails_ExSupervisoryOrg_1_rowidObject) {
			this.exOrgDetails_ExSupervisoryOrg_1_rowidObject = exOrgDetails_ExSupervisoryOrg_1_rowidObject;
		}
		public String getExOrgDetails_ExManagerDetails_1_ExManager_rowidObject() {
			return exOrgDetails_ExManagerDetails_1_ExManager_rowidObject;
		}
		public void setExOrgDetails_ExManagerDetails_1_ExManager_rowidObject(
				String exOrgDetails_ExManagerDetails_1_ExManager_rowidObject) {
			this.exOrgDetails_ExManagerDetails_1_ExManager_rowidObject = exOrgDetails_ExManagerDetails_1_ExManager_rowidObject;
		}
		public String getExOrgDetails_ExManagerDetails_1_ExManager_ExWorker_1_rowidObject() {
			return exOrgDetails_ExManagerDetails_1_ExManager_ExWorker_1_rowidObject;
		}
		public void setExOrgDetails_ExManagerDetails_1_ExManager_ExWorker_1_rowidObject(
				String exOrgDetails_ExManagerDetails_1_ExManager_ExWorker_1_rowidObject) {
			this.exOrgDetails_ExManagerDetails_1_ExManager_ExWorker_1_rowidObject = exOrgDetails_ExManagerDetails_1_ExManager_ExWorker_1_rowidObject;
		}
		public String getExOrgDetails_ExSupervisoryOrg_1_ExSupervisoryOrgDetails_ExSupervisoryOrgDetails_1_rowidObject() {
			return exOrgDetails_ExSupervisoryOrg_1_ExSupervisoryOrgDetails_ExSupervisoryOrgDetails_1_rowidObject;
		}
		public void setExOrgDetails_ExSupervisoryOrg_1_ExSupervisoryOrgDetails_ExSupervisoryOrgDetails_1_rowidObject(
				String exOrgDetails_ExSupervisoryOrg_1_ExSupervisoryOrgDetails_ExSupervisoryOrgDetails_1_rowidObject) {
			this.exOrgDetails_ExSupervisoryOrg_1_ExSupervisoryOrgDetails_ExSupervisoryOrgDetails_1_rowidObject = exOrgDetails_ExSupervisoryOrg_1_ExSupervisoryOrgDetails_ExSupervisoryOrgDetails_1_rowidObject;
		}

	    
}
