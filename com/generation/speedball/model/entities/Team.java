package com.generation.speedball.model.entities;

import java.util.ArrayList;
import java.util.List;

public class Team {

	int id;
	String name;  //BRUTAL DELUXE
	//Lista dei miei player, dei miei lato n
	//questo è un collegamente dal lato 1 al lato n
	List<Player>players = new ArrayList<Player>();
	
}




