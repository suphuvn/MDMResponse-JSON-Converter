package com.deloitte.workersearch.api.mdmresponse;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ExPositionSts {
	public String rowidObject;
    public String label;
    @JsonProperty("ExRDOStsCd") 
    public String exRDOStsCd;
}
