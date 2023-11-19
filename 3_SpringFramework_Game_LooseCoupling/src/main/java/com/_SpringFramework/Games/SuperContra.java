package com._SpringFramework.Games;

public class SuperContra implements GamingConsole {
	public void up() {
		System.out.println("Jump");
	}

	public void down() {
		System.out.println("Sit Down");
	}

	public void left() {
		System.out.println("Go Back");
	}

	public void right() {
		System.out.println("Fire!");
	}
}
