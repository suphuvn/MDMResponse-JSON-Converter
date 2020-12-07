package com.deloitte.workersearch.api.mdmresponse;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Item2 {

	 public String rowidObject;
	    public String label;
	    @JsonProperty("ExNameTyp") 
	    public ExNameTyp exNameTyp;
	    @JsonProperty("ExNameValue") 
	    public String exNameValue;
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
		public ExNameTyp getExNameTyp() {
			return exNameTyp;
		}
		public void setExNameTyp(ExNameTyp exNameTyp) {
			this.exNameTyp = exNameTyp;
		}
		public String getExNameValue() {
			return exNameValue;
		}
		public void setExNameValue(String exNameValue) {
			this.exNameValue = exNameValue;
		}
	    
	    
}
