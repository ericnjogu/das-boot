/**
 * 
 */
package com.mugowanjogu.dasboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author @mugowanjogu
 *
 */
@RestController
public class HomeController {
	
	@RequestMapping
	public String home() {
		return "Here we go!";
	}
	
}
