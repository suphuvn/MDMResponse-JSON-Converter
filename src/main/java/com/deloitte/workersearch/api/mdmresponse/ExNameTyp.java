package com.deloitte.workersearch.api.mdmresponse;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ExNameTyp {

	  public String rowidObject;
	  public String label;
	    public String nmDesc;
	    public String nmTyp;
	    @JsonProperty("ExNmTypNm") 
	    public String exNmTypNm;
}
