/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yqlabs.dealerservice.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 *
 * @author yqlabs
 */
@Entity
@Table(name="vehicle_rfid_details")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Vehicle  implements Serializable {
	@Id
	@Column(name="id")
	private int id;
        @Column(name="vin")
        private String vin;
	@Column(name="brand_name")
	private String name;
        @Column(name="service_type")
        private String srvtype;
        @Column(name="damage")
        private String damage;
	@Column(name="location")
	private String location;
        @Column(name="status")
        private String status;

    public Vehicle() {  
    }

    public Vehicle(int id, String vin, String name, String srvtype, String damage, String location, String status) {
        this.id = id;
        this.vin = vin;
        this.name = name;
        this.srvtype = srvtype;
        this.damage = damage;
        this.location = location;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSrvtype() {
        return srvtype;
    }

    public void setSrvtype(String srvtype) {
        this.srvtype = srvtype;
    }

    public String getDamage() {
        return damage;
    }

    public void setDamage(String damage) {
        this.damage = damage;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setDamage(int damage) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
