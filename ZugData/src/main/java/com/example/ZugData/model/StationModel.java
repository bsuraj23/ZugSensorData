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




}
