package com.drone.drone.service;

import com.drone.drone.Entity.DroneModel;
import com.drone.drone.controller.Utilities.CustomResponse;
import com.drone.drone.dto.LoadDroneDto;
import com.drone.drone.Entity.DroneLoadedModel;
import com.drone.drone.repository.DroneRepository;
import com.drone.drone.repository.DroneLoadedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DroneLoadedService {
    @Autowired
    DroneLoadedRepository droneLoadedRepository;
    @Autowired
    DroneRepository droneRepository;
    public CustomResponse loadDrone(LoadDroneDto loadDroneDto){
        DroneLoadedModel droneLoadedModel=new DroneLoadedModel();
        CustomResponse response=new CustomResponse();

        System.out.println("DATA OBJECT DRONEID"+loadDroneDto.getDroneId());
        droneLoadedModel.setName(loadDroneDto.getName());
        droneLoadedModel.setDrone(new DroneModel(loadDroneDto.getDroneId()));
        droneLoadedModel.setCode(loadDroneDto.getCode());
        droneLoadedModel.setImage(loadDroneDto.getImage());
        droneLoadedModel.setWeight(loadDroneDto.getWeight());
        response.setMessage("Drone Loaded successfully");
        System.out.println("DATA OBJECT here "+droneLoadedModel);
        droneLoadedRepository.save(droneLoadedModel);
       droneRepository.updateDroneStatus(loadDroneDto.getDroneId());

//      if(droneLoadedModel ==null) {
//          medicineModel.setName(loadDroneDto.getName());
//          medicineModel.setCode(loadDroneDto.getCode());
//          medicineModel.setImage(loadDroneDto.getImage());
//          medicineModel.setWeight(loadDroneDto.getWeight());
//          response.setMessage("Drone Loaded successfully");
//          medicineRepository.save(medicineModel);
//      }else{
//          response.setMessage(" Drone Already exist");
//      }
        return response;

    }
//    public List<MedicineModel> getAllDroneMedication(Integer id){
//
//        List<MedicineModel>droneMedication= loadDroneRepository.findDroneMed(id);
//        System.out.println("Drones"+droneMedication);
//        return droneMedication;
//
//    }
}
