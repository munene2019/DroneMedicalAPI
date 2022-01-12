package com.drone.drone.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Table(name="DRONE_LOADED")
@AllArgsConstructor
@NoArgsConstructor
public class LoadDroneModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="DRONE_ID")
    private Integer drone_id;
    @Column(name="NAME")
    private String name;
    @Column(name="WEIGHT")
    private String weight;
    @Column(name="CODE")
    private String code;
    @Column(name="IMAGE")
    private String image;
}
