package com.example.ZugData.model;


import java.util.List;


import org.springframework.stereotype.Component;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class ZugModel {


	private int zugId;
	private String zugProfile;
	private String zugDesc;
	private Integer zugExperience;
	private List<String> zugSkills;

	//default constructor
	public ZugModel() {

	}

	//parameterized constructor
	public ZugModel(int zugId, String zugProfile, String zugDesc, Integer zugExperience, List<String> zugSkills) {
		super();
		this.zugId = zugId;
		this.zugProfile = zugProfile;
		this.zugDesc = zugDesc;
		this.zugExperience = zugExperience;
		this.zugSkills = zugSkills;
	}

	//getters and setters
	public int getZugId() {
		return zugId;
	}
	public void setZugId(int zugId) {
		this.zugId = zugId;
	}
	public String getZugProfile() {
		return zugProfile;
	}
	public void setZugProfile(String zugProfile) {
		this.zugProfile = zugProfile;
	}
	public String getZugDesc() {
		return zugDesc;
	}
	public void setZugDesc(String zugDesc) {
		this.zugDesc = zugDesc;
	}
	public Integer getZugExperience() {
		return zugExperience;
	}
	public void setZugExperience(Integer zugExperience) {
		this.zugExperience = zugExperience;
	}
	public List<String> getZugSkills() {
		return zugSkills;
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
