package com.sam.managers;

import java.util.ArrayList;

import com.sam.entities.Entity;
import com.sam.entities.characters.pcs.PlayerCharacter;
import com.sam.enums.Type;

public class EntityManager {

	public ArrayList<Entity>	entityList;
	
	public EntityManager(){
		entityList = new ArrayList<Entity>();
	}

	public void add(Entity entity) {
		entityList.add(entity);
	}
	
	public ArrayList<PlayerCharacter> getPcs(){
		ArrayList<PlayerCharacter> pcs = new ArrayList<PlayerCharacter>();
		for(int i = 0; i < entityList.size(); i++){
			if(entityList.get(i).getType() == Type.Pc){
				pcs.add((PlayerCharacter) entityList.get(i));
			}
		}
		return pcs;
	}
}
