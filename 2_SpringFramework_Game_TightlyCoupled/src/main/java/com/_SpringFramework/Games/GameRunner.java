package com._SpringFramework.Games;

public class GameRunner {
	MarioGame marioGame;
	SuperContra superContra;
	
	
	public GameRunner(MarioGame marioGame) {
	//public GameRunner(SuperContra superContra) {
	//public GameRunner(GamingConsole game) {
		this.marioGame = marioGame;
	}

	public void run() {

		
		System.out.println("Running Game : " + marioGame);
		marioGame.up();
		marioGame.down();
		marioGame.left();
		marioGame.right();
	}
	
	

}
