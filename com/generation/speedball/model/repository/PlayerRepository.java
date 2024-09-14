package com.generation.speedball.model.repository;

import java.util.List;

import com.generation.speedball.model.entities.Player;
import com.generation.speedball.model.entities.Team;

public interface PlayerRepository {

	
	void insert (Player player);
	Player findById(int id);
	List<Player>findByTeam (Team team);
	void update (Player player);
	void delete (int id);
	
	
	
	
/*Non avendo bisogno di un ritorno dal database, uso solamente il tipo di ritorno void*/
	
	
}
