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
@Table(name="dealer_test_drive")
public class TestDrive implements Serializable {
    @Id
    @GeneratedValue
    @Column(name="test_drive_id")
    private Long id;
    @Column(name="test_drive_name")
    private String name;
    @Column(name="test_drive_phone")
    private Long phone;
    @Column(name="test_drive_pref_time")
    private String dateandtime;

    public TestDrive() {
    }

    public TestDrive(Long id, String name, Long phone, String dateandtime) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.dateandtime = dateandtime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public String getDateandtime() {
        return dateandtime;
    }

    public void setDateandtime(String dateandtime) {
        this.dateandtime = dateandtime;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
}
