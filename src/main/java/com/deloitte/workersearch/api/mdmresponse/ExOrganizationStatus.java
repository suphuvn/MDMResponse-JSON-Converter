package com.deloitte.workersearch.api.mdmresponse;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ExOrganizationStatus {
	 public String rowidObject;
	    public String label;
	    @JsonProperty("ExOrgStsTypDesc") 
	    public String exOrgStsTypDesc;
	    @JsonProperty("ExOrgStsTypNm") 
	    public String exOrgStsTypNm;
	    @JsonProperty("ExOrgStsTypCd") 
	    public String exOrgStsTypCd;

}
