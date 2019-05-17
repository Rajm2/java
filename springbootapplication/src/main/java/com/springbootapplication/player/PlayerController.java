package com.springbootapplication.player;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.RestController;

//@Controller//@RestController
@RestController
public class PlayerController {
	@Autowired
	private PlayerService playerService;
	
	@RequestMapping(value="/players", method= RequestMethod.GET)
	public List<Player> getPlayers(){
		return playerService.getAllThePlayers();
	}
	
	
}
