package com.bbva.wikj.lib.r889;

import java.util.Map;

/**
 * The  interface WIKJR889 class...
 */
public interface WIKJR889 {

	/**
	 * The execute method...
	 */
	Map<String, Object> executeSelect(String userid);
	int executeInsert(Map<String, Object> args);
}
