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
public class cars {
     
    private String name;
    private String model;
    private long cost;
    private List<String> colors = new ArrayList<String>();
    private CarEngine engine = new CarEngine();
     
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public long getCost() {
        return cost;
    }
    public void setCost(long cost) {
        this.cost = cost;
    }
 
    public CarEngine getEngine() {
        return engine;
    }
    public void setEngine(CarEngine engine) {
        this.engine = engine;
    }
     
    public List<String> getColors() {
        return colors;
    }
    public void setColors(List<String> colors) {
        this.colors = colors;
    }
    @Override
    public String toString() {
        return "Car [name=" + name + ", model=" + model + ", cost=" + cost
                + ", colors=" + colors + ", engine=" + engine + "]";
    }
     
     
}

