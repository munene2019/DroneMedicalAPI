package com.drone.drone.controller;

import com.drone.drone.dto.DroneDto;
import com.drone.drone.model.DroneModel;
import com.drone.drone.service.DroneService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/drone")
public class DroneController {
    @Autowired
    DroneService droneService;

    @PostMapping(path = "/register")
    public String saveDrone(@RequestBody DroneDto request) {
        System.out.println("BODY OBJECT "+ request);
        return droneService.saveDrone(request);
    }
    @GetMapping(path="/list")
    public List<DroneModel> getDrones(){
        return droneService.getAllDrones();
    }
    @GetMapping(path="/list/{id}")
    public List<DroneModel> getDrone(@PathVariable("id") Integer id){
        return droneService.getAllDrone(id);
    }
}
