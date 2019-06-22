/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yqlabs.dealerservice.controller;

import com.yqlabs.dealerservice.model.Vehicle;
import com.yqlabs.dealerservice.service.VehicleService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author yqlabs
 */
@RestController
@RequestMapping(path = "/dealerservice")
public class DealerServiceController {
	@Autowired
	private VehicleService userService;

	/*
	 * usual comments
	 */

	@RequestMapping(path = "/{id}", method = RequestMethod.GET, produces = "application/json")
	public Vehicle getUser(@PathVariable int id) {
		Vehicle user = userService.getUserbyId(id);
		return user;
	}

	@RequestMapping(path = "/all", method = RequestMethod.GET, produces = "application/json")
	public List<Vehicle> getAllUser() {
		return userService.getUsers();
	}

	@RequestMapping(path = "/insert", method = RequestMethod.POST, produces = "application/json")
	public String insertUser(@RequestBody Vehicle user) {

		boolean stats = userService.insertUser(user);

		if (stats) {
			return "sucessfully inserted";
		} else {
			return "Inserting record Fail";
		}

	}

}
