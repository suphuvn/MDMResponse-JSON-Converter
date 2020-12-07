package com.deloitte.workersearch.api.mdmresponse;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ItemExLocation {
	 public String rowidObject;
	    public String label;
	    @JsonProperty("ExLocationNm") 
	    public String exLocationNm;
	    @JsonProperty("ExLocationTyp") 
	    public ExLocationTyp exLocationTyp;
	    @JsonProperty("ExLocationSts") 
	    public String exLocationSts;
	    @JsonProperty("ExTimeZone") 
	    public String exTimeZone;
	    @JsonProperty("ExLocale") 
	    public String exLocale;
	    @JsonProperty("ExAvialabilityDt") 
	    public Date exAvialabilityDt;
	    @JsonProperty("ExAddressLine1") 
	    public String exAddressLine1;
	    @JsonProperty("ExCity") 
	    public String exCity;
	    @JsonProperty("ExState") 
	    public ExState2 exState;
	    @JsonProperty("ExPostalCd") 
	    public String exPostalCd;
	    @JsonProperty("ExCountry") 
	    public ExCountry2 exCountry;
	    @JsonProperty("ExSiteNm") 
	    public String exSiteNm;
	    @JsonProperty("ExFloorNum") 
	    public String exFloorNum;
	    @JsonProperty("ExRoomNumber") 
	    public String exRoomNumber;
	    @JsonProperty("ExLocationId") 
	    public String exLocationId;
	    @JsonProperty("ExLocation_rowidObject") 
	    public String exLocation_rowidObject;
	    @JsonProperty("ExLocation_ExAddress_rowidObject") 
	    public String exLocation_ExAddress_rowidObject;
	    @JsonProperty("ExSiteDesc") 
	    public String exSiteDesc;
	    
	    
		public String getExSiteDesc() {
			return exSiteDesc;
		}
		public void setExSiteDesc(String exSiteDesc) {
			this.exSiteDesc = exSiteDesc;
		}
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
		public String getExLocationNm() {
			return exLocationNm;
		}
		public void setExLocationNm(String exLocationNm) {
			this.exLocationNm = exLocationNm;
		}
		public ExLocationTyp getExLocationTyp() {
			return exLocationTyp;
		}
		public void setExLocationTyp(ExLocationTyp exLocationTyp) {
			this.exLocationTyp = exLocationTyp;
		}
		public String getExLocationSts() {
			return exLocationSts;
		}
		public void setExLocationSts(String exLocationSts) {
			this.exLocationSts = exLocationSts;
		}
		public String getExTimeZone() {
			return exTimeZone;
		}
		public void setExTimeZone(String exTimeZone) {
			this.exTimeZone = exTimeZone;
		}
		public String getExLocale() {
			return exLocale;
		}
		public void setExLocale(String exLocale) {
			this.exLocale = exLocale;
		}
		public Date getExAvialabilityDt() {
			return exAvialabilityDt;
		}
		public void setExAvialabilityDt(Date exAvialabilityDt) {
			this.exAvialabilityDt = exAvialabilityDt;
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
		public ExState2 getExState() {
			return exState;
		}
		public void setExState(ExState2 exState) {
			this.exState = exState;
		}
		public String getExPostalCd() {
			return exPostalCd;
		}
		public void setExPostalCd(String exPostalCd) {
			this.exPostalCd = exPostalCd;
		}
		public ExCountry2 getExCountry() {
			return exCountry;
		}
		public void setExCountry(ExCountry2 exCountry) {
			this.exCountry = exCountry;
		}
		public String getExSiteNm() {
			return exSiteNm;
		}
		public void setExSiteNm(String exSiteNm) {
			this.exSiteNm = exSiteNm;
		}
		public String getExFloorNum() {
			return exFloorNum;
		}
		public void setExFloorNum(String exFloorNum) {
			this.exFloorNum = exFloorNum;
		}
		public String getExRoomNumber() {
			return exRoomNumber;
		}
		public void setExRoomNumber(String exRoomNumber) {
			this.exRoomNumber = exRoomNumber;
		}
		public String getExLocationId() {
			return exLocationId;
		}
		public void setExLocationId(String exLocationId) {
			this.exLocationId = exLocationId;
		}
		public String getExLocation_rowidObject() {
			return exLocation_rowidObject;
		}
		public void setExLocation_rowidObject(String exLocation_rowidObject) {
			this.exLocation_rowidObject = exLocation_rowidObject;
		}
		public String getExLocation_ExAddress_rowidObject() {
			return exLocation_ExAddress_rowidObject;
		}
		public void setExLocation_ExAddress_rowidObject(String exLocation_ExAddress_rowidObject) {
			this.exLocation_ExAddress_rowidObject = exLocation_ExAddress_rowidObject;
		}
	    
	    

}
