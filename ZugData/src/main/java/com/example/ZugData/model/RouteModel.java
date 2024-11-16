package com.example.ZugData.model;


import lombok.Data;
import lombok.Getter;
import org.springframework.stereotype.Component;

import java.util.List;

@Getter
@Data

@Component
public class RouteModel {


    //getters and setters
    private int RouteId;
	private String RouteProfile;
	private String RouteDesc;


	//default constructor
	public RouteModel() {

	}

	//parameterized constructor
	public RouteModel(int zugId, String zugProfile, String zugDesc, Integer zugExperience, List<String> zugSkills) {
		super();
		this.RouteId = RouteId;
		this.RouteProfile = RouteProfile;
		this.RouteDesc = RouteDesc;

	}

    public void setZugId(int zugId) {
		this.RouteId = zugId;
	}

    public void setZugProfile(String zugProfile) {
		this.RouteProfile = zugProfile;
	}

    public void setZugDesc(String zugDesc) {
		this.RouteDesc = zugDesc;
	}



	@Override
	public String toString() {
		return "ZugModel [zugId=" + RouteId + ", zugProfile=" + RouteProfile + ", zugDesc=" + RouteDesc + ", zugExperience=" + "]";

	}
	

}
