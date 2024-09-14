package com.generation.speedball.model.entities;

public class Player {

	int id;
	String name;
	Role role;
	
	//FK verso Team
	int teamId;
	
	//Collegamento al lato T
	Team team;
	

	
	public void setTeam(Team newTeam)
	{
		this.team = newTeam;
		this.teamId = newTeam.id;
	}	
		
	
	public Team getTeam() {
		return team;
	}
	

	
	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}

	public int getTeamId() {
		return teamId;
	}

	
	public void setId (int id) {
		this.id = id;	
	}
	public int getId () {
		return id;
	}
	public void setName (String name) {
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	
}
