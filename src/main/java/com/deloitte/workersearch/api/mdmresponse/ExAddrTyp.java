package com.deloitte.workersearch.api.mdmresponse;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ExAddrTyp {
	 public String rowidObject;
	    public String label;
	    public String addrTypDesc;
	    public String addrTyp;
	    @JsonProperty("ExAddrTypName") 
	    public String exAddrTypName;

}
