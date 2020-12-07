package com.deloitte.workersearch.api.mdmresponse;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ExLocationTyp {
	 public String rowidObject;
	    public String label;
	    @JsonProperty("ExLocTypNm") 
	    public String exLocTypNm;
	    @JsonProperty("ExLocTypCd") 
	    public String exLocTypCd;
	    @JsonProperty("ExLocTypDesc") 
	    public String exLocTypDesc;

}
