package com.generation.speedball.model.repository;

import com.generation.speedball.model.entities.Team;

public interface TeamRepository {

	void insert (Team team);
	Team findById (int id);
	void update (Team team);
	void delete (int id);
	
	
	
	
	
	
	
	
}
