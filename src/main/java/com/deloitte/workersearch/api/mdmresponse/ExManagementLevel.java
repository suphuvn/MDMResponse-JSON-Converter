package com.deloitte.workersearch.api.mdmresponse;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ExManagementLevel {
	 public String rowidObject;
	    public String label;
	    @JsonProperty("ExManagementLevelName") 
	    public String exManagementLevelName;
	    @JsonProperty("ExMgmntLevelCd") 
	    public String exMgmntLevelCd;

}
