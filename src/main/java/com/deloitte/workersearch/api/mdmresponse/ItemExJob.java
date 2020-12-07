package com.deloitte.workersearch.api.mdmresponse;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ItemExJob {
	 public String rowidObject;
	    public String label;
	    @JsonProperty("ExJobPrflId") 
	    public String exJobPrflId;
	    @JsonProperty("ExJobCd") 
	    public String exJobCd;
	    @JsonProperty("ExJobTitle") 
	    public String exJobTitle;
	    @JsonProperty("ExJobSts") 
	    public ExJobSts exJobSts;
	    @JsonProperty("ExJobFamilyId") 
	    public String exJobFamilyId;
	    @JsonProperty("ExJobFamilyNm") 
	    public String exJobFamilyNm;
	    @JsonProperty("ExJobFamilySts") 
	    public String exJobFamilySts;
	    @JsonProperty("ExManagementLevel") 
	    public ExManagementLevel exManagementLevel;
	    @JsonProperty("ExJobFamilyGroup") 
	    public ExJobFamilyGroup exJobFamilyGroup;
	    @JsonProperty("ExPosition_rowidObject") 
	    public String exPosition_rowidObject;
	    @JsonProperty("ExPosition_ExJobPofile_ExJobFamily_rowidObject") 
	    public String exPosition_ExJobPofile_ExJobFamily_rowidObject;
	    @JsonProperty("ExPosition_ExJobPofile_rowidObject") 
	    public String exPosition_ExJobPofile_rowidObject;
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
		public String getExJobPrflId() {
			return exJobPrflId;
		}
		public void setExJobPrflId(String exJobPrflId) {
			this.exJobPrflId = exJobPrflId;
		}
		public String getExJobCd() {
			return exJobCd;
		}
		public void setExJobCd(String exJobCd) {
			this.exJobCd = exJobCd;
		}
		public String getExJobTitle() {
			return exJobTitle;
		}
		public void setExJobTitle(String exJobTitle) {
			this.exJobTitle = exJobTitle;
		}
		public ExJobSts getExJobSts() {
			return exJobSts;
		}
		public void setExJobSts(ExJobSts exJobSts) {
			this.exJobSts = exJobSts;
		}
		public String getExJobFamilyId() {
			return exJobFamilyId;
		}
		public void setExJobFamilyId(String exJobFamilyId) {
			this.exJobFamilyId = exJobFamilyId;
		}
		public String getExJobFamilyNm() {
			return exJobFamilyNm;
		}
		public void setExJobFamilyNm(String exJobFamilyNm) {
			this.exJobFamilyNm = exJobFamilyNm;
		}
		public String getExJobFamilySts() {
			return exJobFamilySts;
		}
		public void setExJobFamilySts(String exJobFamilySts) {
			this.exJobFamilySts = exJobFamilySts;
		}
		public ExManagementLevel getExManagementLevel() {
			return exManagementLevel;
		}
		public void setExManagementLevel(ExManagementLevel exManagementLevel) {
			this.exManagementLevel = exManagementLevel;
		}
		public ExJobFamilyGroup getExJobFamilyGroup() {
			return exJobFamilyGroup;
		}
		public void setExJobFamilyGroup(ExJobFamilyGroup exJobFamilyGroup) {
			this.exJobFamilyGroup = exJobFamilyGroup;
		}
		public String getExPosition_rowidObject() {
			return exPosition_rowidObject;
		}
		public void setExPosition_rowidObject(String exPosition_rowidObject) {
			this.exPosition_rowidObject = exPosition_rowidObject;
		}
		public String getExPosition_ExJobPofile_ExJobFamily_rowidObject() {
			return exPosition_ExJobPofile_ExJobFamily_rowidObject;
		}
		public void setExPosition_ExJobPofile_ExJobFamily_rowidObject(String exPosition_ExJobPofile_ExJobFamily_rowidObject) {
			this.exPosition_ExJobPofile_ExJobFamily_rowidObject = exPosition_ExJobPofile_ExJobFamily_rowidObject;
		}
		public String getExPosition_ExJobPofile_rowidObject() {
			return exPosition_ExJobPofile_rowidObject;
		}
		public void setExPosition_ExJobPofile_rowidObject(String exPosition_ExJobPofile_rowidObject) {
			this.exPosition_ExJobPofile_rowidObject = exPosition_ExJobPofile_rowidObject;
		}
	    
	    

}
