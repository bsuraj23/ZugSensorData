package com.example.ZugData.controller;

import com.example.ZugData.model.ZugModel;
import com.example.ZugData.service.ZugServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
asihdgsadhgsd

ihagugdafsd
jdjdfgfd

import java.util.List;


@RestController
public class DriverRestController {

	@Autowired
	private ZugServiceInterface service;

String str1 = "sdgshqdghsgd dhgdgf";




	// Get all trains
	@GetMapping("/driver")
	public List<ZugModel> getAllTrains() {
		return service.getAllTrains();
	}

	// Add a train
	@PostMapping("/drivers")
	public void addTrain(@RequestBody ZugModel zugModel) {
		service.addJobPost(zugModel);
	}

	// Edit a train detail
	@PutMapping("/driver/{id}")
	public void editTrain(@PathVariable Long id, @RequestBody ZugModel zugModel) {
		zugModel.setZugId(Math.toIntExact(id));
		service.addJobPost(zugModel);
	}

	// Delete a train
	@DeleteMapping("/drivers/{id}")
	public void deleteTrain(@PathVariable Long id) {
		service.deleteJobPost(id);
	}

	// Get a train
	@GetMapping("/trains/{id}")
	public ZugModel getTrain(@PathVariable Long id) {
		return service.getJobPostById(id);
	}

	// Get all stations
	@GetMapping("/driverGroup")
	public List<StationModel> getAllStations() {
		return service.getAllStations();


}
