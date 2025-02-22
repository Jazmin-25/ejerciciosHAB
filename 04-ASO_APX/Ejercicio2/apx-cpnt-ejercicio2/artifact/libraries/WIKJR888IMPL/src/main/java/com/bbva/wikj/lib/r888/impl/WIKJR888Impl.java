package com.bbva.wikj.lib.r888.impl;

import com.bbva.wikj.dto.user.DtoIn;
import com.bbva.wikj.dto.user.DtoOut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;


public class WIKJR888Impl extends WIKJR888Abstract {

	private static final Logger LOGGER = LoggerFactory.getLogger(WIKJR888Impl.class);


	@Override
	public DtoOut execute(DtoIn dtoIn) {
		DtoOut dtoOut = new DtoOut();
		Map<String, Object> args = new HashMap<>();
		args.put("userid",dtoIn.getUserid());
		args.put("password",dtoIn.getPassword());
		int result = this.wikjR889.executeInsert(args);
		if(result == 1){
			Map<String, Object> response = this.wikjR889.executeSelect(dtoIn.getUserid());
			dtoOut.setUserid(response.get("user_id").toString());
			dtoOut.setPassword(response.get("password").toString());
		}
		return dtoOut;
	}
}
