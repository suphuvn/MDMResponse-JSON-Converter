package com.deloitte.workersearch.api.mdmresponse;

import java.util.List;

public class ItemEmployeeOutboundResponse {
	  public List<Object> link;
	    public int firstRecord;
	    public int recordCount;
	    public int pageSize;
	    public String searchToken;
	    public List<Object> facet;
	    public List<Item> item;
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
		public int getRecordCount() {
			return recordCount;
		}
		public void setRecordCount(int recordCount) {
			this.recordCount = recordCount;
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
		public List<Object> getFacet() {
			return facet;
		}
		public void setFacet(List<Object> facet) {
			this.facet = facet;
		}
		public List<Item> getItem() {
			return item;
		}
		public void setItem(List<Item> item) {
			this.item = item;
		}
	    
	    

}
