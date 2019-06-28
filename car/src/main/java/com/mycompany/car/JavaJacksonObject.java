/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.car;
    
 
import java.io.File;
import java.io.IOException;
import org.codehaus.jackson.map.ObjectMapper;

/**
 *
 * @author PC User
 */
public class JavaJacksonObject {
    

 
    public static void main(String args[]){
         

        ObjectMapper mapper = new ObjectMapper();
 
        /**
         * Read object from file
         */
        CarFleet value = null;
        try {
            value = mapper.readValue(new File("result.json"), CarFleet.class);
        } catch (IOException e) {
        }   
         
        System.out.println(value);
         
    }
     
}

