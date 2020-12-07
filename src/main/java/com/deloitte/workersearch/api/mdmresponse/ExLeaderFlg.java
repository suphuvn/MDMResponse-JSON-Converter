package com.deloitte.workersearch.api.mdmresponse;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ExLeaderFlg {
	 public String rowidObject;
	    public String label;
	    @JsonProperty("ExLeaderFlagCd") 
	    public String exLeaderFlagCd;
	    @JsonProperty("ExLeaderFlagName") 
	    public String exLeaderFlagName;
	    @JsonProperty("ExLeaderFlagDesc") 
	    public String exLeaderFlagDesc;

}
