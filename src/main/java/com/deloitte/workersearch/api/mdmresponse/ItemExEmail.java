package com.deloitte.workersearch.api.mdmresponse;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ItemExEmail {
	public String rowidObject;
	public String label;
	@JsonProperty("ExEmailTyp")
	public ExEmailTyp exEmailTyp;
	@JsonProperty("ExEmailAddr")
	public String exEmailAddr;

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

	public ExEmailTyp getExEmailTyp() {
		return exEmailTyp;
	}

	public void setExEmailTyp(ExEmailTyp exEmailTyp) {
		this.exEmailTyp = exEmailTyp;
	}

	public String getExEmailAddr() {
		return exEmailAddr;
	}

	public void setExEmailAddr(String exEmailAddr) {
		this.exEmailAddr = exEmailAddr;
	}

}
