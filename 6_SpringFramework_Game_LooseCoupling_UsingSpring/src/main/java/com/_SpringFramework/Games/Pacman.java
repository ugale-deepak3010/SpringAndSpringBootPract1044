package com._SpringFramework.Games;

public class Pacman implements GamingConsole {
	
	
	public void up() {
		System.out.println("Jumping ");
	}

	
	public void down() {
		System.out.println("Go to hole!");
	}
	
	public void left() {
		System.out.println("Go Back!!");
	}

	public void right() {
		System.out.println("Accelerator!!");
	}
}
