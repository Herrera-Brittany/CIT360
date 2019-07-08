/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.handlers;
import java.util.HashMap;

/**
 *
 * @author PC User
 */
public interface Handler {
    

	public Object handleIt(HashMap<String, Object> data);
}