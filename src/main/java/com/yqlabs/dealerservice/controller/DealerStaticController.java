/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yqlabs.dealerservice.controller;

import com.yqlabs.dealerservice.service.DealerStaticService;
import com.yqlabs.dealerservice.service.DealerStaticServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author yqlabs
 */
@RestController
@RequestMapping(path = "/stat")
public class DealerStaticController {
   
    DealerStaticService vehiclestatserv=new DealerStaticServiceImpl();
   @RequestMapping(value="/safety",method = RequestMethod.GET,produces = "application/json")
   public String dealerSafety(){
       
       return vehiclestatserv.dealerSafety().toString();
   }
   @RequestMapping(value="/specifications",method = RequestMethod.GET,produces = "application/json")
   public String dealerSpecifications(){
       
       return vehiclestatserv.getVehicleDisplay().toString();
   }
   @RequestMapping(value="/warranty",method = RequestMethod.GET,produces = "application/json")
   public String dealerWarranty(){
       return vehiclestatserv.getDealerWarranty().toString();
   }
   @RequestMapping(value="/accessories",method = RequestMethod.GET,produces = "application/json")
   public String dealerAccesories(){
       return vehiclestatserv.getDealerAccessories().toString();
   }
}
