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
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="dealer_images")
public class Image implements Serializable {
	@Id
	@Column(name="image_id")
	private int id;
	@Column(name="modelid")
	private String modelid;
	@Column(name="image_url")
	private String imageurl;
	@Column(name="image_type")
	private String imagetype;
        @Column(name="image_color")
        private String imagecolour;
	public Image(){
	}

    public Image(int id, String modelid, String imageurl, String imagetype, String imagecolour) {
        this.id = id;
        this.modelid = modelid;
        this.imageurl = imageurl;
        this.imagetype = imagetype;
        this.imagecolour = imagecolour;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModelid() {
        return modelid;
    }

    public void setModelid(String modelid) {
        this.modelid = modelid;
    }

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }

    public String getImagetype() {
        return imagetype;
    }

    public void setImagetype(String imagetype) {
        this.imagetype = imagetype;
    }

    public String getImagecolour() {
        return imagecolour;
    }

    public void setImagecolour(String imagecolour) {
        this.imagecolour = imagecolour;
    }
	
	
}
