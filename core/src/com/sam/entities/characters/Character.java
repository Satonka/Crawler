package com.sam.entities.characters;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.sam.entities.Entity;
import com.sam.managers.EntityManager;

public class Character extends Entity{

	public Character(String title, TiledMap mip, Texture tex, float x, float y, EntityManager entman) {
		super(title, mip, true, tex, x, y, entman);
		// TODO Auto-generated constructor stub
	}

}
