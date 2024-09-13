package com.generation.speedball.mode.entities;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestRelazione {

	@Test
	void test() {

		
		Team t = new Team();
		t.id = 1;
		t.name = "Brutal Deluxe";

		Player p1 = new Player();
		p1.id = 1;
		p1.name = "Ferdinando";
		p1.role = Role.DEF;
		
		Player p2 = new Player();
		p1.id = 2;
		p1.name = "Maria Chiara";
		p1.role = Role.ATK;
		// t 		  is_a Team
		// t.players  is_a List<Player> 
		
		// t has players
		
		// players is_a List<Player>
		
		//t.players.get(0)
		
		
		t.players.add(p1);  
		
		t.players.add(p2);
	}
	

}
