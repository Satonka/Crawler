package com.sam.managers;

import java.util.ArrayList;

import com.sam.entities.characters.pcs.PlayerCharacter;

public class PcManager extends EntityManager{

	public ArrayList<PlayerCharacter>	pcList;
	
	public PcManager(){
		pcList = new ArrayList<PlayerCharacter>();
	}
	
	public void add(PlayerCharacter pc){
		pcList.add(pc);
	}
}
