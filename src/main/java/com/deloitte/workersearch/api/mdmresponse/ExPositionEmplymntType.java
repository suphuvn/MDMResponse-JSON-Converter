package com.deloitte.workersearch.api.mdmresponse;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ExPositionEmplymntType {
	  public String rowidObject;
	    public String label;
	    public String emplymntTypCd;
	    @JsonProperty("ExEmploymentTypeDesc") 
	    public String exEmploymentTypeDesc;
	    @JsonProperty("ExEmploymentTypeName") 
	    public String exEmploymentTypeName;

}
