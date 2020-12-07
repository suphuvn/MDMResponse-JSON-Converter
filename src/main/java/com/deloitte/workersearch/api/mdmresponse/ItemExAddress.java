package com.deloitte.workersearch.api.mdmresponse;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ItemExAddress {
	public String rowidObject;
    public String label;
    @JsonProperty("ExAddrTyp") 
    public ExAddrTyp exAddrTyp;
    @JsonProperty("ExAddressLine1") 
    public String exAddressLine1;
    @JsonProperty("ExCity") 
    public String exCity;
    @JsonProperty("ExState") 
    public ExState exState;
    @JsonProperty("ExPostalCd") 
    public String exPostalCd;
    @JsonProperty("ExCountry") 
    public ExCountry exCountry;
    @JsonProperty("ExPostalAddress_rowidObject") 
    public String exPostalAddress_rowidObject;
	public String getRowidObject() {
		return rowidObject;
	}
	public void setRowidObject(String rowidObject) {
		this.rowidObject = rowidObject;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public ExAddrTyp getExAddrTyp() {
		return exAddrTyp;
	}
	public void setExAddrTyp(ExAddrTyp exAddrTyp) {
		this.exAddrTyp = exAddrTyp;
	}
	public String getExAddressLine1() {
		return exAddressLine1;
	}
	public void setExAddressLine1(String exAddressLine1) {
		this.exAddressLine1 = exAddressLine1;
	}
	public String getExCity() {
		return exCity;
	}
	public void setExCity(String exCity) {
		this.exCity = exCity;
	}
	public ExState getExState() {
		return exState;
	}
	public void setExState(ExState exState) {
		this.exState = exState;
	}
	public String getExPostalCd() {
		return exPostalCd;
	}
	public void setExPostalCd(String exPostalCd) {
		this.exPostalCd = exPostalCd;
	}
	public ExCountry getExCountry() {
		return exCountry;
	}
	public void setExCountry(ExCountry exCountry) {
		this.exCountry = exCountry;
	}
	public String getExPostalAddress_rowidObject() {
		return exPostalAddress_rowidObject;
	}
	public void setExPostalAddress_rowidObject(String exPostalAddress_rowidObject) {
		this.exPostalAddress_rowidObject = exPostalAddress_rowidObject;
	}
    
    

}
