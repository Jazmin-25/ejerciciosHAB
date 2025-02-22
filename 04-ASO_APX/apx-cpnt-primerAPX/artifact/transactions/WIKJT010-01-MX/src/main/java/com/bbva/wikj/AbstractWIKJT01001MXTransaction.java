package com.bbva.wikj;

import com.bbva.elara.transaction.AbstractTransaction;
import com.bbva.wikj.dto.ejemplo.DtoIn;
import com.bbva.wikj.dto.ejemplo.DtoOut;

/**
 * In this class, the input and output data is defined automatically through the setters and getters.
 */
public abstract class AbstractWIKJT01001MXTransaction extends AbstractTransaction {

	public AbstractWIKJT01001MXTransaction(){
	}


	/**
	 * Return value for input parameter DtoIn
	 */
	protected DtoIn getDtoin(){
		return (DtoIn)this.getParameter("DtoIn");
	}

	/**
	 * Set value for DtoOut output parameter DtoOut
	 */
	protected void setDtoout(final DtoOut field){
		this.addParameter("DtoOut", field);
	}
}
