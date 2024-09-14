package com.generation.speedball.model.repository;

public class TeamRepositoryFactory {

	private static TeamRepository repo = new TeamRepositorySQL();
	
	
	public static TeamRepository make() {
		
		return repo;
	}
	
	
	
}
