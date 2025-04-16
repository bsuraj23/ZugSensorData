package com.example.ZugData.model;


import lombok.Data;
import lombok.Getter;
import org.springframework.stereotype.Component;

import java.util.List;

@Getter
@Data

@Component
public class DriverModel {


    //getters and setters
    private int driverId;
	private String driverProfile;
	private String driverDesc;
	private String driverAddress;


	//default constructor
	public DriverModel() {

	}

	//parameterized constructor
	public DriverModel(int zugId, String zugProfile, String zugDesc, Integer zugExperience, List<String> zugSkills) {
		super();
		this.zugId = zugId;
		this.zugProfile = zugProfile;
		this.zugDesc = zugDesc;

	}

    public void setZugId(int zugId) {
		this.DriversId = zugId;
	}

    public void setZugProfile(String zugProfile) {
		this.DriversProfile = zugProfile;
	}

    public void setZugDesc(String zugDesc) {
		this.DriversDesc = zugDesc;
	}



	@Override
	public String toString() {
		return "ZugModel [zugId=" + DriversId + ", zugProfile=" + DriversProfile + ", zugDesc=" + DriversDesc + ", zugExperience="
				+ DriversExperience + ", zugSkills=" + DriversSkills + "]";
	}
//

}
