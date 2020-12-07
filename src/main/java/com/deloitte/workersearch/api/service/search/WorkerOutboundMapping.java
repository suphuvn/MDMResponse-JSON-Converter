package com.deloitte.workersearch.api.service.search;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.deloitte.workersearch.api.mdmresponse.ExAddress;
import com.deloitte.workersearch.api.mdmresponse.ExAlternateName;
import com.deloitte.workersearch.api.mdmresponse.ExEmail;
import com.deloitte.workersearch.api.mdmresponse.ExEmployeeOutbound;
import com.deloitte.workersearch.api.mdmresponse.ExJob;
import com.deloitte.workersearch.api.mdmresponse.ExLocation;
import com.deloitte.workersearch.api.mdmresponse.ExOrganization;
import com.deloitte.workersearch.api.mdmresponse.ExPhone;
import com.deloitte.workersearch.api.mdmresponse.ExPosition;
import com.deloitte.workersearch.api.mdmresponse.ExSupervisorDetails;
import com.deloitte.workersearch.api.mdmresponse.Item;
import com.deloitte.workersearch.api.mdmresponse.Item2;
import com.deloitte.workersearch.api.mdmresponse.ItemEmployeeOutboundResponse;
import com.deloitte.workersearch.api.mdmresponse.ItemExAddress;
import com.deloitte.workersearch.api.mdmresponse.ItemExEmail;
import com.deloitte.workersearch.api.mdmresponse.ItemExJob;
import com.deloitte.workersearch.api.mdmresponse.ItemExLocation;
import com.deloitte.workersearch.api.mdmresponse.ItemExOrganization;
import com.deloitte.workersearch.api.mdmresponse.ItemExPhone;
import com.deloitte.workersearch.api.mdmresponse.ItemExPosition;
import com.deloitte.workersearch.api.mdmresponse.ItemExSupervisorDetails;
import com.deloitte.workersearch.api.response.Address;
import com.deloitte.workersearch.api.response.Contractor;
import com.deloitte.workersearch.api.response.Email;
import com.deloitte.workersearch.api.response.Employee;
import com.deloitte.workersearch.api.response.Job;
import com.deloitte.workersearch.api.response.Location;
import com.deloitte.workersearch.api.response.NameData;
import com.deloitte.workersearch.api.response.OrgLevel;
import com.deloitte.workersearch.api.response.Organization;
import com.deloitte.workersearch.api.response.Phone;
import com.deloitte.workersearch.api.response.Position;
import com.deloitte.workersearch.api.response.Supervisor;
import com.deloitte.workersearch.api.response.Worker;
import com.deloitte.workersearch.api.response.WorkerOutboundResponse;
import com.deloitte.workersearch.request.WorkerSearchRequest;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;


@Service
public class WorkerOutboundMapping {
	private static final Logger LOGGER = LoggerFactory.getLogger(WorkerOutboundMapping.class);

	public String test()
	{
		LOGGER.info("in test():WorkerOutboundMapping");
		return "in Service WorkerOutboundMapping";
	}
	
	public WorkerOutboundResponse processWorkerDetails()
	{
		LOGGER.info("in processWorkerDetails():WorkerOutboundMapping");
		ItemEmployeeOutboundResponse itemEmployeeOutboundResponse=null;
		WorkerOutboundResponse workerOutboundResponse=null;
		//Read JSON and populate java objects
		ObjectMapper mapper = new ObjectMapper();
		try 
		{
			itemEmployeeOutboundResponse = mapper.readValue(new File("src/mdmReponse_17_9_2020.txt") , ItemEmployeeOutboundResponse.class);
			workerOutboundResponse = mappingWorkerData(itemEmployeeOutboundResponse);
		} 
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		return workerOutboundResponse;
	}
	
