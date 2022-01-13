package com.drone.drone.controller;

import com.drone.drone.controller.Utilities.CustomResponse;
import com.drone.drone.dto.LoadDroneDto;
import com.drone.drone.service.DroneLoadedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/loadDrone")
public class LoadDroneController {
    @Autowired
    DroneLoadedService droneLoadedService;


    @RequestMapping(path = "/save")
    public CustomResponse loadDrone(@RequestBody LoadDroneDto loadDroneDto){
        System.out.println("Incoming request"+loadDroneDto);
        return droneLoadedService.loadDrone(loadDroneDto);

    }
//        @GetMapping(path="/list/{id}")
//    public List<MedicineModel> getDrone(@PathVariable("id") Integer id){
//        return loadDroneService.getAllDroneMedication(id);
//    }
}
