package com.cg.training.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{
//add all the configurations in this method
	@Override
	protected Class<?>[] getRootConfigClasses() {
		
		return new Class[] {AppViewResolver.class };
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		
		return null;
	}

	@Override
	protected String[] getServletMappings() {
		//Add the base url mapping
		return new String[] {"/"};
	}

}
