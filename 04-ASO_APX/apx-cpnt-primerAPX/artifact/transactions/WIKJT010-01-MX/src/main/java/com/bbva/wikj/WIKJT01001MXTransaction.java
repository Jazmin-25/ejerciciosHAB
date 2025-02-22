package com.bbva.wikj;

import com.bbva.wikj.dto.ejemplo.DtoOut;
import com.bbva.wikj.lib.r010.WIKJR010;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * transaction
 *
 */
public class WIKJT01001MXTransaction extends AbstractWIKJT01001MXTransaction {

	private static final Logger LOGGER = LoggerFactory.getLogger(WIKJT01001MXTransaction.class);

	/**
	 * The execute method...
	 */
	@Override
	public void execute() {
		WIKJR010 wikjR010 = this.getServiceLibrary(WIKJR010.class);
		DtoOut dtoout = wikjR010.execute(this.getDtoin());
	}

}
