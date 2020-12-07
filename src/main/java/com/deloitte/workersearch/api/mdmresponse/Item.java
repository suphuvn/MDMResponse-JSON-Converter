package com.deloitte.workersearch.api.mdmresponse;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Item {
	 @JsonProperty("ExEmployeeOutbound") 
	 public ExEmployeeOutbound exEmployeeOutbound;

	public ExEmployeeOutbound getExEmployeeOutbound() {
		return exEmployeeOutbound;
	}

	public void setExEmployeeOutbound(ExEmployeeOutbound exEmployeeOutbound) {
		this.exEmployeeOutbound = exEmployeeOutbound;
	}
	 
	 

}
