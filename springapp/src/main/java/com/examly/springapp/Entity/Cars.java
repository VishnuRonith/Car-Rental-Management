package com.examly.springapp.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Cars")
public class Cars {
    
    @Id
    private String carId;

    @Column(name = "car_model")
    private String carModel;

    @Column(name = "car_no")
    private String carNo;

    @Column(name = "status")
    private String status;

    public Cars() {
        
    }
    

    public Cars(String carId, String carModel, String carNo, String status) {
        this.carId = carId;
        this.carModel = carModel;
        this.carNo = carNo;
        this.status = status;
    }

    public String getCarId() {
        return carId;
    }

    public void setCarId(String carId) {
        this.carId = carId;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getCarNo() {
        return carNo;
    }

    public void setCarNo(String carNo) {
        this.carNo = carNo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    
}
