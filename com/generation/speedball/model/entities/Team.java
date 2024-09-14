package com.generation.speedball.model.entities;

import java.util.ArrayList;
import java.util.List;

public class Team {

	int id;
	String name;  //BRUTAL DELUXE
	int budget;
	
	//Lista dei miei player, dei miei lato n
	//questo è un collegamente dal lato 1 al lato n
	List<Player>players = new ArrayList<Player>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBudget() {
		return budget;
	}

	public void setBudget(int budget) {
		this.budget = budget;
	}

	public List<Player> getPlayers() {
		return players;
	}

	public void setPlayers(List<Player> players) {
		this.players = players;
	}
	
	
	
	
}




