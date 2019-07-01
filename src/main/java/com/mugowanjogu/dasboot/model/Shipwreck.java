/**
 * 
 */
package com.mugowanjogu.dasboot.model;

/**
 * @author @mugowanjogu
 *
 */
public class Shipwreck {
	private Long id;
	private String name;
	private String description;
	private String condition;
	private Integer depth;
	private Double latitude;
	private Double longitude;
	private Integer yearDiscovered;
	
	/**
	 * @param id
	 * @param name
	 * @param description
	 * @param condition
	 * @param depth
	 * @param latitude
	 * @param longitude
	 * @param yearDiscovered
	 */
	public Shipwreck(Long id, String name, String description, String condition, Integer depth, Double latitude,
			Double longitude, Integer yearDiscovered) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.condition = condition;
		this.depth = depth;
		this.latitude = latitude;
		this.longitude = longitude;
		this.yearDiscovered = yearDiscovered;
	}
	
	/**
	 * 
	 */
	public Shipwreck() {
		super();
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the condition
	 */
	public String getCondition() {
		return condition;
	}
	/**
	 * @param condition the condition to set
	 */
	public void setCondition(String condition) {
		this.condition = condition;
	}
	/**
	 * @return the depth
	 */
	public Integer getDepth() {
		return depth;
	}
	/**
	 * @param depth the depth to set
	 */
	public void setDepth(Integer depth) {
		this.depth = depth;
	}
	/**
	 * @return the latitude
	 */
	public Double getLatitude() {
		return latitude;
	}
	/**
	 * @param latitude the latitude to set
	 */
	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}
	/**
	 * @return the longitude
	 */
	public Double getLongitude() {
		return longitude;
	}
	/**
	 * @param longitude the longitude to set
	 */
	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}
	/**
	 * @return the yearDiscovered
	 */
	public Integer getYearDiscovered() {
		return yearDiscovered;
	}
	/**
	 * @param yearDiscovered the yearDiscovered to set
	 */
	public void setYearDiscovered(Integer yearDiscovered) {
		this.yearDiscovered = yearDiscovered;
	}
}
