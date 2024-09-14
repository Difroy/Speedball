package com.generation.speedball.model.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.generation.speedball.model.entities.Team;

public class TeamRepositorySQL implements TeamRepository {

	
	Connection connessioneAlDatabase;

	PlayerRepository playerRepo = PlayerRepositoryFactory.make();
	
	@Override
	public void insert(Team team) 
	{
	
		String sql = "insert into team (id, name, budget) values (?, ?, ?)";
		
		//alt shift y per finestra piccola
		//ctrl shift f per formattare il codice
		//ctrl shift o per importare
		
		 try 
		 {
			PreparedStatement  preparazioneSQL = connessioneAlDatabase.prepareStatement(sql);
			preparazioneSQL.setInt(1, team.getId());
			preparazioneSQL.setString(2, team.getName());
			preparazioneSQL.setInt(3, team.getBudget());
			
			preparazioneSQL.execute();
			
		} catch 
		 (SQLException e) 
		 {
			throw new RuntimeException(e.getMessage());
		}
	}

	@Override
	public Team findById(int id) 
	{
		String sql = "select * from team where id = ?";
		
		
		try 
		{
			PreparedStatement ps = connessioneAlDatabase.prepareStatement(sql);
			ps.setInt(1, id);
			
			ResultSet rs = ps.executeQuery();
			
			Team t = new Team();
			if(rs.next())
			{
				t.setId(rs.getInt("id"));
				t.setName(rs.getString("name"));
				t.setBudget(rs.getInt("budget"));
				
				t.setPlayers(playerRepo.findByTeam(t));
				
			}
		} 
		catch (SQLException e) 
		{
			throw new RuntimeException(e.getMessage());
		}
		
		return null;
	}

	@Override
	public void update(Team team) 
	{
		String sql = "update team set name = ?, budget = ? where id = ?";
		
		try 
		{
			PreparedStatement ps = connessioneAlDatabase.prepareStatement(sql);
			ps.setString(1, team.getName());
			ps.setInt(2, team.getBudget());
			ps.setInt(3, team.getId());
			
			ps.execute();
		} 
		catch (SQLException e) 
		{
			throw new RuntimeException(e.getMessage());
		}
	}

	@Override
	public void delete(int id) 
	{
		String sql = "delete from team where id = ?";
		
		try 
		{
			PreparedStatement ps = connessioneAlDatabase.prepareStatement(sql);
			ps.setInt(1, id);
			
			ps.execute();
		} 
		catch (SQLException e) 
		{
			throw new RuntimeException(e.getMessage());
		}
	}
	
	
	
	
	
	
	
}
