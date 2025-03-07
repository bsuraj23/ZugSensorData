package com.example.ZugData.service;

import com.example.ZugData.model.ZugModel;
import com.example.ZugData.repo.ZugRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class TrafficService implements ZugServiceInterface {
	@Autowired
	public ZugRepo repo;



	@Override
	public List<ZugModel> getAllTrains() {
		return repo.findAll();
	}
	
}
