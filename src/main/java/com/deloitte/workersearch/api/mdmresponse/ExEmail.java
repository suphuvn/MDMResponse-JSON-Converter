package com.deloitte.workersearch.api.mdmresponse;

import java.util.List;

public class ExEmail {

	public List<Object> link;
	public int firstRecord;
	public int pageSize;
	public String searchToken;
	public List<ItemExEmail> item;

	public List<Object> getLink() {
		return link;
	}

	public void setLink(List<Object> link) {
		this.link = link;
	}

	public int getFirstRecord() {
		return firstRecord;
	}

	public void setFirstRecord(int firstRecord) {
		this.firstRecord = firstRecord;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public String getSearchToken() {
		return searchToken;
	}

	public void setSearchToken(String searchToken) {
		this.searchToken = searchToken;
	}

	public List<ItemExEmail> getItem() {
		return item;
	}

	public void setItem(List<ItemExEmail> item) {
		this.item = item;
	}

}
