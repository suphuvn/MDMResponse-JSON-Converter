package com.deloitte.workersearch.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


@Component
@ConfigurationProperties("bes.services")
public class SunCoreClientProperties {
	
	private String loginName;
	private String loginPassword;

	public String getLoginName() {
		return loginName;
	}



	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}



	public String getLoginPassword() {
		return loginPassword;
	}



	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}

}