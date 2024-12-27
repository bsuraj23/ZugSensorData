package com.example.ZugData.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

import com.example.ZugData.model.ZugModel;
import com.example.ZugData.service.ZugService;
import com.example.ZugData.service.ZugServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class ZugRestController {

	@Autowired
	private ZugServiceInterface service;

String str1 = "sdgshqdghsgd dhgdgf";




	// Get all trains
	@GetMapping("/trains")
	public List<ZugModel> getAllTrains() {
		return service.getAllTrains();
	}

	// Add a train
	@PostMapping("/trains")
	public void addTrain(@RequestBody ZugModel zugModel) {
		service.addJobPost(zugModel);
	}

	// Edit a train detail
	@PutMapping("/trains/{id}")
	public void editTrain(@PathVariable Long id, @RequestBody ZugModel zugModel) {
		zugModel.setZugId(Math.toIntExact(id));
		service.addJobPost(zugModel);
	}

	// Delete a train
	@DeleteMapping("/trains/{id}")
	public void deleteTrain(@PathVariable Long id) {
		service.deleteJobPost(id);
	}

	// Get a train
	@GetMapping("/trains/{id}")
	public ZugModel getTrain(@PathVariable Long id) {
		return service.getJobPostById(id);
	}

	// Get all stations
	@GetMapping("/stations")
	public List<StationModel> getAllStations() {
		return service.getAllStations();

//
//		String a = "dfdf";
//		a.char
	}
	//
	// Add a station
	@PostMapping("/stations")
	public void addStation(@RequestBody StationModel stationModel) {
		service.addStation(stationModel);
	}

	// Edit a station
	@PutMapping("/stations/{id}")
	public void editStation(@PathVariable Long id, @RequestBody StationModel stationModel) {
		stationModel.setId(id);
		service.addStation(stationModel);
	}

	// Delete a station
	@DeleteMapping("/stations/{id}")
	public void deleteStation(@PathVariable Long id) {
		service.deleteStation(id);
	}

	// Get a station
	@GetMapping("/stations/{id}")
	public StationModel getStation(@PathVariable Long id) {
		return service.getStationById(id);
	}
//
//	// Get all routes
//	@GetMapping("/routes")
//	public List<RouteModel> getAllRoutes() {
//		return service.getAllRoutes();
//	}
//
//	// Add a route
//	@PostMapping("/routes")
//	public void addRoute(@RequestBody RouteModel routeModel) {
//		service.addRoute(routeModel);
//	}
//
//	// Edit a route
//	@PutMapping("/routes/{id}")
//	public void editRoute(@PathVariable Long id, @RequestBody RouteModel routeModel) {
//		routeModel.setId(id);
//		service.addRoute(routeModel);
//	}
//
//	// Delete a route
//	@DeleteMapping("/routes/{id}")
//	public void deleteRoute(@PathVariable Long id) {
//		service.deleteRoute(id);
//	}
//
//	// Get a route
//	@GetMapping("/routes/{id}")
//	public RouteModel getRoute(@PathVariable Long id) {
//		return service.getRouteById(id);
//	}

}
