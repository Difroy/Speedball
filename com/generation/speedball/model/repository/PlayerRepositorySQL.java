package com.generation.speedball.model.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.generation.speedball.model.entities.Player;
import com.generation.speedball.model.entities.Role;
import com.generation.speedball.model.entities.Team;

public class PlayerRepositorySQL implements PlayerRepository {

	Connection connessioneAlDatabase;

	public PlayerRepositorySQL() {

		this.connessioneAlDatabase = ConnectionFactory.make();

	}

	@Override
	public void insert(Player player) {

	}

	@Override
	public Player findById(int id) {
		try {
			// PREPAREDSTATEMENT
			String sql = "select * from player where id=?";
			PreparedStatement preparazioneSQL = connessioneAlDatabase.prepareStatement(sql);
			preparazioneSQL.setInt(1, id);

			ResultSet ritornoDalDb = preparazioneSQL.executeQuery();

			if (ritornoDalDb.next()) {

				Player returnGiocatore = new Player();
				returnGiocatore.setId(ritornoDalDb.getInt(1));
				returnGiocatore.setName(ritornoDalDb.getString(2));
				returnGiocatore.setRole(Role.valueOf(ritornoDalDb.getString(3)));
				returnGiocatore.setTeamId(ritornoDalDb.getInt(4));

				return returnGiocatore;

			} else

				return null;
		} catch (SQLException e) {
			throw new RuntimeException(e.getMessage());
		}
	}

	@Override
	public List<Player> findByTeam(Team team) {

		List<Player> listaGiocatori = new ArrayList<Player>();
		try {

			String sql = "select * from player where teamid=?";
			PreparedStatement preparazioneSQL = connessioneAlDatabase.prepareStatement(sql);
			preparazioneSQL.setInt(1, team.getId());

			ResultSet ritornoDalDb = preparazioneSQL.executeQuery();

			while (ritornoDalDb.next()) {

				Player returnGiocatore = new Player();
				
				returnGiocatore.setId(ritornoDalDb.getInt(1));
				returnGiocatore.setName(ritornoDalDb.getString(2));
				returnGiocatore.setRole(Role.valueOf(ritornoDalDb.getString(3)));
				returnGiocatore.setTeamId(ritornoDalDb.getInt(4));
				
				returnGiocatore.setTeam(team);
				listaGiocatori.add(returnGiocatore);
				
			
				
			}
			return listaGiocatori;

		} catch (SQLException e) {
			throw new RuntimeException(e.getMessage());
		}
		
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
