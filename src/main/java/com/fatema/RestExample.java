/** Copyright (C) Cit Global, Inc (VERICASH) - All Rights Reserved
 * Unauthorized copying or modification of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * 
 * http://citvericash.com
 * 
 */
package com.fatema;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 
 * @since May 1, 2018
 * @module rest-service
 * @email 
 */
@RestController
public class RestExample {

	
	@GetMapping("getBla")
	public String getBla() {
		return "bla";
	}
	
}
