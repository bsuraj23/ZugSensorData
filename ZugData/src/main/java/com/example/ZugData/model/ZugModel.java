package com.example.ZugData.model;


import java.util.List;


import lombok.Getter;
import org.springframework.stereotype.Component;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Getter
@Data

@Component
public class ZugModel {


    //getters and setters
    private int zugId;
	private String zugProfile;
	private String zugDesc;


	//default constructor
	public ZugModel() {

	}

	//parameterized constructor
	public ZugModel(int zugId, String zugProfile, String zugDesc, Integer zugExperience, List<String> zugSkills) {
		super();
		this.zugId = zugId;
		this.zugProfile = zugProfile;
		this.zugDesc = zugDesc;

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



//	@Override
//	public String toString() {
//		return "ZugModel [zugId=" + zugId + ", zugProfile=" + zugProfile + ", zugDesc=" + zugDesc + ", zugExperience="
//				+ zugExperience + ", zugSkills=" + zugSkills + "]";
//	}
//

}
