package com.deloitte.workersearch.api.mdmresponse;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ExPhoneTyp {
	public String rowidObject;
    public String label;
    public String phnTyp;
    public String phnTypDesc;
    @JsonProperty("ExPhnTypName") 
    public String exPhnTypName;

}