    public WorkerOutboundResponse mappingWorkerData(ItemEmployeeOutboundResponse request)
   {
	   WorkerOutboundResponse response = new WorkerOutboundResponse();
		try {
		List<Worker> workerList = new ArrayList<Worker>();
			request.getItem().stream().forEach(emp -> {
				Worker worker = new Worker();
				// setting employee
				if (emp.getExEmployeeOutbound() != null) {
					ExEmployeeOutbound empOutbound = emp.getExEmployeeOutbound();
					if (empOutbound != null) {
						Employee employee = new Employee();
						employee.setName(empOutbound.getExEmployeeName());
						employee.setId(empOutbound.getExEmployeeId());
						employee.setStatus(empOutbound.getExEmploymentStatus().exEmplymntStsName);
						employee.setHireDate(empOutbound.getExHireDt());
						employee.setOriginalHireDate(empOutbound.getExOriginalHireDate());
						employee.setSeniorityDate(empOutbound.getExSeniorityDt());
						employee.setTerminationDate(empOutbound.getExEndEmploymentDt());	
						if (empOutbound.getExLeaderFlg().exLeaderFlagName.equalsIgnoreCase("N")) {
							employee.setIsLeader(false);
						} else {
							employee.setIsLeader(true);
						}
						employee.setPaidCountryName(empOutbound.getExPaidCountryNm());
						employee.setCountryName(empOutbound.getExPaidCountryNm());
						employee.setWorkShift(empOutbound.getExworkShift().exWorkShiftName);
						employee.setWorkSchedule(empOutbound.getExWorkScheduleType().exWorkScheduleTypName);
	                    employee.setPositionId(empOutbound.getExPositionId());
	                    employee.setTimeReportingType(empOutbound.getExWorkerTimeType().exWrkrTimeTypName);
					    employee.setAccessCardId(empOutbound.getExAccessCardId());
						
						// setting altname
						ExAlternateName exAltName = empOutbound.getExAlternateName();
						if (exAltName != null) {
							if (exAltName.getItem() != null && exAltName.getItem().size() > 0) {
								List<NameData> nameDataList = new ArrayList<NameData>();
								exAltName.getItem().stream().forEach(itemAltName ->{
									NameData nameData = new NameData();
									nameData.setType(itemAltName.getExNameTyp().exNmTypNm);

									String fullName = itemAltName.getExNameValue();
									String[] arrOfStr = fullName.split("\\s+");
									String firstName = null;
									String middleName = null;
									String lastName = null;

									if (arrOfStr.length > 2) {
										firstName = arrOfStr[0];
										middleName = arrOfStr[1];
										lastName = arrOfStr[2];

									} else if (arrOfStr.length > 1) {
										firstName = arrOfStr[0];
										lastName = arrOfStr[1];
									} else if (arrOfStr.length > 0) {
										firstName = arrOfStr[0];
									}
									nameData.setFirstName(firstName);
									nameData.setMiddleName(middleName);
									nameData.setLastName(lastName);
									nameData.setAdditionalFormattedName(itemAltName.getExNameValue());
	                                nameData.setFormattedName(fullName);
	                                nameData.setAdditionalFirstName(empOutbound.getExFirstName());
	                                nameData.setAdditionalMiddleName(empOutbound.getExMiddleName());
	                                nameData.setAdditionalLastName(empOutbound.getExLastName());
									nameDataList.add(nameData);
								});
								worker.setNameData(nameDataList);
							}
						}
						
						// setting Address
						ExAddress exAddress = empOutbound.getExAddress();
						if (exAddress != null) {
							if (exAddress.getItem() != null && exAddress.getItem().size() > 0) {
								List<Address> addrList = new ArrayList<Address>();
								exAddress.getItem().stream().forEach(itemAdd -> {
									Address add = new Address();
									add.setAddressType(itemAdd.getExAddrTyp().addrTyp);
									add.setAddressLine1(itemAdd.getExAddressLine1());
									add.setCity(itemAdd.getExCity());
									add.setCountryName(itemAdd.getExCountry().cntryCd);
									add.setZipPostalCode(itemAdd.getExPostalCd());
									add.setRegion(itemAdd.getExState().exProvince);
									add.setRegionCode(itemAdd.getExState().exProvinceName);
									addrList.add(add);
									
								});
								
								worker.setAddress(addrList);
							}
						}

						// setting Phone
						ExPhone exPhone = empOutbound.getExPhone();
						if (exPhone != null) {
							if (exPhone.getItem() != null && exPhone.getItem().size() > 0) {
								List<Phone> phoneList = new ArrayList<Phone>();
								exPhone.getItem().stream().forEach(itemPhone ->{
									Phone phn = new Phone();
									phn.setType(itemPhone.getExPhoneTyp().phnTyp);
									phn.setInternationalPhoneCode(Integer.parseInt(itemPhone.getExInternationalPhnCd()));
									phn.setPhoneNumber(itemPhone.getExPhnNum());
									employee.setEmployerPhoneNumber(itemPhone.getExPhnNum());
									phoneList.add(phn);
								});
								worker.setPhone(phoneList);
							}
						}

						// setting Email
						ExEmail exEmail = empOutbound.getExEmail();
						if (exEmail != null) {
							if (exEmail.getItem() != null && exEmail.getItem().size() > 0) {
								List<Email> emailList = new ArrayList<Email>();
								exEmail.getItem().stream().forEach(itemEmail -> {
									Email email = new Email();
									email.setType(itemEmail.getExEmailTyp().addrTyp);
									email.setAddress(itemEmail.getExEmailAddr());
									emailList.add(email);
									
								});
								worker.setEmail(emailList);
							}
						}

						

						// setting Supervisor details
						ExSupervisorDetails exSupervisorDtls = empOutbound.getExSupervisorDetails();
						if (exSupervisorDtls != null) {
							if (exSupervisorDtls.getItem() != null && exSupervisorDtls.getItem().size() > 0) {
								List<Supervisor> superList = new ArrayList<Supervisor>();
								exSupervisorDtls.getItem().stream().forEach(itemSupervisorDtls ->
								{
									Supervisor supervisor = new Supervisor();
									supervisor.setName(itemSupervisorDtls.getExSupervisorName());
									supervisor.setId(itemSupervisorDtls.getExSupervisorEmployeeId());
									superList.add(supervisor);
								});
								worker.setSupervisor(superList);
							}
						}

						// setting location details
						ExLocation exLocation = empOutbound.getExLocation();
						if (exLocation != null) {
							if (exLocation.getItem() != null && exLocation.getItem().size() > 0) {
								List<Location> locationList = new ArrayList<Location>();
								exLocation.getItem().stream().forEach(itemExLocation ->{
									Location location = new Location();
									location.setLocationId(itemExLocation.getExLocationId());
									location.setLocationName(itemExLocation.getExLocationNm());
									location.setType(itemExLocation.getExLocationTyp().exLocTypNm);
									location.setAddressLine1(itemExLocation.getExAddressLine1());
									location.setCity(itemExLocation.getExCity());
									location.setPostalCode(itemExLocation.getExPostalCd());
	                                location.setTimezoneName(itemExLocation.getExTimeZone());
	                                location.setCountryName(itemExLocation.getExCountry().cntryCd);
	                                location.setCountrySubdivisionCode(itemExLocation.getExState().exProvince);
	                                location.setCountrySubdivisionName(itemExLocation.getExState().exProvinceName);
									location.setLocale(itemExLocation.getExLocale());
	                                locationList.add(location);
								});
								worker.setLocation(locationList);
							}
						}

						// setting Organization details
						ExOrganization exOrganization = empOutbound.getExOrganization();
						if (exOrganization != null) {
							if (exOrganization.getItem() != null && exOrganization.getItem().size() > 0) {
								List<Organization> orgList = new ArrayList<Organization>();
								exOrganization.getItem().stream().forEach(itemOrg ->{
									Organization org = new Organization();
									org.setId(itemOrg.getExOrganizationRefId());
									org.setType(itemOrg.getExOrganizationTyp().exOrgTypNm);
									org.setSubType(itemOrg.getExOrganizationSubTyp().exOrgSubTypNm);
									org.setName(itemOrg.getExOrganizatinNm());
									org.setIsInactive(!"ACTIVE".equalsIgnoreCase(itemOrg.getExOrganizationStatus().exOrgStsTypNm)?true:false);
									org.setManager(itemOrg.getExOrganizationMgr());
									org.setSuperiorOrganization(itemOrg.getExSupervisoryOrgNm());
									org.setAvailablityDate(itemOrg.getExOrganizationStartDt());
									// doubt
									List<OrgLevel> orgLevelList = new ArrayList<OrgLevel>();
									OrgLevel orgLevels = new OrgLevel();

									orgLevels.setOrgCode(itemOrg.getExOrganizationCd());
									orgLevels.setOrgName(itemOrg.getExOrganizatinNm());

									orgLevelList.add(orgLevels);
									org.setOrgLevels(orgLevelList);

									orgList.add(org);

								});
								worker.setOrganization(orgList);
							}
						}

						// setting Job details
						ExJob exJob = empOutbound.getExJob();
						if (exJob != null) {
							if (exJob.getItem() != null && exJob.getItem().size() > 0) {
								List<Job> jobList = new ArrayList<Job>();
								exJob.getItem().stream().forEach(itemExJob ->{
									Job job = new Job();
									job.setTitleOfPosition(itemExJob.getExJobTitle());
									job.setProfileId(Integer.parseInt(itemExJob.getExJobPrflId()));
									job.setManagementLevel(itemExJob.getExManagementLevel().exManagementLevelName);
									job.setFamilyId(itemExJob.getExJobFamilyId());
									job.setFamilyName(itemExJob.getExJobFamilyNm());
								//job.setLevel(itemExJob.getExJobLvl()) review;
								    job.setFamilyGroup(itemExJob.getExJobFamilyGroup().exJobFamilyGroupName);
									jobList.add(job);
								});
								
								worker.setJob(jobList);
							}
						}

						// setting Position details
						ExPosition exPos = empOutbound.getExPosition();
						if (exPos != null) {
							if (exPos.getItem() != null && exPos.getItem().size() > 0) {
								List<Position> posList = new ArrayList<Position>();
								exPos.getItem().stream().forEach(itemExPos -> {
									Position pos = new Position();
									pos.setId(itemExPos.getExPositionId());
									pos.setOrganizationName(itemExPos.getExOrganizationName());
									pos.setTitleOfPosition(itemExPos.getExPositionTitle());
									pos.setEffectiveDate(itemExPos.getExPositionStartDt());
									pos.setCompanyCode(itemExPos.getExCompanyCode().exCompanyCd); //review
									pos.setEmploymentType(itemExPos.getExPositionEmplymntType().exEmploymentTypeName);
									pos.setTimeType(itemExPos.getExPositionTimeTyp().exPositionTimeTypeCd);
									pos.setJobName(itemExPos.getExJobName());
									pos.setJobGroupname(itemExPos.getExJobGroupName().exJobFamilyGroupName);
									pos.setBusinessSite(itemExPos.getExBusinessSite());
									pos.setBusinessSiteName(itemExPos.getExBusinessSiteName());
									pos.setBusinessSiteRegion(itemExPos.getExBusinessSiteRegion().exProvinceName);
									pos.setBusinessSiteCity(itemExPos.getExBusinessSiteCity());
									pos.setBusinessSitePostalCode(itemExPos.getExBusinessSitePostalCd());
									pos.setBusinessSiteCountry(itemExPos.getExBusinessSiteCountry().exCntryName);
									pos.setSupervisoryOrgCode(itemExPos.getExSuperVisoryOrgCode());
									pos.setSupervisoryOrgName(itemExPos.getExSuperVisoryOrgName());
									pos.setScheduledWeeklyHours(itemExPos.getExScheduledWeeklyHours().exScheduledWeeklyHoursName);
									pos.setCompanyName(itemExPos.getExCompanyCode().exCompanyName);
									pos.setWorkerType(itemExPos.getExPositionWrkrTyp().exWorkerTypName);
									pos.setJobManagementLevel(itemExPos.getExJobManagementLevel().exManagementLevelName);					
									pos.setCostCenterCode(itemExPos.getExCostCenterCd());
									pos.setCostCenterName(itemExPos.getExCostCenterNm());

									posList.add(pos);

								});
								worker.setPosition(posList);
							}
						}
						
						//Contractor
						Contractor contractor=new Contractor();
						contractor.setVendorCode(empOutbound.getExContractorVendorCd());
						contractor.setVendorName(empOutbound.getExContractorVendorNm());
						contractor.setServiceMobilizedNum(empOutbound.getExServiceMasterId());
						contractor.setServiceMobilizedDescription(empOutbound.getExServiceMasterDesc());
	                    contractor.setContractorStartDate(empOutbound.getExHireDt());
	                    contractor.setContractorEndDate(empOutbound.getExEndEmploymentDt());
	                    worker.setContractor(contractor);
						worker.setEmployee(employee);
					}

				}

				workerList.add(worker);
			}
			);

		if(!workerList.isEmpty()) {
		response.setWorker(workerList);
		}
		}catch(Exception e) {
			LOGGER.error("Exception has occured while mapping ",e);
		}
		return response;

	   
   }

    
    public String buildTerritoryFilterQuery(WorkerSearchRequest workerSearchRequest) {
    	
    	  StringBuilder fqBuilder = new StringBuilder();
    	  if(null!= workerSearchRequest.getWorkerType() && !workerSearchRequest.getWorkerType().isEmpty())
		    {
		    	//build Workertype search url scenario one url
		    }
		    if(null != workerSearchRequest.getEmployeeId() && !workerSearchRequest.getEmployeeId().isEmpty())
		    {
		    	//build employee search url
		    }
		    if(null!= workerSearchRequest.getStartDate()|| null!=workerSearchRequest.getEndDate())
		    {
		    	//build date realate search
		    }
    	return null;
    }
   
}
