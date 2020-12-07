package com.deloitte.workersearch.api.mdmresponse;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ExEmailTyp {
	  public String rowidObject;
	    public String label;
	    public String addrTypDesc;
	    public String addrTyp;
	    @JsonProperty("ExAddrName") 
	    public String exAddrName;

}
