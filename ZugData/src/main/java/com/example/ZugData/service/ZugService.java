package com.example.ZugData.service;

import java.util.ArrayList;
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

//	return repo.getAllJobs();
		List<ZugModel> fakeTrains = new ArrayList<>();
		fakeTrains.add(new ZugModel(1L, "Train 1", "Description 1"));
		fakeTrains.add(new ZugModel(2L, "Train 2", "Description 2"));
		fakeTrains.add(new ZugModel(3L, "Train 3", "Description 3"));
		return fakeTrains;
//List l = new Arraylist('dfjhdhf');
//		return l;
	}
	
	
	
	

	// ****************************************************************************

	//method to save a job post object into arrayList


	
	


	
}
