package com.deloitte.workersearch.api.mdmresponse;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ExOrganizationTyp {

	public String rowidObject;
    public String label;
    @JsonProperty("ExOrgTypCd") 
    public String exOrgTypCd;
    @JsonProperty("ExOrgTypNm") 
    public String exOrgTypNm;
    @JsonProperty("ExOrgTypDesc") 
    public String exOrgTypDesc;
}
