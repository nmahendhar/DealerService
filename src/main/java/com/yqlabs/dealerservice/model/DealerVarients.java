/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yqlabs.dealerservice.model;

/**
 *
 * @author yqlabs
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author yqlabs
 */
@Entity
@Table(name="dealer_variants")
public class DealerVarients implements Serializable {
    @Id
    @Column(name="variant_id")
    private Long id;
    @Column(name="variant_model")
    private String varientModel;
    @Column(name="variant_desc")
    private String varientDesc;
    @Column(name="variant_image_url")
    private String varientImgUrl;
    @Column(name="variant_specs")
    private String varientspecs;
    @Column(name="variant_price")
    private Long varientPrice;

    public DealerVarients() {
    }

    public DealerVarients(Long id, String varientModel, String varientDesc, String varientImgUrl, String varientspecs, Long varientPrice) {
        this.id = id;
        this.varientModel = varientModel;
        this.varientDesc = varientDesc;
        this.varientImgUrl = varientImgUrl;
        this.varientspecs = varientspecs;
        this.varientPrice = varientPrice;
    }

    

    public String getVarientModel() {
        return varientModel;
    }

    public void setVarientModel(String varientModel) {
        this.varientModel = varientModel;
    }

    public String getVarientDesc() {
        return varientDesc;
    }

    public void setVarientDesc(String varientDesc) {
        this.varientDesc = varientDesc;
    }

    public String getVarientImgUrl() {
        return varientImgUrl;
    }

    public void setVarientImgUrl(String varientImgUrl) {
        this.varientImgUrl = varientImgUrl;
    }

    public String getVarientspecs() {
        return varientspecs;
    }

    public void setVarientspecs(String varientspecs) {
        this.varientspecs = varientspecs;
    }

    public Long getVarientPrice() {
        return varientPrice;
    }

    public void setVarientPrice(Long varientPrice) {
        this.varientPrice = varientPrice;
    }

    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
}
