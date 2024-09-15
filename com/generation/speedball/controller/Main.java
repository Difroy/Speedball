package com.generation.speedball.controller;

import java.util.Scanner;

import com.generation.speedball.model.entities.Player;
import com.generation.speedball.model.entities.Team;
import com.generation.speedball.model.repository.TeamRepository;
import com.generation.speedball.model.repository.TeamRepositoryFactory;

public class Main {

	private static TeamRepository teamRepo = TeamRepositoryFactory.make();

	private static Scanner keyboard = new Scanner(System.in);

	private static void print(Object o) {

		System.out.println(o);
	}

	public static void main(String[] args) {

		print("Inserire id");
		int id = Integer.parseInt(keyboard.nextLine());
		Team t = teamRepo.findById(id);

		if (t == null)
			System.out.println("non trovato");
		else {
			print("Team " + t.getName());
			print("Budget " + t.getBudget());
			print("Players");
			for (Player p : t.getPlayers())
				print(p.getName() + " " + p.getRole().toString());
		}

	}

}
