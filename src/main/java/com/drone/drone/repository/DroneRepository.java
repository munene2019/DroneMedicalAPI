package com.drone.drone.repository;

import com.drone.drone.model.DroneModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DroneRepository extends JpaRepository<DroneModel,Integer> {
}
