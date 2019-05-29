/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yqlabs.dealerservice.service;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author yqlabs
 */
public class DealerStaticServiceImpl implements DealerStaticService{

    @Override
    public JSONObject dealerSafety() {
    JSONObject dealerList=new JSONObject();
		JSONArray dealer=new JSONArray();
		JSONObject dealerArray=new JSONObject();
		try{
                    
                    String safety="Stability Control :"+"Standard"
                            +"<br>Transaction Control :"+"Standard"
                            +"<br>Daytime Running Lights :"+"Standard"
                            +"<br>Passenger Air Bag :"+"Standard"
                            +"<br>Driver Air Bag :"+"Standard"
                            +"<br>Front Side Air Bag :"+"Standard"
                            +"<br>Passenger Air Bag :"+"Standard"
                            +"<br>Front Head Air Bag :"+"Standard"
                            +"<br>Rear Head Air Bag :"+"Standard"
                            +"<br>Emergency Trunk Realease :"+"Standard";
			JSONObject obj=new JSONObject();    
                        obj.put("safety", safety);
			dealer.put(obj);
		dealerArray.put("dealer", dealer);
                dealerList.put("dealerList", dealerArray);
		}catch(JSONException je){
			je.printStackTrace();
		}
		return dealerList;
    }

    @Override
    public JSONObject getVehicleDisplay() {
        JSONObject dealerList=new JSONObject();
		JSONArray dealer=new JSONArray();
		JSONObject dealerArray=new JSONObject();
		try{
		    
                    String specs = "ABS<br>3.450:1 axle ratio<br>Four-wheel disc brakes:four ventilated"
                            + "<br>Electronic brake distrubution<br>Electronic traction control(via ABS & engine management)"
                            + "<br>Immobilizer<br>Rear mechanical limited-slip differential"
                            +"<br>Electronic brake distribution"
                            +"<br>Electronic traction control(via ABS & engine management)"
                            +"<br>Immobilizer"
                            +"<br>Rear mechanical limited-slip differential"
                            +"<br>StabiliTrack stability control"
                            +"<br>Independent front and rear multi-link suspension with stabilizer bar and coil springs"
                            +"<br>Tire kit";
			
			JSONObject obj=new JSONObject();
                        obj.put("specs", specs); 
                dealer.put(obj);
		dealerArray.put("dealer", dealer);
                dealerList.put("dealerList", dealerArray);
		}catch(JSONException je){
			je.printStackTrace();
		}
		return dealerList;
                }

    @Override
    public JSONObject getDealerWarranty() {
        JSONObject dealerList=new JSONObject();
		JSONArray dealer=new JSONArray();
		JSONObject dealerArray=new JSONObject();
		try{
		    
                    String specs = "ABS<br>3.450:1 axle ratio<br>Four-wheel disc brakes:four ventilated"
                            + "<br>Electronic brake distrubution<br>Electronic traction control(via ABS & engine management)"
                            + "<br>Immobilizer<br>Rear mechanical limited-slip differential"
                            +"<br>Electronic brake distribution"
                            +"<br>Electronic traction control(via ABS & engine management)"
                            +"<br>Immobilizer"
                            +"<br>Rear mechanical limited-slip differential"
                            +"<br>StabiliTrack stability control"
                            +"<br>Independent front and rear multi-link suspension with stabilizer bar and coil springs"
                            +"<br>Tire kit";
			
			JSONObject obj=new JSONObject();
                        obj.put("specs", specs); 
                dealer.put(obj);
		dealerArray.put("dealer", dealer);
                dealerList.put("dealerList", dealerArray);
		}catch(JSONException je){
			je.printStackTrace();
		}
		return dealerList;    
    }

    @Override
    public JSONObject getDealerAccessories() {
                JSONObject dealerList=new JSONObject();
		JSONArray dealer=new JSONArray();
		JSONObject dealerArray=new JSONObject();
		try{
		    
                    String specs = "ABS<br>3.450:1 axle ratio<br>Four-wheel disc brakes:four ventilated"
                            + "<br>Electronic brake distrubution<br>Electronic traction control(via ABS & engine management)"
                            + "<br>Immobilizer<br>Rear mechanical limited-slip differential"
                            +"<br>Electronic brake distribution"
                            +"<br>Electronic traction control(via ABS & engine management)"
                            +"<br>Immobilizer"
                            +"<br>Rear mechanical limited-slip differential"
                            +"<br>StabiliTrack stability control"
                            +"<br>Independent front and rear multi-link suspension with stabilizer bar and coil springs"
                            +"<br>Tire kit";
			
			JSONObject obj=new JSONObject();
                        obj.put("specs", specs); 
                dealer.put(obj);
		dealerArray.put("dealer", dealer);
                dealerList.put("dealerList", dealerArray);
		}catch(JSONException je){
			je.printStackTrace();
		}
		return dealerList; }
    
    
}
