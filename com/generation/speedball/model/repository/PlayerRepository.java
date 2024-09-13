package com.generation.speedball.model.repository;

import com.generation.speedball.model.entities.Player;

public interface PlayerRepository {

	
	void insert (Player player);
	Player findById(int id);
	
	
}
