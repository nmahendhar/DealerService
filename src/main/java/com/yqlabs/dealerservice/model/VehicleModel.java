/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yqlabs.dealerservice.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author yqlabs
 */

@Entity
@Table(name="vehicle_model")
public class VehicleModel implements Serializable {
    @Id
    @GeneratedValue
    @Column(name="vehicle_id")
    private Long id;
    
    @Column(name="vehicle_model_id")
    private String modelid;
    
    @Column(name="vehicle_model_name")
    private String vehiclename;

    public VehicleModel() {
    }

    public VehicleModel(Long id, String modelid, String vehiclename) {
        this.id = id;
        this.modelid = modelid;
        this.vehiclename = vehiclename;
    }  

    public String getVehiclename() {
        return vehiclename;
    }

    public void setVehiclename(String vehiclename) {
        this.vehiclename = vehiclename;
    }

    public String getModelid() {
        return modelid;
    }

    public void setModelid(String modelid) {
        this.modelid = modelid;
    }
    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
}
