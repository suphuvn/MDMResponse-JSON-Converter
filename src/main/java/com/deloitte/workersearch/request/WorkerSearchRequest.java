package com.deloitte.workersearch.request;

import java.util.ArrayList;


public class WorkerSearchRequest {
	
	public Integer firstRecord;
	public ArrayList<Object> workerType = new ArrayList <> ();
	public ArrayList<Object> employeeId = new ArrayList <> ();
	private String startDate;
	private String EndDate;
	public Integer getFirstRecord() {
		return firstRecord;
	}
	public void setFirstRecord(Integer firstRecord) {
		this.firstRecord = firstRecord;
	}
	public ArrayList<Object> getWorkerType() {
		return workerType;
	}
	public void setWorkerType(ArrayList<Object> workerType) {
		this.workerType = workerType;
	}
	public ArrayList<Object> getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(ArrayList<Object> employeeId) {
		this.employeeId = employeeId;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return EndDate;
	}
	public void setEndDate(String endDate) {
		EndDate = endDate;
	}


	
//	action  -- static 
//	filter  = ExPartyEmployment.ExEmploymentSts=ACT -- static
//	ExWorkerTypen mutiple values  -- dynamic
//	firstRecord--dynamic
//	depth--static 9
//	suppressLinks--static true
//	returnTotal if firstrecord count greater then 20000 then make return total as false
//	recordsToReturn--static
//	outputView--static
//	searchToken=SVR1.ZERO
//	outputView -- static
	
}
