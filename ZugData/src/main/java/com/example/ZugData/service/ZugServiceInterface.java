package com.example.ZugData.service;

import com.example.ZugData.model.ZugModel;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface ZugServiceInterface {

//    @Autowired
//    private ZugService service;
    List<ZugModel> getAllTrains();

}