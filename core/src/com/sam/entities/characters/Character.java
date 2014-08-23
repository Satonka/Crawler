package com.sam.entities.characters;

import com.badlogic.gdx.maps.tiled.TiledMap;
import com.sam.entities.Entity;
import com.sam.enums.Type;
import com.sam.managers.EntityManager;

public class Character extends Entity{

	public Character(Type title, TiledMap mip, String image, float x, float y, EntityManager entman) {
		super(title, mip, true, true, image, x, y, entman);
		// TODO Auto-generated constructor stub
	}

}
