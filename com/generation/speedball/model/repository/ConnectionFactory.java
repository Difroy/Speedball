package com.generation.speedball.model.repository;

import java.sql.Connection;
import java.sql.DriverManager;

import com.generation.speedball.config.Config;

public class ConnectionFactory {
	
	private static Connection REALCONNECTION;
	
	static {
		try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				REALCONNECTION = DriverManager.getConnection(Config.getConnectionURL());
			
			
		}catch (Exception e) {
			
			
		}
		
		
		
		
	}
	
	
	

	
	
	
}
