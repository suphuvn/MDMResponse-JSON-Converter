
package com.deloitte.workersearch.api.response;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "vendorCode",
    "vendorName"
})
public class Contractor {

    @JsonProperty("vendorCode")
    private String vendorCode;
    @JsonProperty("vendorName")
    private String vendorName;
    @JsonProperty("serviceMobilizedNum")
    private String serviceMobilizedNum;
    @JsonProperty("serviceMobilizedDescription")
    private String serviceMobilizedDescription;
    @JsonProperty("contractorStartDate")
    private String contractorStartDate;
    @JsonProperty("contractorEndDate")
    private String contractorEndDate;
    
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    
    
    public String getServiceMobilizedNum() {
		return serviceMobilizedNum;
	}

	public void setServiceMobilizedNum(String serviceMobilizedNum) {
		this.serviceMobilizedNum = serviceMobilizedNum;
	}

	public String getServiceMobilizedDescription() {
		return serviceMobilizedDescription;
	}

	public void setServiceMobilizedDescription(String serviceMobilizedDescription) {
		this.serviceMobilizedDescription = serviceMobilizedDescription;
	}

	public String getContractorStartDate() {
		return contractorStartDate;
	}

	public void setContractorStartDate(String contractorStartDate) {
		this.contractorStartDate = contractorStartDate;
	}

	public String getContractorEndDate() {
		return contractorEndDate;
	}

	public void setContractorEndDate(String contractorEndDate) {
		this.contractorEndDate = contractorEndDate;
	}

	@JsonProperty("vendorCode")
    public String getVendorCode() {
        return vendorCode;
    }

    @JsonProperty("vendorCode")
    public void setVendorCode(String vendorCode) {
        this.vendorCode = vendorCode;
    }

    @JsonProperty("vendorName")
    public String getVendorName() {
        return vendorName;
    }

    @JsonProperty("vendorName")
    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
