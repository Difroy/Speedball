package com.generation.speedball.model.repository;

import java.sql.Connection;
import java.util.List;

import com.generation.speedball.model.entities.Player;
import com.generation.speedball.model.entities.Team;

public class PlayerRepositorySQL implements PlayerRepository {

	
	
	Connection connection;
	
	public PlayerRepositorySQL(){
		
		this.connection = ConnectionFactory.make();
		
	}
	
	
	
	
	
	
	@Override
	public void insert(Player player) {
		
		
		
		
	}

	@Override
	public Player findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Player> findByTeam(Team team) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Player player) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	
	
	
	
	
	
	
	
	
	
	
}
