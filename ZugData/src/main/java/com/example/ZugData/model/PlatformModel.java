package com.example.ZugData.model;


import lombok.Data;
import lombok.Getter;
import org.springframework.stereotype.Component;

import java.util.List;

@Getter
@Data

@Component
public class PlatformModel {


    //getters and setters  Platform
    private int PlatformId;
	private String PlatformProfile;
	private String PlatformDesc;
	private Platformothername;
	private PlatformDescription;
	private PlatformrecordId;


	//default constructor
	public PlatformModel() {

	}

	//parameterized constructor
	public PlatformModel(int zugId, String zugProfile, String zugDesc, Integer zugExperience, List<String> zugSkills) {
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
