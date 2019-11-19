package com.face.domain;

import java.sql.SQLException;

import java.util.Scanner;

import com.face.bo.PlayerBO;
import com.face.dao.ConnectionManagement;
import com.face.dao.PlayerDAO;

public class Player extends ConnectionManagement


{
	String playerName,country,skill,team;
	Scanner sc = new Scanner(System.in);
	PlayerBO player = new PlayerBO();
	
	ConnectionManagement cman = new ConnectionManagement();
	PlayerDAO playerdao = new PlayerDAO();
	
	
	ConnectionManagement conobj = new ConnectionManagement();
	
	public void Player1() throws ClassNotFoundException, SQLException 
	{
		
	
		
		System.out.println("Enter Player name");
		playerName=sc.nextLine();
		player.setPlayerName(playerName);
		
		
		
		System.out.println("Enter Country name");
		country=sc.nextLine();
		player.setCountry(country);
		
		
		System.out.println("Enter Skill");
		skill = sc.nextLine();
		player.setSkill(skill);
		
		
		System.out.println("Enter Team name");
		team = sc.nextLine();
		player.setTeam(team);
		
		
		playerdao.create_player(playerName, country, skill, team);
			
}
	}
