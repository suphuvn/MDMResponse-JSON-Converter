package com.deloitte.workersearch.api.mdmresponse;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ItemExPhone {
	 public String rowidObject;
	    public String label;
	    @JsonProperty("ExPhoneTyp") 
	    public ExPhoneTyp exPhoneTyp;
	    @JsonProperty("ExInternationalPhnCd") 
	    public String exInternationalPhnCd;
	    @JsonProperty("ExPhnNum") 
	    public String exPhnNum;
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
		public ExPhoneTyp getExPhoneTyp() {
			return exPhoneTyp;
		}
		public void setExPhoneTyp(ExPhoneTyp exPhoneTyp) {
			this.exPhoneTyp = exPhoneTyp;
		}
		public String getExInternationalPhnCd() {
			return exInternationalPhnCd;
		}
		public void setExInternationalPhnCd(String exInternationalPhnCd) {
			this.exInternationalPhnCd = exInternationalPhnCd;
		}
		public String getExPhnNum() {
			return exPhnNum;
		}
		public void setExPhnNum(String exPhnNum) {
			this.exPhnNum = exPhnNum;
		}
	    
	    

}
