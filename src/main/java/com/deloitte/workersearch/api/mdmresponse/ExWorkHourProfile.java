package com.deloitte.workersearch.api.mdmresponse;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ExWorkHourProfile {
	 public String rowidObject;
	    public String label;
	    @JsonProperty("ExWorkHoursProfileCd") 
	    public String exWorkHoursProfileCd;
	    @JsonProperty("ExWorkHoursProfileName") 
	    public String exWorkHoursProfileName;

}
