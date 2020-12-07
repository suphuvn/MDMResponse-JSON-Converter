package com.deloitte.workersearch.api.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.deloitte.workersearch.api.mdmresponse.ItemEmployeeOutboundResponse;
import com.deloitte.workersearch.api.response.WorkerOutboundResponse;
import com.deloitte.workersearch.api.service.search.WorkerOutboundMapping;
import com.deloitte.workersearch.properties.SunCoreClientProperties;
import com.deloitte.workersearch.request.WorkerSearchRequest;




@RestController
public class WorkerSearchController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(WorkerOutboundMapping.class);
	
	
	@Autowired
	private WorkerOutboundMapping workerOutboundMapping;
	
	@Autowired
	private SunCoreClientProperties sunCoreClientProperties;

	@GetMapping(path="/api/healthcheck")
	public String healthCheck()
	{
		return "Worker Search is Running " + new java.util.Date();
	}
	
	 
	@PostMapping(path="/api/workersearchoutbound")
	public WorkerOutboundResponse searchWorkerDetails(@RequestBody WorkerSearchRequest workerSearchRequest ) {

		    LOGGER.info("Request",workerSearchRequest.toString());
		   // LOGGER.info(sunCoreClientProperties.getUrl().getWorkerSearch());
		    LOGGER.info(sunCoreClientProperties.getLoginName());
		    return workerOutboundMapping.processWorkerDetails();
		

		}
	  
}
