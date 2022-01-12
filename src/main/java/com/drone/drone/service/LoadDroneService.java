package com.drone.drone.service;

import com.drone.drone.dto.LoadDroneDto;
import com.drone.drone.model.LoadDroneModel;
import com.drone.drone.repository.LoadDroneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoadDroneService {
    @Autowired
    LoadDroneRepository loadDroneRepository;
    public String saveLoadDrone(LoadDroneDto loadDroneDto){
        LoadDroneModel loadDroneModel=new LoadDroneModel();
        loadDroneModel.setDrone_id(loadDroneDto.getDrone_id());
        loadDroneModel.setName(loadDroneDto.getName());
        loadDroneModel.setCode(loadDroneDto.getCode());
        loadDroneModel.setImage(loadDroneDto.getImage());
        loadDroneModel.setWeight(loadDroneDto.getWeight());
        loadDroneRepository.save(loadDroneModel);
        return "LoadDrone Saved";

    }
}
