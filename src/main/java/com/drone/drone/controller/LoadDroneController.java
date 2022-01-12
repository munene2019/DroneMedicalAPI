package com.drone.drone.controller;

import com.drone.drone.dto.LoadDroneDto;
import com.drone.drone.service.LoadDroneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/loadDrone")
public class LoadDroneController {
    @Autowired
    LoadDroneService loadDroneService;

    @RequestMapping(path = "/save")
    public String loadDrone(@RequestBody LoadDroneDto loadDroneDto){
        return loadDroneService.saveLoadDrone(loadDroneDto);

    }
}
