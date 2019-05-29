/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yqlabs.dealerservice.service;

import com.yqlabs.dealerservice.model.DealerVarients;
import com.yqlabs.dealerservice.model.Image;
import com.yqlabs.dealerservice.model.Price;
import com.yqlabs.dealerservice.model.TestDrive;
import com.yqlabs.dealerservice.model.Vehicle;
import com.yqlabs.dealerservice.model.VehicleModel;
import java.util.List;

/**
 *
 * @author mahandar
 */
public interface VehicleService {
    
	public List<Vehicle> getUsers();
	public boolean insertUser(Vehicle user);
        public boolean insertPrice(Price price);
        public boolean insertTDrive(TestDrive tDrive);
        public Vehicle getUserbyId(int id);
        public List<Image> getImages();
        public List<DealerVarients> getVarient();
        public List<TestDrive> getAllTests();
        public List<VehicleModel> getAllVehicleModels();
}
