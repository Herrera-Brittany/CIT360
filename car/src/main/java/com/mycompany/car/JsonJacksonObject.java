/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.car;
import java.io.File;
import java.io.IOException;
import org.codehaus.jackson.map.ObjectMapper;
import java.util.ArrayList;
import java.util.*;
public class JsonJacksonObject {
     public static void main(String args[]){
         
        CarFleet carFleet = getCarFleet();
         
        ObjectMapper mapper = new ObjectMapper();
 
        /**
         * Write object to file
         */
        try {
            mapper.writeValue(new File("result.json"), carFleet);//Plain JSON
            //mapper.writerWithDefaultPrettyPrinter().writeValue(new File("result.json"), carFleet);//Prettified JSON
        } catch (IOException e) {
        }
 
    }
     
    private static CarFleet getCarFleet(){
        cars car1 = new cars();
        car1.setName("Audi");
        car1.setModel("2010");
        car1.setCost(30000);
         
 
        CarEngine engine1 = new CarEngine();
        engine1.setPower("88KWH");
        engine1.setType("Diesel");
        car1.setEngine(engine1);
         
        cars car2 = new cars();
        car2.setName("Jaguar");
        car2.setModel("2013");
        car2.setCost(60000);
 
        CarEngine engine2 = new CarEngine();
        engine2.setPower("120KWH");
        engine2.setType("Diesel");
        car2.setEngine(engine2);
         
        List<String> colors = new ArrayList<>();
        colors.add("Grey");
        colors.add("white");
        car1.setColors(colors);
        car2.setColors(colors);
         
        CarFleet carFleet = new CarFleet();
        carFleet.getCars().add(car1);
        carFleet.getCars().add(car2);
 
        return carFleet;
    }
}

