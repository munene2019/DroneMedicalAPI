package com.drone.drone.repository;

import com.drone.drone.Entity.DroneLoadedModel;
import com.drone.drone.Entity.DroneModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface DroneRepository extends JpaRepository<DroneModel,Integer> {

    DroneModel findBySerial(Integer serial);
    @Transactional
    @Query("UPDATE DroneModel c set c.status = 1 WHERE id =:id")
    @Modifying
    void updateDroneStatus(Integer id);
    @Query("FROM  DroneModel where status=0")
    List<DroneModel> findAvailableDrones();

}
