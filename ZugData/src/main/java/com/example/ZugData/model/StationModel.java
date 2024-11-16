package com.example.ZugData.model;


import lombok.Data;
import lombok.Getter;
import org.springframework.stereotype.Component;

import java.util.List;

@Getter
@Data

@Component
public class StationModel {


    //getters and setters
    private int station;
	private String stationProfile;
	private String stationDesc;


	//default constructor
	public StationModel() {

	}

	//parameterized constructor
	public StationModel(int zugId, String zugProfile, String zugDesc, Integer zugExperience, List<String> zugSkills) {
		super();
		this.zugId = zugId;
		this.zugProfile = zugProfile;
		this.zugDesc = zugDesc;
		this.zugExperience = zugExperience;
		this.zugSkills = zugSkills;
	}

    public void setZugId(int zugId) {
		this.zugId = zugId;
	}

    public void setZugProfile(String zugProfile) {
		this.zugProfile = zugProfile;
	}

    public void setZugDesc(String zugDesc) {
		this.zugDesc = zugDesc;
	}

    public void setZugExperience(Integer zugExperience) {
		this.zugExperience = zugExperience;
	}

    public void setZugSkills(List<String> zugSkills) {
		this.zugSkills = zugSkills;
	}

	@Override
	public String toString() {
		return "ZugModel [zugId=" + zugId + ", zugProfile=" + zugProfile + ", zugDesc=" + zugDesc + ", zugExperience="
				+ zugExperience + ", zugSkills=" + zugSkills + "]";
	}
	

}
