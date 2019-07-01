/**
 * 
 */
package com.mugowanjogu.dasboot.controller;

import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@RequestMapping(method = RequestMethod.PUT)
	public Shipwreck update(@RequestBody Shipwreck wreck) {
		return stub.update(wreck);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public Shipwreck create(@RequestBody Shipwreck wreck) {
		return stub.create(wreck);
	}
	
	@RequestMapping(method = RequestMethod.GET, value="{id}")
	public Shipwreck get(@PathVariable Long id) {
		return stub.get(id);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value="{id}")
	public Shipwreck delete(@PathVariable Long id) {
		return stub.delete(id);
	}
}
