package com.deloitte.workersearch.api.mdmresponse;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ExOrganizationSubTyp {
	 public String rowidObject;
	    public String label;
	    @JsonProperty("ExOrgSubTypDesc") 
	    public String exOrgSubTypDesc;
	    @JsonProperty("ExOrgSubTypNm") 
	    public String exOrgSubTypNm;
	    @JsonProperty("ExOrgSubTypCd") 
	    public String exOrgSubTypCd;

}
