package com.deloitte.workersearch.api.mdmresponse;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ExCountry2 {
	 public String rowidObject;
	    public String label;
	    public String cntryCd;
	    public String cntryDesc;
	    @JsonProperty("ExCntryName") 
	    public String exCntryName;

}
