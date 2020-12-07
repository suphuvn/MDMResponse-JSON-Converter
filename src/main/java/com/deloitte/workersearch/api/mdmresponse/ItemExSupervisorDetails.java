package com.deloitte.workersearch.api.mdmresponse;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ItemExSupervisorDetails {
	 public String rowidObject;
	    public String label;
	    @JsonProperty("ExSupervisorEmployeeId") 
	    public String exSupervisorEmployeeId;
	    @JsonProperty("ExSupervisorName") 
	    public String exSupervisorName;
	    @JsonProperty("ExSupervisorNm_ExWorker_1_rowidObject") 
	    public String exSupervisorNm_ExWorker_1_rowidObject;
	    @JsonProperty("ExSupervisorNm_rowidObject") 
	    public String exSupervisorNm_rowidObject;
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
		public String getExSupervisorEmployeeId() {
			return exSupervisorEmployeeId;
		}
		public void setExSupervisorEmployeeId(String exSupervisorEmployeeId) {
			this.exSupervisorEmployeeId = exSupervisorEmployeeId;
		}
		public String getExSupervisorName() {
			return exSupervisorName;
		}
		public void setExSupervisorName(String exSupervisorName) {
			this.exSupervisorName = exSupervisorName;
		}
		public String getExSupervisorNm_ExWorker_1_rowidObject() {
			return exSupervisorNm_ExWorker_1_rowidObject;
		}
		public void setExSupervisorNm_ExWorker_1_rowidObject(String exSupervisorNm_ExWorker_1_rowidObject) {
			this.exSupervisorNm_ExWorker_1_rowidObject = exSupervisorNm_ExWorker_1_rowidObject;
		}
		public String getExSupervisorNm_rowidObject() {
			return exSupervisorNm_rowidObject;
		}
		public void setExSupervisorNm_rowidObject(String exSupervisorNm_rowidObject) {
			this.exSupervisorNm_rowidObject = exSupervisorNm_rowidObject;
		}
	    
	    

}
