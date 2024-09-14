package com.generation.speedball.model.repository;

public class PlayerRepositoryFactory {

	private static PlayerRepository repo = new PlayerRepositorySQL();

	public static PlayerRepository make() {
		return repo;
	}

}
