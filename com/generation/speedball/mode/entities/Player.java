package com.generation.speedball.mode.entities;

public class Player {

	int id;
	String name;
	Role role;
	
	//FK verso Team
	
	int teamId;
	
	Team team;
}
