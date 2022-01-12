package com.drone.drone.repository;

import com.drone.drone.model.LoadDroneModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoadDroneRepository extends JpaRepository<LoadDroneModel,Integer> {
}
