
package com.deloitte.workersearch.api.response;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class WorkerOutboundResponse {

    @JsonProperty("worker")
    private List<Worker> worker;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	public List<Worker> getWorker() {
		return worker;
	}
	public void setWorker(List<Worker> worker) {
		this.worker = worker;
	}
	public Map<String, Object> getAdditionalProperties() {
		return additionalProperties;
	}
	public void setAdditionalProperties(Map<String, Object> additionalProperties) {
		this.additionalProperties = additionalProperties;
	}

}
