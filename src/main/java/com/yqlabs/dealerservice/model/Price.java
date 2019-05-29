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
@Table(name="dealer_price_quote")
public class Price implements Serializable {
    @Id
    @GeneratedValue
    @Column(name="quote_id")
    private Long id;
    @Column(name="quote_year")
    private String year;
    @Column(name="quote_model")
    private String model;
    @Column(name="quote_config")
    private String config;
    @Column(name="quote_trim_level")
    private String trimlevel;
    @Column(name="quote_first_name")
    private String firstname;
    @Column(name="quote_address")
    private String address;
    @Column(name="quote_zip_code")
    private String zipcode;
    @Column(name="quote_phone")
    private String phonenum;
    @Column(name="quote_email")
    private String email;
    @Column(name="quote_contact_pref")
    private String preference;
    public Long getId() {
        return id;
    }

    public Price(Long id, String year, String model, String config, String trimlevel, String firstname, String address, String zipcode, String phonenum, String email, String preference) {
        this.id = id;
        this.year = year;
        this.model = model;
        this.config = config;
        this.trimlevel = trimlevel;
        this.firstname = firstname;
        this.address = address;
        this.zipcode = zipcode;
        this.phonenum = phonenum;
        this.email = email;
        this.preference = preference;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public Price() {
    }

    
    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

//    public int getYear() {
//        return year;
//    }
//
//    public void setYear(int year) {
//        this.year = year;
//    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getConfig() {
        return config;
    }

    public void setConfig(String config) {
        this.config = config;
    }

    public String getTrimlevel() {
        return trimlevel;
    }

    public void setTrimlevel(String trimlevel) {
        this.trimlevel = trimlevel;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getPhonenum() {
        return phonenum;
    }

//    public int getZipcode() {
//        return zipcode;
//    }
//
//    public void setZipcode(int zipcode) {
//        this.zipcode = zipcode;
//    }
//
//    public Long getPhonenum() {
//        return phonenum;
//    }
//    public void setPhonenum(Long phonenum) {
//        this.phonenum = phonenum;
//    }
    public void setPhonenum(String phonenum) {
        this.phonenum = phonenum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPreference() {
        return preference;
    }

    public void setPreference(String preference) {
        this.preference = preference;
    }

    
}
