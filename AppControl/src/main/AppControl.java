/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.HashMap;

import main.handlers.*;

public class AppControl {
	private HashMap<String, Handler> commands;
	
	public AppControl() {
		commands = new HashMap<String, Handler>();
		commands.put("addBook", new AddBookHandler());
		commands.put("displayBooks", new DisplayBooksHandler());
		commands.put("displayMenu", new DisplayMenuHandler());
	}

	public Object doCommand(String commandKey, HashMap<String, Object> commandData) throws Exception {
		Handler command = commands.getOrDefault(commandKey, null);
		if (command == null) {
			throw new Exception("There is no command with the key word '" + commandKey + "'.");
		}
		
		return command.handleIt(commandData);
	}
}
