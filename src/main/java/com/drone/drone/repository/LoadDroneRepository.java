package com.drone.drone.repository;


import com.drone.drone.model.LoadDroneModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface LoadDroneRepository extends JpaRepository<LoadDroneModel,Integer> {
//    @Query("SELECT DISTINCT DRONE_ID FROM DRONE_LOADED")
//    List<DroneModel> findDistinctDrones();
   @Query("FROM  LoadDroneModel where drone_id=:id")
    List<LoadDroneModel> findDroneMed(Integer id);

}
