/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yqlabs.dealerservice.service;

import com.yqlabs.dealerservice.dao.VehicleDAO;
import com.yqlabs.dealerservice.model.DealerVarients;
import com.yqlabs.dealerservice.model.Image;
import com.yqlabs.dealerservice.model.Price;
import com.yqlabs.dealerservice.model.TestDrive;
import com.yqlabs.dealerservice.model.Vehicle;
import com.yqlabs.dealerservice.model.VehicleModel;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author mahandar
 */
public class VehicleServiceImpl implements VehicleService{

    @Autowired
    VehicleDAO vehicleDao;

    public VehicleDAO getVehicleDao() {
        return vehicleDao;
    }

    public void setVehicleDao(VehicleDAO vehicleDao) {
        this.vehicleDao = vehicleDao;
    }
    
    
    @Override
    public Vehicle getUserbyId(int id) {
        return vehicleDao.getUserFromDB(id);
            }

    @Override
    public List<Vehicle> getUsers() {
        return vehicleDao.getAllUserFromDB();
          }

    @Override
    public boolean insertUser(Vehicle user) {
        return vehicleDao.insertUserInDB(user);
        }

    @Override
    public boolean insertPrice(Price price) {
        
    return vehicleDao.insertPriceInDB(price);
    }

    @Override
    public boolean insertTDrive(TestDrive tDrive) {
    return vehicleDao.insertTDriveInDB(tDrive);
    }

    @Override
    public List<Image> getImages() {
    return vehicleDao.getAllImages();
    }

    @Override
    public List<DealerVarients> getVarient() {
     return vehicleDao.getAllDealersFromDB();
    }

    @Override
    public List<TestDrive> getAllTests() {
    return vehicleDao.getTestList();
    }

    @Override
    public List<VehicleModel> getAllVehicleModels() {
    return vehicleDao.getAllVehicles();
    }
    
}
