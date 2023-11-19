package com._SpringCourse_RestAPI.Controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com._SpringCourse_RestAPI.Config.CurrencyServiceConfiguration;

@RestController
public class ConfigPropertyOverrideExample {
	
	@Autowired
	private CurrencyServiceConfiguration currencyServiceConfiguration;

	@RequestMapping("/service-config")
	public CurrencyServiceConfiguration getServiceConfig(){
				
		return currencyServiceConfiguration;
	}
	
}
