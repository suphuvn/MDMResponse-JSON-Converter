package com.deloitte.workersearch.api.mdmresponse;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ExScheduledWeeklyHours {
	 public String rowidObject;
	    public String label;
	    @JsonProperty("ExScheduledWeeklyHoursName") 
	    public String exScheduledWeeklyHoursName;
	    @JsonProperty("ExScheduledWeeklyHoursCd") 
	    public String exScheduledWeeklyHoursCd;

}
