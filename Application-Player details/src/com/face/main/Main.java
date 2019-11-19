package com.face.main;
import java.util.Scanner;

import com.face.dao.PlayerDAO;
import com.face.dao.SkillDAO;
import com.face.domain.Player;

public class Main {
	static Player play = new Player();
	static SkillDAO plyyerdo_obj = new SkillDAO();
	static PlayerDAO playerdao = new PlayerDAO();
	private static Scanner sc;
	

	public static void main(String[] args) throws Exception 
	{

        //Menu starts
		
		System.out.println("Menu");
		System.out.println("1.List all Players\n2.Add new player\n3.Search player");
		System.out.println("____  ____  ____  ____  ____  ____  ____  ____  ____  _");
		
		sc = new Scanner(System.in);
		int choice;
		choice = sc.nextInt();
		boolean status = choice != 1 && choice !=2 && choice !=3;
		status = false;
		do {
			
			switch(choice) 
			{
			case 1:
				play.Player1();
				main(null);
			break;
			
			case 2:
				plyyerdo_obj.search_player();
				main(null);
			break;
			
			case 3:
				playerdao.getAllPlayerDetails();
				main(null);
			break;
			
			default:
				System.out.println("Invalid Input Select valid Input");
				main(null);
				break;
		    }
			
			}while(status);
	}

}
