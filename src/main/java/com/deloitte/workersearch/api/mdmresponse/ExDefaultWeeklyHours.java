package com.deloitte.workersearch.api.mdmresponse;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ExDefaultWeeklyHours {

	  public String rowidObject;
	    public String label;
	    @JsonProperty("ExDefaultWeeklyHoursCd") 
	    public String exDefaultWeeklyHoursCd;
	    @JsonProperty("ExDefaultWeeklyHoursName") 
	    public String exDefaultWeeklyHoursName;
}
