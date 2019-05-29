/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yqlabs.dealerservice.controller;

import com.yqlabs.dealerservice.model.DealerVarients;
import com.yqlabs.dealerservice.model.Image;
import com.yqlabs.dealerservice.model.Price;
import com.yqlabs.dealerservice.model.TestDrive;
import com.yqlabs.dealerservice.model.VehicleModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.yqlabs.dealerservice.service.VehicleService;
import java.util.List;
import org.springframework.web.bind.annotation.RequestBody;


/**
 *
 * @author mahandar
 */
@RestController
@RequestMapping("/vehicle")
public class VehicleController {


	@Autowired
	VehicleService userService;
        
        @RequestMapping(path="/dimage",method = RequestMethod.GET,produces = "application/json")
        public List<Image> getAllImages(){
            
            return userService.getImages();
        }
        @RequestMapping(path="/readTestDrive",method = RequestMethod.GET,produces = "application/json")
        public List<TestDrive> getAllTestDrives(){
            return userService.getAllTests();
        }
        @RequestMapping(value="/varient",method = RequestMethod.GET,produces = "application/json")
        public List<DealerVarients> getAllVarients(){
            return userService.getVarient();
        }
        
        @RequestMapping(value="/price",method = RequestMethod.POST,produces = "application/json")
        public Price insertPrice(@RequestBody Price price){
        boolean stats=userService.insertPrice(price);
            return price;
        }
        @RequestMapping(value = "/vmodel",method = RequestMethod.GET,produces = "application/json")
        public List<VehicleModel> getAllVehicleModels(){
            return userService.getAllVehicleModels();
        } 
        @RequestMapping(value="/tDrive",method = RequestMethod.POST,produces = "application/json")
        public TestDrive insertTestDrive(@RequestBody TestDrive tDrive){
            boolean stats=userService.insertTDrive(tDrive);
            return tDrive;
        }
        

}

    

