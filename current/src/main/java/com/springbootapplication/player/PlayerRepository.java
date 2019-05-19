package com.springbootapplication.player;

import org.springframework.data.repository.CrudRepository;

import com.springbootapplication.player.Player;

public interface PlayerRepository extends CrudRepository<Player, Integer> {
	
	//Get
	// Save or Update
	// remove

}