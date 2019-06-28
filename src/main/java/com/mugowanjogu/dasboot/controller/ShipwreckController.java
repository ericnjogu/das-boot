/**
 * 
 */
package com.mugowanjogu.dasboot.controller;

import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mugowanjogu.dasboot.model.Shipwreck;

/**
 * @author @mugowanjogu
 *
 */
@RestController
@RequestMapping("api/v1/wrecks")
public class ShipwreckController {
	@Autowired
	private ShipwreckStub stub;
	
	@RequestMapping(method = RequestMethod.GET, value = "all")
	public Collection<Shipwreck> list() {
		return stub.list();
	}
}
