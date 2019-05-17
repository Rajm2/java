package com.springbootapplication.player;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;


@Service
public class PlayerService {
	
	List<Player> list = new ArrayList<>();
	public PlayerService()
	{		
		System.out.println("Service layer is created");
		
		list.add(new Player(1,"Raj"));
		list.add(new Player(2,"Sita"));
		list.add(new Player(3,"Laxman"));
		list.add(new Player(4,"Aman"));
		list.add(new Player(5, "Mohan"));
	}
	
	//TO GET ALL PLAYER
	public List<Player> getAllThePlayers(){
		return list;
	}
	
	//GET SINGLE PLAYER
	public Player getPlayer(int id){
		
		for(Player p:list){
			if(p.getId()==id){
				return p;
			}
		}
		return null;
	}
	
	//SAVE PLAYER
	public void savePlayer(Player player){
		this.list.add(player);
	}
	
	//UPDATE THE PLAYER
	public void updatePlayer(Player player){
		for(Player p:list){
			if(p.getId()==player.getId()){
				p.setPlayerName(player.getPlayerName());
				
			}
		}
	}
	
	//REMOVE PLAYER
	public void deletePlayer(int id){
		list.remove(id);
	}
	
	

}
