package com._SpringFramework;

import com._SpringFramework.Games.GameRunner;
import com._SpringFramework.Games.MarioGame;
import com._SpringFramework.Games.Pacman;
import com._SpringFramework.Games.SuperContra;

/*
 * 	This app is Tightly coupled because need to make changes if want to add other game.
 * 	
 * 	initially it's created for MarioGame but when I adding SuperContra then I need to
 * make many changes in code. hence it's tightly coupled.
 * 		
 * 	Using GamingConsole Interface I make it loose coupling 
 * 
 */


public class AppGamingBasic {

	public static void main(String[] args) {

		var marioGame = new MarioGame();
		var superContra = new SuperContra();
		var pacman = new Pacman();
		
		var gameRunner= new GameRunner(superContra);
		gameRunner.run();
		
		var gameRunner2= new GameRunner(marioGame);
		gameRunner2.run();
		
		var gameRunner3= new GameRunner(pacman);
		gameRunner3.run();

	}

}
