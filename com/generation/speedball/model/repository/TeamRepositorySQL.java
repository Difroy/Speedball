package com.generation.speedball.model.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.generation.speedball.model.entities.Team;

public class TeamRepositorySQL implements TeamRepository {

	
	Connection connessioneAlDatabase;

	
	
	@Override
	public void insert(Team team) {
	
		
		try {
			
			String sql = "INSERT INTO player(id, name, role, teamid) VALUES (?,?,?,?)";
			PreparedStatement preparazioneSQL = connessioneAlDatabase.prepareStatement(sql);
			
		}catch (SQLException e) {
			throw new RuntimeException (e.getMessage());
		}
		
		
		
	
		
		
		
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
