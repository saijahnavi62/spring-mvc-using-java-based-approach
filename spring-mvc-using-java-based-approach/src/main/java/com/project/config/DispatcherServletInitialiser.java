package com.project.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.project.config.MyConfigurationFile;

public class DispatcherServletInitialiser extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		
		return new Class<?>[] {MyConfigurationFile.class};
	}

	@Override
	protected String[] getServletMappings() {
		 System.out.println("Initializer Loaded");

		
		return new String[] {"/student.com/*"};
	}

}
