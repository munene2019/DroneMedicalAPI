package com.drone.drone.service;

import com.drone.drone.controller.Utilities.CustomResponse;
import com.drone.drone.dto.LoadDroneDto;
import com.drone.drone.model.DroneModel;
import com.drone.drone.model.LoadDroneModel;
import com.drone.drone.repository.DroneRepository;
import com.drone.drone.repository.LoadDroneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class LoadDroneService {
    @Autowired
    LoadDroneRepository loadDroneRepository;
    @Autowired
    DroneRepository droneRepository;
    public CustomResponse saveLoadDrone(LoadDroneDto loadDroneDto){
        LoadDroneModel loadDroneModel=new LoadDroneModel();
        CustomResponse response=new CustomResponse();
      DroneModel droneModel= droneRepository.findById(loadDroneDto.getDrone_id()).orElse(null);
      if(droneModel !=null) {
          System.out.println("DRONE ID"+droneModel.getId());
          loadDroneModel.setDrone_id(droneModel.getId());
          loadDroneModel.setName(loadDroneDto.getName());
          loadDroneModel.setCode(loadDroneDto.getCode());
          loadDroneModel.setImage(loadDroneDto.getImage());
          loadDroneModel.setWeight(loadDroneDto.getWeight());
          response.setMessage("Drone Loaded succesfully");
          loadDroneRepository.save(loadDroneModel);
      }else{
          response.setMessage("Drone Does not exist");
      }
        return response;

    }
    public List<LoadDroneModel> getAllDroneMedication(Integer id){

        List<LoadDroneModel>droneMedication= loadDroneRepository.findDroneMed(id);
        System.out.println("Drones"+droneMedication);
        return droneMedication;

    }
}
