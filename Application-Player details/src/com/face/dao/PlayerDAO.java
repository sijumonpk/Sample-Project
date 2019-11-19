package com.face.dao;
import com.face.dao.ConnectionManagement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PlayerDAO 
{
	public BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    
		ConnectionManagement cmanager  = new ConnectionManagement();
	
	

	public void create_player(String playerName, String country, String skill, String team) throws ClassNotFoundException, SQLException {
		Connection con = cmanager.getconection();
		Statement stmnt = con.createStatement();
		stmnt.executeUpdate("INSERT INTO player_info VALUES('"+playerName+"', '"+country+"', '"+skill+"', '"+team+"')");
		
		
	}
	
	
	public void getAllPlayerDetails() throws Exception
	{
	Connection con = cmanager.getconection();
	Statement stmnt = con.createStatement();
	String query = "select * from player_info";
	ResultSet set = stmnt.executeQuery(query);
	System.out.println("Player details:");
	if(set.next())
	{
	do
	{
	System.out.println(set.getString(1)+"\t\t"+set.getString(2)+"\t\t"+set.getString(3)+"\t\t\t"+set.getString(4));
	}while(set.next());
	}
	else
	{
	System.out.println("No Records found!!!");
	}
	}
}



