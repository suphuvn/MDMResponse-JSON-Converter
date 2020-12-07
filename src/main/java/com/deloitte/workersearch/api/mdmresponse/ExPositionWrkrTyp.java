	package com.deloitte.workersearch.api.mdmresponse;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ExPositionWrkrTyp {
	 public String rowidObject;
	    public String label;
	    @JsonProperty("ExWorkerTypName") 
	    public String exWorkerTypName;
	    @JsonProperty("ExWorkerTypCd") 
	    public String exWorkerTypCd;
	    @JsonProperty("ExWorkerTypDesc") 
	    public String exWorkerTypDesc;

}
