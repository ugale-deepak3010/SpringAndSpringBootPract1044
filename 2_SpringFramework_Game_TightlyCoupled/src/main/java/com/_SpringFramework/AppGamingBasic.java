package com._SpringFramework;

import com._SpringFramework.Games.GameRunner;
import com._SpringFramework.Games.MarioGame;
import com._SpringFramework.Games.SuperContra;

/*
 * 	This app is Tightly coupled because need to make changes if want to add other game.
 * 	
 * 	initially it's created for MarioGame but when I adding SuperContra then I need to
 * 	make many changes in code. hence it's tightly coupled.
 * 
 */


public class AppGamingBasic {

	public static void main(String[] args) {

		var marioGame = new MarioGame();
		var superContra = new SuperContra();

		var gameRunner= new GameRunner(marioGame);
		//var gameRunner2= new GameRunner(superContra);
		// error on above because that's Tight coupling.
		
		gameRunner.run();

	}

}
