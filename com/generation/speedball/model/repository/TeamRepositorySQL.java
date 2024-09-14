package com.generation.speedball.model.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.generation.speedball.model.entities.Team;

public class TeamRepositorySQL implements TeamRepository {

	
	Connection connessioneAlDatabase;

	
	
	@Override
	public void insert(Team team) {
	
		
		 PreparedStatement preparazioneSQL = connessioneAlDatabase(sql);
		 
		
		
		
	}

	@Override
	public Team findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Team team) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
	
	
}
