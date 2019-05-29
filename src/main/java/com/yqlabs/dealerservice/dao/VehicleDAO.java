/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yqlabs.dealerservice.dao;

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
public interface VehicleDAO {
    
	public List<Vehicle> getAllUserFromDB();
	public boolean insertUserInDB(Vehicle user);
        public boolean insertPriceInDB(Price price);
        public boolean insertTDriveInDB(TestDrive tDrive);
        public List<Image> getAllImages(); 
        public Vehicle getUserFromDB(int id);
        public List<DealerVarients> getAllDealersFromDB();
        public List<TestDrive> getTestList();
        public List<VehicleModel> getAllVehicles();
}
