package com.generation.speedball.model.entities;

public class Player {

	int id;
	String name;
	Role role;
	
	//FK verso Team
	
	int teamId;
	
	//Collegamento al lato T
	Team team;
}
