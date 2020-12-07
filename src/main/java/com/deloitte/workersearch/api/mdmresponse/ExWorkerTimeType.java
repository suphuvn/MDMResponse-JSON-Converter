package com.deloitte.workersearch.api.mdmresponse;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ExWorkerTimeType {
	 public String rowidObject;
	    public String label;
	    @JsonProperty("ExWrkrTimeTypName") 
	    public String exWrkrTimeTypName;
	    @JsonProperty("ExWrkrTimeTypCd") 
	    public String exWrkrTimeTypCd;

}
