package com.example.ZugData.service;

import com.example.ZugData.model.ZugModel;
import com.example.ZugData.repo.ZugRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class StationService implements ZugServiceInterface {
	@Autowired
	public ZugRepo repo;



	@Override
	public List<ZugModel> getAllStations() {
		return repo.findAll();
	}
	
}

@Override
public List<ZugModel> getAllStations() {
	return repo.findAllNONull();
}

}

@Override
public List<ZugModel> getAllStations() {
	return repo.findAllOnlyType();
}

}
