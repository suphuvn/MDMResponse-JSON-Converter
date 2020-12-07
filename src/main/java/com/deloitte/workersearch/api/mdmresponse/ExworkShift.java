package com.deloitte.workersearch.api.mdmresponse;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ExworkShift {
	 public String rowidObject;
	    public String label;
	    @JsonProperty("ExWorkShiftName") 
	    public String exWorkShiftName;
	    @JsonProperty("ExWorkShiftCd") 
	    public String exWorkShiftCd;

}
