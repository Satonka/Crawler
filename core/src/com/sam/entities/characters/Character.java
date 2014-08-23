package com.sam.entities.characters;

import com.badlogic.gdx.maps.tiled.TiledMap;
import com.sam.entities.Entity;
import com.sam.managers.EntityManager;

public class Character extends Entity{

	public Character(String title, TiledMap mip, String image, float x, float y, EntityManager entman) {
		super(title, mip, true, image, x, y, entman);
		// TODO Auto-generated constructor stub
	}

}
