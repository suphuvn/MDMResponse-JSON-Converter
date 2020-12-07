package com.deloitte.workersearch.api.mdmresponse;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ExCompanyCd {
	 public String rowidObject;
	    public String label;
	    @JsonProperty("ExCompanyDesc") 
	    public String exCompanyDesc;
	    @JsonProperty("ExCompanyCd") 
	    public String exCompanyCd;
	    @JsonProperty("ExCompanyName") 
	    public String exCompanyName;

}
