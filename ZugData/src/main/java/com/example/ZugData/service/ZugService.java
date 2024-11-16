package com.example.ZugData.service;

import java.util.List;

import com.example.ZugData.repo.ZugRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import com.example.ZugData.model.ZugModel;
@Service
public class ZugService implements ZugServiceInterface {
	@Autowired
	public ZugRepo repo;
	


	
	//method to return all JobPosts
	public List<ZugModel> getAllTrains() {
		return repo.getAllJobs();

		
	}
	
	
	
	

	// ***************************************************************************


	
	


	
}
