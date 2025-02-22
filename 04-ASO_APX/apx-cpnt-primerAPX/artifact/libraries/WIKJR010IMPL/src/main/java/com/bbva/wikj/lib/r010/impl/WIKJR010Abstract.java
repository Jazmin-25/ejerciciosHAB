package com.bbva.wikj.lib.r010.impl;

import com.bbva.elara.configuration.manager.application.ApplicationConfigurationService;
import com.bbva.elara.library.AbstractLibrary;
import com.bbva.wikj.lib.r010.WIKJR010;

/**
 * This class automatically defines the libraries and utilities that it will use.
 */
public abstract class WIKJR010Abstract extends AbstractLibrary implements WIKJR010 {

	protected ApplicationConfigurationService applicationConfigurationService;


	/**
	* @param applicationConfigurationService the this.applicationConfigurationService to set
	*/
	public void setApplicationConfigurationService(ApplicationConfigurationService applicationConfigurationService) {
		this.applicationConfigurationService = applicationConfigurationService;
	}

}