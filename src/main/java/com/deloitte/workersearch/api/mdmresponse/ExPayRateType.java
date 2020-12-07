package com.deloitte.workersearch.api.mdmresponse;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ExPayRateType {
	 public String rowidObject;
	    public String label;
	    @JsonProperty("ExPayRateTypName") 
	    public String exPayRateTypName;
	    @JsonProperty("ExPayRateTypCd") 
	    public String exPayRateTypCd;

}
