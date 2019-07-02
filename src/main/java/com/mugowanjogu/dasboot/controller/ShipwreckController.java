/**
 * 
 */
package com.mugowanjogu.dasboot.controller;

import java.util.Collection;
import java.util.Optional;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mugowanjogu.dasboot.model.Shipwreck;
import com.mugowanjogu.dasboot.repository.ShipwreckRepository;

/**
 * @author @mugowanjogu
 *
 */
@RestController
@RequestMapping("api/v1/wrecks")
public class ShipwreckController {
	
	@Autowired
	private ShipwreckRepository repository;
	private Log log = LogFactory.getLog(getClass());
	
	@RequestMapping(method = RequestMethod.GET, value = "all")
	public Collection<Shipwreck> list() {
		return repository.findAll();
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public Shipwreck update(@RequestBody Shipwreck wreck) {
		return repository.save(wreck);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public Shipwreck create(@RequestBody Shipwreck wreck) {
		return repository.save(wreck);
	}
	
	@RequestMapping(method = RequestMethod.GET, value="{id}")
	public Optional<Shipwreck> get(@PathVariable Long id) {
		log.debug("retrieving shipwreck with id: " + id);
		
		return repository.findById(id);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value="{id}")
	public Shipwreck delete(@PathVariable Long id) {
		repository.deleteById(id);
		return null;
	}
}
