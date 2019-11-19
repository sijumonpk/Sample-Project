package com.face.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class ConnectionManagement implements Jdbc_property
{	
public Connection getconection() throws ClassNotFoundException, SQLException {
		
		
		Class.forName(driver);
	    Connection con= DriverManager.getConnection(url, username, password);
	    if (con != null)
	    {
	        System.out.println("Successfull");
	    }
	    else
	    {
	        System.out.println("not Successfull");
	    }
		return con;
	    
		}
}