package com.deloitte.workersearch.api.utils;

public interface ServiceRequestConstants {

	String Action="query";
	String EXWORKERTYPE="ExWorkerType=";
	String EXWORKERTYPEIN="ExWorkerType in";
	String EXEMPLOYEEID="ExPartyIdentification.ExAltIdValue=";
	String EXEMPLOYEEIDIN="ExPartyIdentification.ExAltIdValue in";
	String LASTUPDATEDDATE="lastUpdateDate in";
//	String OUTPUTVIEW="outputView";
//	String EXEMPLOYEEOUTBOUND="ExEmployeeOutbound";
//	String RECORDSTORETURN="recordsToReturn";
//	String RETURNTOTAL="returnTotal";
//	action=query&
//			filter=ExWorkerType in [EMP,CONT] 
//			and ExPartyEmployment.ExEmploymentSts='ACT'&
//			firstRecord=1&
//			depth=11&
//			suppressLinks=true&
//			returnTotal=true&
//			recordsToReturn=2000&
//			outputView=ExEmployeeOutbound
}
