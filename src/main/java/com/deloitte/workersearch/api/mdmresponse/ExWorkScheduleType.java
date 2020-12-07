package com.deloitte.workersearch.api.mdmresponse;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ExWorkScheduleType {
	  public String rowidObject;
	    public String label;
	    @JsonProperty("ExWorkScheduleTypDesc") 
	    public String exWorkScheduleTypDesc;
	    @JsonProperty("ExWorkScheduleTypCd") 
	    public String exWorkScheduleTypCd;
	    @JsonProperty("ExWorkScheduleTypName") 
	    public String exWorkScheduleTypName;

}
