package com.example.ZugData.service;

import java.util.ArrayList;
import java.util.List;

import com.example.ZugData.repo.ZugRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import com.example.ZugData.model.ZugModel;


import StringTokanizer from java.util.StringTo
@Service
public class ZugService implements ZugServiceInterface {
	@Autowired
	public ZugRepo repo;
	ArrayList al = new ArrayList(1,2,3,4,6,8,10);
//use only one statement to get odd and even ..map reducr filter
	List<ArrayList>  Evenlist = Stream.filter(temp -> al.getEven()).collect(Collectons.tolist());
	System.out.println(Evenlist);
	//
	//2,4,6,8,10
	//1/3/5/7/9

	//how can you make it only in one ...

	//

List<Integeters>  Evenlist = Streams.filter(temp -> al.getEven()).collect(Collectons.tolist());
	List<Integeters>  Evenlist = Streams.filter(temp -> al.getOdd()).collect(Collectons.tolist());

	
}
