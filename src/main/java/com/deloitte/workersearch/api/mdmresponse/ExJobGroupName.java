package com.deloitte.workersearch.api.mdmresponse;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ExJobGroupName {
	 public String rowidObject;
	    public String label;
	    @JsonProperty("ExJobFamilyGroupCd") 
	    public String exJobFamilyGroupCd;
	    @JsonProperty("ExJobFamilyGroupName") 
	    public String exJobFamilyGroupName;
	    @JsonProperty("ExJobFamilyGroupDesc") 
	    public String exJobFamilyGroupDesc;

}
