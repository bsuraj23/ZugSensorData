package com.example.ZugData.service;

import java.util.List;

import com.example.ZugData.repo.ZugRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import com.example.ZugData.model.ZugModel;
@Service
public class ZugService {
	@Autowired
	public ZugRepo repo;
	


	
	//method to return all JobPosts
	public List<ZugModel> getAllJobs() {
		return repo.getAllJobs();

		
	}
	
	
	
	

	// ***************************************************************************


	
	
	
	// method to add a jobPost
	public void addJobPost(ZugModel zugModel) {
		 repo.addJobPost(zugModel);
	
	}

	
}
