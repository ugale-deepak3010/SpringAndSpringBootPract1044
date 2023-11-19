package com._SpringFramework.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com._SpringFramework.Games.GameRunner;
import com._SpringFramework.Games.GamingConsole;
import com._SpringFramework.Games.Pacman;

@Configuration
public class GamingConfiguration {
	
	@Bean
	public GamingConsole game() {
		var game = new Pacman();
		return game;
	}

	@Bean
	public GameRunner gameRunner(GamingConsole game) {
		return new GameRunner(game);
	}
}
