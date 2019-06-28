/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.car;
 
import java.util.ArrayList;
import java.util.List;
 
/**
 *
 * @author PC User
 */
public class CarFleet {
    

    private List<cars> cars = new ArrayList<cars>();
 
 
    public List<cars> getCars() {
        return cars;
    }
 
    public void setCars(List<cars> cars) {
        this.cars = cars;
    }
 
 
    @Override
    public String toString() {
        return "CarFleet [cars=" + cars + "]";
    }
}