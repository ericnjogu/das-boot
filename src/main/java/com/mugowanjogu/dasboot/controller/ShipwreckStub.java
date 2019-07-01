/**
 * 
 */
package com.mugowanjogu.dasboot.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.mugowanjogu.dasboot.model.Shipwreck;

/**
 * @author @mugowanjogu
 *
 */
@Component
public class ShipwreckStub {
	private Map<Long, Shipwreck> wrecks;
	
	public ShipwreckStub() {
		wrecks = new HashMap<>();
		Shipwreck ship1 = new Shipwreck(1l, "Watamu", "Fishing boat", "good", 20, 10d, 30d, 1972);
		wrecks.put(ship1.getId(), ship1);
		Shipwreck ship2 = new Shipwreck(2l, "Mombasa", "Pleasure boat", "fair", 40, 90d, 50d, 1990);
		wrecks.put(ship2.getId(), ship2);
		Shipwreck ship3 = new Shipwreck(3l, "Lamu", "Dhow", "excellent", 10, 10d, 110d, 2010);
		wrecks.put(ship3.getId(), ship3);
	}
	
	public Collection<Shipwreck> list() {
		return getWrecks().values();
	}
	
	public Shipwreck create(Shipwreck wreck) {
		getWrecks().put(wreck.getId(), wreck);
		return wreck;
	}
	
	public Shipwreck update(Shipwreck wreck) {
		getWrecks().put(wreck.getId(), wreck);
		return wreck;
	}
	
	public Shipwreck delete(Long id) {
		Shipwreck wreck = getWrecks().get(id);
		getWrecks().remove(id);
		return wreck;
	}
	
	public Shipwreck get(Long id) {
		return getWrecks().get(id);
	}

	/**
	 * @return the wrecks
	 */
	public Map<Long, Shipwreck> getWrecks() {
		return wrecks;
	}

	/**
	 * @param wrecks the wrecks to set
	 */
	public void setWrecks(Map<Long, Shipwreck> wrecks) {
		this.wrecks = wrecks;
	}

}
