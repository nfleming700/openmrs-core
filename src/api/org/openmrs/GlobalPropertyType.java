/**
 * The contents of this file are subject to the OpenMRS Public License
 * Version 1.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://license.openmrs.org
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations
 * under the License.
 *
 * Copyright (C) OpenMRS, LLC.  All Rights Reserved.
 */
package org.openmrs;

import java.util.Date;


/**
 *
 */
public class GlobalPropertyType {
	
	private Integer globalPropertyTypeId;
	
	private String name;
	
	private String description;
	
	private User createdBy;
	
	private Date dateCreated;
	
	private boolean voided;
	
	private Date dateVoided;
	
	public GlobalPropertyType() {
	}
	
	public GlobalPropertyType(String name) {
		this.name = name;
	}
	
	public GlobalPropertyType(String name, Integer id) {
		this.name = name;
		this.globalPropertyTypeId = id;
	}
	
    /**
     * @return the globalPropertyTypeId
     */
    public Integer getGlobalPropertyTypeId() {
    	return globalPropertyTypeId;
    }
	
    /**
     * @param globalPropertyTypeId the globalPropertyTypeId to set
     */
    public void setGlobalPropertyTypeId(Integer globalPropertyTypeId) {
    	this.globalPropertyTypeId = globalPropertyTypeId;
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
     * @param description the description to set
     */
    public void setDescription(String description) {
	    this.description = description;
    }

	/**
     * @return the description
     */
    public String getDescription() {
	    return description;
    }
	
    /**
     * @return the createdBy
     */
    public User getCreatedBy() {
    	return createdBy;
    }
	
    /**
     * @param createdBy the createdBy to set
     */
    public void setCreatedBy(User createdBy) {
    	this.createdBy = createdBy;
    }
	
    /**
     * @return the dateCreated
     */
    public Date getDateCreated() {
    	return dateCreated;
    }
	
    /**
     * @param dateCreated the dateCreated to set
     */
    public void setDateCreated(Date dateCreated) {
    	this.dateCreated = dateCreated;
    }
	
    /**
     * @return the voided
     */
    public boolean isVoided() {
    	return voided;
    }
	
    /**
     * @param voided the voided to set
     */
    public void setVoided(boolean voided) {
    	this.voided = voided;
    }
	
    /**
     * @return the dateVoided
     */
    public Date getDateVoided() {
    	return dateVoided;
    }
	
    /**
     * @param dateVoided the dateVoided to set
     */
    public void setDateVoided(Date dateVoided) {
    	this.dateVoided = dateVoided;
    }
}
