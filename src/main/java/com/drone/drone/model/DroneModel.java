package com.drone.drone.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Table(name="DRONE")
@AllArgsConstructor
@NoArgsConstructor
public class DroneModel {
    public Integer getSerial() {
        return serial;
    }

    public void setSerial(Integer serial) {
        this.serial = serial;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getWeightLimit() {
        return weightLimit;
    }

    public void setWeightLimit(String weightLimit) {
        this.weightLimit = weightLimit;
    }

    public String getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(String batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="SERIAL")
    private Integer serial;
    @Column(name="MODEL")
    private String model;
    @Column(name="WEIGHT_LIMIT")
    private String weightLimit;
    @Column(name="BATTERY_CAPACITY")
    private String batteryCapacity;
    @Column(name="STATE")
    private String state;
}
