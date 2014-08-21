package com.sam.managers;

import java.util.ArrayList;

import com.sam.entities.Entity;

public class EntityManager {

	public ArrayList<Entity>	entityList;
	
	public EntityManager(){
		entityList = new ArrayList<Entity>();
	}

	public void add(Entity entity) {
		entityList.add(entity);
	}
}
