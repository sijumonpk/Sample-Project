package com.face.dao;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SkillDAO 
{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	ConnectionManagement cman = new ConnectionManagement();
	
	public void search_player() throws ClassNotFoundException, SQLException, IOException
	{
		Connection con = cman.getconection();
		Statement st = con.createStatement();
		System.out.println("Enter Player Skill");
		String skl = br.readLine();
		String query = "select * from player_info where skill = '"+skl+"'";
		ResultSet set = st.executeQuery(query);
		System.out.println("Player details");
		if(set.next()) {
			do {
				System.out.println(set.getString(1)+"\t\t"+set.getString(2)+"\t\t"+set.getString(3)+"\t\t\t"+set.getString(4));
			}while(set.next());
			
		}
		else {
			System.out.println("No Records found!!!");
		}
	}


	
}
