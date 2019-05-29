/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yqlabs.dealerservice.service;

import org.json.JSONObject;

/**
 *
 * @author yqlabs
 */
public interface DealerStaticService {
 public JSONObject dealerSafety();
 public JSONObject getVehicleDisplay();
 public JSONObject getDealerWarranty();
 public JSONObject getDealerAccessories();
}