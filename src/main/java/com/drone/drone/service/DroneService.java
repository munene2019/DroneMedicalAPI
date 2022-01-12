package com.drone.drone.service;

import com.drone.drone.dto.DroneDto;
import com.drone.drone.model.DroneModel;
import com.drone.drone.repository.DroneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class DroneService {
    @Autowired
    DroneRepository repository;
    public String saveDrone(DroneDto droneDto){
        DroneModel drone=new DroneModel();
        drone.setModel(droneDto.getModel());
        drone.setSerial(droneDto.getSerial());
        drone.setWeightLimit(droneDto.getWeightLimit());
        drone.setState(droneDto.getState());
        drone.setBatteryCapacity(droneDto.getBatteryCapacity());
        repository.save(drone);
        return "Drone Saved";

    }
    public List<DroneModel> getAllDrones(){

        List<DroneModel>drones= repository.findAll();
        System.out.println("Drones"+drones);
        return drones;

    }
    public  List<DroneModel> getAllDrone(Integer id){

        List<DroneModel>drones= repository.findAllById(Collections.singleton(id));
        System.out.println("Drones"+drones);
        return drones;

    }
}
