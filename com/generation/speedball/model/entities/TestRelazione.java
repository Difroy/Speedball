package com.generation.speedball.model.entities;

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
		
		
		//ho collegato t a p1 e p2
		
		t.players.add(p1);  
		
		t.players.add(p2);
		
		
		p1.teamId = 1;
		p2.teamId = 2;
		
		
		
		
		assert(t.players.size()==2);
		
		//L'oggetto p1 non ha un riferimento all'oggetto t (dopo il punto non ho accesso. Valido solo per le variabili prima della riga 13 della classe Player)
		//System.out.println(p1.);
		
	}
	

}
