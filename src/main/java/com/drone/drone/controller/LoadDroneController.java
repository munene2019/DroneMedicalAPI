package com.drone.drone.controller;

import com.drone.drone.controller.Utilities.CustomResponse;
import com.drone.drone.dto.LoadDroneDto;
import com.drone.drone.model.LoadDroneModel;
import com.drone.drone.service.LoadDroneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/loadDrone")
public class LoadDroneController {
    @Autowired
    LoadDroneService loadDroneService;


    @RequestMapping(path = "/save")
    public CustomResponse loadDrone(@RequestBody LoadDroneDto loadDroneDto){
        return loadDroneService.saveLoadDrone(loadDroneDto);

    }
        @GetMapping(path="/list/{id}")
    public List<LoadDroneModel> getDrone(@PathVariable("id") Integer id){
        return loadDroneService.getAllDroneMedication(id);
    }
}
