package com.example.ZugData.controller;

import java.util.List;

import com.example.ZugData.model.ZugModel;
import com.example.ZugData.service.ZugService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController	
public class ZugRestController {
	
	@Autowired
	private ZugService service;
	//get all trains

	@GetMapping("/trains")
	public List<ZugModel> getAllTrains() {
		return service.getAllJobs();
	}

	//add a train

	//edit a train detail

	//delete a train

	//get a train

	//get all stations

	//add a station

	//edit a station

	//delete a station

	//get a station

	//get all routes

	//delete route
	//add route

	// get route

	//set or edit new route
	
	@GetMapping("jobPosts")
	public List<ZugModel> getAllJobs() {
		return service.getAllJobs();
		
	}

}
