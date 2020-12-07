package com.deloitte.workersearch.api.mdmresponse;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ItemExPosition {
	 public String rowidObject;
	    public String label;
	    @JsonProperty("ExPositionId") 
	    public String exPositionId;
	    @JsonProperty("ExPositionTitle") 
	    public String exPositionTitle;
	    @JsonProperty("ExPositionSts") 
	    public ExPositionSts exPositionSts;
	    @JsonProperty("ExPositionStartDt") 
	    public String exPositionStartDt;
	    @JsonProperty("ExPositionTimeTyp") 
	    public ExPositionTimeTyp exPositionTimeTyp;
	    @JsonProperty("ExPositionWrkrTyp") 
	    public ExPositionWrkrTyp exPositionWrkrTyp;
	    @JsonProperty("ExCompanyCode") 
	    public ExCompanyCode exCompanyCode;
	    @JsonProperty("ExCostCenterCd") 
	    public String exCostCenterCd;
	    @JsonProperty("ExCostCenterNm") 
	    public String exCostCenterNm;
	    @JsonProperty("ExPositionEmplymntType") 
	    public ExPositionEmplymntType exPositionEmplymntType;
	    @JsonProperty("ExBusinessSite") 
	    public String exBusinessSite;
	    @JsonProperty("ExBusinessSiteCity") 
	    public String exBusinessSiteCity;
	    @JsonProperty("ExBusinessSiteCountry") 
	    public ExBusinessSiteCountry exBusinessSiteCountry;
	    @JsonProperty("ExBusinessSiteName") 
	    public String exBusinessSiteName;
	    @JsonProperty("ExBusinessSitePostalCd") 
	    public String exBusinessSitePostalCd;
	    @JsonProperty("ExBusinessSiteRegion") 
	    public ExBusinessSiteRegion exBusinessSiteRegion;
	    @JsonProperty("ExJobGroupName") 
	    public ExJobGroupName exJobGroupName;
	    @JsonProperty("ExJobManagementLevel") 
	    public ExJobManagementLevel exJobManagementLevel;
	    @JsonProperty("ExJobName") 
	    public String exJobName;
	    @JsonProperty("ExPayRateType") 
	    public ExPayRateType2 exPayRateType;
	    @JsonProperty("ExScheduledWeeklyHours") 
	    public ExScheduledWeeklyHours2 exScheduledWeeklyHours;
	    @JsonProperty("ExOrganizationName") 
	    public String exOrganizationName;
	    @JsonProperty("ExSuperVisoryOrgName") 
	    public String exSuperVisoryOrgName;
	    @JsonProperty("ExSuperVisoryOrgCode") 
	    public String exSuperVisoryOrgCode;
	    @JsonProperty("ExPosition_rowidObject") 
	    public String exPosition_rowidObject;
	    @JsonProperty("ExParty_ExRelatedOrg_1_ExOrgNm_rowidObject") 
	    public String exParty_ExRelatedOrg_1_ExOrgNm_rowidObject;
	    @JsonProperty("ExPosition_ExJobProfile_rowidObject") 
	    public String exPosition_ExJobProfile_rowidObject;
	    @JsonProperty("ExPosition_ExLocation_ExAddress_rowidObject") 
	    public String exPosition_ExLocation_ExAddress_rowidObject;
	    @JsonProperty("ExParty_ExRelatedOrg_1_ExOrgNm_ExSuperiorOrg_1_ExSupervisoryOrgDetails_ExSuperorgDEtails_1_rowidObject") 
	    public String exParty_ExRelatedOrg_1_ExOrgNm_ExSuperiorOrg_1_ExSupervisoryOrgDetails_ExSuperorgDEtails_1_rowidObject;
	    @JsonProperty("ExPosition_ExLocation_rowidObject") 
	    public String exPosition_ExLocation_rowidObject;
	    @JsonProperty("ExParty_rowidObject") 
	    public String exParty_rowidObject;
	    @JsonProperty("ExParty_ExRelatedOrg_1_rowidObject") 
	    public String exParty_ExRelatedOrg_1_rowidObject;
	    @JsonProperty("ExPosition_ExJobProfile_ExJobFamily_rowidObject") 
	    public String exPosition_ExJobProfile_ExJobFamily_rowidObject;
	    @JsonProperty("ExParty_ExRelatedOrg_1_ExOrgNm_ExSuperiorOrg_1_rowidObject") 
	    public String exParty_ExRelatedOrg_1_ExOrgNm_ExSuperiorOrg_1_rowidObject;
	    @JsonProperty("ExParty_ExPartyEmployment_1_rowidObject") 
	    public String exParty_ExPartyEmployment_1_rowidObject;
	    @JsonProperty("ExParty_ExRelatedOrg_1_ExOrgNm_ExSuperiorOrg_1_ExSupervisoryOrgDetails_rowidObject") 
	    public String exParty_ExRelatedOrg_1_ExOrgNm_ExSuperiorOrg_1_ExSupervisoryOrgDetails_rowidObject;
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
		public String getExPositionId() {
			return exPositionId;
		}
		public void setExPositionId(String exPositionId) {
			this.exPositionId = exPositionId;
		}
		public String getExPositionTitle() {
			return exPositionTitle;
		}
		public void setExPositionTitle(String exPositionTitle) {
			this.exPositionTitle = exPositionTitle;
		}
		public ExPositionSts getExPositionSts() {
			return exPositionSts;
		}
		public void setExPositionSts(ExPositionSts exPositionSts) {
			this.exPositionSts = exPositionSts;
		}
		public String getExPositionStartDt() {
			return exPositionStartDt;
		}
		public void setExPositionStartDt(String exPositionStartDt) {
			this.exPositionStartDt = exPositionStartDt;
		}
		public ExPositionTimeTyp getExPositionTimeTyp() {
			return exPositionTimeTyp;
		}
		public void setExPositionTimeTyp(ExPositionTimeTyp exPositionTimeTyp) {
			this.exPositionTimeTyp = exPositionTimeTyp;
		}
		public ExPositionWrkrTyp getExPositionWrkrTyp() {
			return exPositionWrkrTyp;
		}
		public void setExPositionWrkrTyp(ExPositionWrkrTyp exPositionWrkrTyp) {
			this.exPositionWrkrTyp = exPositionWrkrTyp;
		}
		public ExCompanyCode getExCompanyCode() {
			return exCompanyCode;
		}
		public void setExCompanyCode(ExCompanyCode exCompanyCode) {
			this.exCompanyCode = exCompanyCode;
		}
		public String getExCostCenterCd() {
			return exCostCenterCd;
		}
		public void setExCostCenterCd(String exCostCenterCd) {
			this.exCostCenterCd = exCostCenterCd;
		}
		public String getExCostCenterNm() {
			return exCostCenterNm;
		}
		public void setExCostCenterNm(String exCostCenterNm) {
			this.exCostCenterNm = exCostCenterNm;
		}
		public ExPositionEmplymntType getExPositionEmplymntType() {
			return exPositionEmplymntType;
		}
		public void setExPositionEmplymntType(ExPositionEmplymntType exPositionEmplymntType) {
			this.exPositionEmplymntType = exPositionEmplymntType;
		}
		public String getExBusinessSite() {
			return exBusinessSite;
		}
		public void setExBusinessSite(String exBusinessSite) {
			this.exBusinessSite = exBusinessSite;
		}
		public String getExBusinessSiteCity() {
			return exBusinessSiteCity;
		}
		public void setExBusinessSiteCity(String exBusinessSiteCity) {
			this.exBusinessSiteCity = exBusinessSiteCity;
		}
		public ExBusinessSiteCountry getExBusinessSiteCountry() {
			return exBusinessSiteCountry;
		}
		public void setExBusinessSiteCountry(ExBusinessSiteCountry exBusinessSiteCountry) {
			this.exBusinessSiteCountry = exBusinessSiteCountry;
		}
		public String getExBusinessSiteName() {
			return exBusinessSiteName;
		}
		public void setExBusinessSiteName(String exBusinessSiteName) {
			this.exBusinessSiteName = exBusinessSiteName;
		}
		public String getExBusinessSitePostalCd() {
			return exBusinessSitePostalCd;
		}
		public void setExBusinessSitePostalCd(String exBusinessSitePostalCd) {
			this.exBusinessSitePostalCd = exBusinessSitePostalCd;
		}
		public ExBusinessSiteRegion getExBusinessSiteRegion() {
			return exBusinessSiteRegion;
		}
		public void setExBusinessSiteRegion(ExBusinessSiteRegion exBusinessSiteRegion) {
			this.exBusinessSiteRegion = exBusinessSiteRegion;
		}
		public ExJobGroupName getExJobGroupName() {
			return exJobGroupName;
		}
		public void setExJobGroupName(ExJobGroupName exJobGroupName) {
			this.exJobGroupName = exJobGroupName;
		}
		public ExJobManagementLevel getExJobManagementLevel() {
			return exJobManagementLevel;
		}
		public void setExJobManagementLevel(ExJobManagementLevel exJobManagementLevel) {
			this.exJobManagementLevel = exJobManagementLevel;
		}
		public String getExJobName() {
			return exJobName;
		}
		public void setExJobName(String exJobName) {
			this.exJobName = exJobName;
		}
		public ExPayRateType2 getExPayRateType() {
			return exPayRateType;
		}
		public void setExPayRateType(ExPayRateType2 exPayRateType) {
			this.exPayRateType = exPayRateType;
		}
		public ExScheduledWeeklyHours2 getExScheduledWeeklyHours() {
			return exScheduledWeeklyHours;
		}
		public void setExScheduledWeeklyHours(ExScheduledWeeklyHours2 exScheduledWeeklyHours) {
			this.exScheduledWeeklyHours = exScheduledWeeklyHours;
		}
		public String getExOrganizationName() {
			return exOrganizationName;
		}
		public void setExOrganizationName(String exOrganizationName) {
			this.exOrganizationName = exOrganizationName;
		}
		public String getExSuperVisoryOrgName() {
			return exSuperVisoryOrgName;
		}
		public void setExSuperVisoryOrgName(String exSuperVisoryOrgName) {
			this.exSuperVisoryOrgName = exSuperVisoryOrgName;
		}
		public String getExSuperVisoryOrgCode() {
			return exSuperVisoryOrgCode;
		}
		public void setExSuperVisoryOrgCode(String exSuperVisoryOrgCode) {
			this.exSuperVisoryOrgCode = exSuperVisoryOrgCode;
		}
		public String getExPosition_rowidObject() {
			return exPosition_rowidObject;
		}
		public void setExPosition_rowidObject(String exPosition_rowidObject) {
			this.exPosition_rowidObject = exPosition_rowidObject;
		}
		public String getExParty_ExRelatedOrg_1_ExOrgNm_rowidObject() {
			return exParty_ExRelatedOrg_1_ExOrgNm_rowidObject;
		}
		public void setExParty_ExRelatedOrg_1_ExOrgNm_rowidObject(String exParty_ExRelatedOrg_1_ExOrgNm_rowidObject) {
			this.exParty_ExRelatedOrg_1_ExOrgNm_rowidObject = exParty_ExRelatedOrg_1_ExOrgNm_rowidObject;
		}
		public String getExPosition_ExJobProfile_rowidObject() {
			return exPosition_ExJobProfile_rowidObject;
		}
		public void setExPosition_ExJobProfile_rowidObject(String exPosition_ExJobProfile_rowidObject) {
			this.exPosition_ExJobProfile_rowidObject = exPosition_ExJobProfile_rowidObject;
		}
		public String getExPosition_ExLocation_ExAddress_rowidObject() {
			return exPosition_ExLocation_ExAddress_rowidObject;
		}
		public void setExPosition_ExLocation_ExAddress_rowidObject(String exPosition_ExLocation_ExAddress_rowidObject) {
			this.exPosition_ExLocation_ExAddress_rowidObject = exPosition_ExLocation_ExAddress_rowidObject;
		}
		public String getExParty_ExRelatedOrg_1_ExOrgNm_ExSuperiorOrg_1_ExSupervisoryOrgDetails_ExSuperorgDEtails_1_rowidObject() {
			return exParty_ExRelatedOrg_1_ExOrgNm_ExSuperiorOrg_1_ExSupervisoryOrgDetails_ExSuperorgDEtails_1_rowidObject;
		}
		public void setExParty_ExRelatedOrg_1_ExOrgNm_ExSuperiorOrg_1_ExSupervisoryOrgDetails_ExSuperorgDEtails_1_rowidObject(
				String exParty_ExRelatedOrg_1_ExOrgNm_ExSuperiorOrg_1_ExSupervisoryOrgDetails_ExSuperorgDEtails_1_rowidObject) {
			this.exParty_ExRelatedOrg_1_ExOrgNm_ExSuperiorOrg_1_ExSupervisoryOrgDetails_ExSuperorgDEtails_1_rowidObject = exParty_ExRelatedOrg_1_ExOrgNm_ExSuperiorOrg_1_ExSupervisoryOrgDetails_ExSuperorgDEtails_1_rowidObject;
		}
		public String getExPosition_ExLocation_rowidObject() {
			return exPosition_ExLocation_rowidObject;
		}
		public void setExPosition_ExLocation_rowidObject(String exPosition_ExLocation_rowidObject) {
			this.exPosition_ExLocation_rowidObject = exPosition_ExLocation_rowidObject;
		}
		public String getExParty_rowidObject() {
			return exParty_rowidObject;
		}
		public void setExParty_rowidObject(String exParty_rowidObject) {
			this.exParty_rowidObject = exParty_rowidObject;
		}
		public String getExParty_ExRelatedOrg_1_rowidObject() {
			return exParty_ExRelatedOrg_1_rowidObject;
		}
		public void setExParty_ExRelatedOrg_1_rowidObject(String exParty_ExRelatedOrg_1_rowidObject) {
			this.exParty_ExRelatedOrg_1_rowidObject = exParty_ExRelatedOrg_1_rowidObject;
		}
		public String getExPosition_ExJobProfile_ExJobFamily_rowidObject() {
			return exPosition_ExJobProfile_ExJobFamily_rowidObject;
		}
		public void setExPosition_ExJobProfile_ExJobFamily_rowidObject(String exPosition_ExJobProfile_ExJobFamily_rowidObject) {
			this.exPosition_ExJobProfile_ExJobFamily_rowidObject = exPosition_ExJobProfile_ExJobFamily_rowidObject;
		}
		public String getExParty_ExRelatedOrg_1_ExOrgNm_ExSuperiorOrg_1_rowidObject() {
			return exParty_ExRelatedOrg_1_ExOrgNm_ExSuperiorOrg_1_rowidObject;
		}
		public void setExParty_ExRelatedOrg_1_ExOrgNm_ExSuperiorOrg_1_rowidObject(
				String exParty_ExRelatedOrg_1_ExOrgNm_ExSuperiorOrg_1_rowidObject) {
			this.exParty_ExRelatedOrg_1_ExOrgNm_ExSuperiorOrg_1_rowidObject = exParty_ExRelatedOrg_1_ExOrgNm_ExSuperiorOrg_1_rowidObject;
		}
		public String getExParty_ExPartyEmployment_1_rowidObject() {
			return exParty_ExPartyEmployment_1_rowidObject;
		}
		public void setExParty_ExPartyEmployment_1_rowidObject(String exParty_ExPartyEmployment_1_rowidObject) {
			this.exParty_ExPartyEmployment_1_rowidObject = exParty_ExPartyEmployment_1_rowidObject;
		}
		public String getExParty_ExRelatedOrg_1_ExOrgNm_ExSuperiorOrg_1_ExSupervisoryOrgDetails_rowidObject() {
			return exParty_ExRelatedOrg_1_ExOrgNm_ExSuperiorOrg_1_ExSupervisoryOrgDetails_rowidObject;
		}
		public void setExParty_ExRelatedOrg_1_ExOrgNm_ExSuperiorOrg_1_ExSupervisoryOrgDetails_rowidObject(
				String exParty_ExRelatedOrg_1_ExOrgNm_ExSuperiorOrg_1_ExSupervisoryOrgDetails_rowidObject) {
			this.exParty_ExRelatedOrg_1_ExOrgNm_ExSuperiorOrg_1_ExSupervisoryOrgDetails_rowidObject = exParty_ExRelatedOrg_1_ExOrgNm_ExSuperiorOrg_1_ExSupervisoryOrgDetails_rowidObject;
		}

	    
}
