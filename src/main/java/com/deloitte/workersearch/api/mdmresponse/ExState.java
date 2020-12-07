package com.deloitte.workersearch.api.mdmresponse;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ExState {
	
	 public String rowidObject;
	    public String label;
	    @JsonProperty("ExProvince") 
	    public String exProvince;
	    @JsonProperty("ExProvinceDesc") 
	    public String exProvinceDesc;
	    @JsonProperty("ExProvinceName") 
	    public String exProvinceName;

}
