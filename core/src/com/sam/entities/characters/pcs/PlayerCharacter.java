package com.sam.entities.characters.pcs;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.sam.entities.characters.Character;
import com.sam.managers.EntityManager;
import com.sam.managers.GameKeys;

public class PlayerCharacter extends Character{

	public PlayerCharacter(String title, TiledMap mip, Texture tex, float x, float y, EntityManager entman) {
		super(title, mip, tex, x, y, entman);
		// TODO Auto-generated constructor stub
	}
	
	public void move(){
		if(GameKeys.isPressed(GameKeys.UP))
			if(!isObjectUp())
				this.setPosition(getX(), getY()+16);
		if(GameKeys.isPressed(GameKeys.DOWN))
			if(!isObjectDown())
				this.setPosition(getX(), getY()-16);
		if(GameKeys.isPressed(GameKeys.RIGHT))
			if(!isObjectRight())
				this.setPosition(getX()+16, getY());
		if(GameKeys.isPressed(GameKeys.LEFT))
			if(!isObjectLeft())
				this.setPosition(getX()-16, getY());
	}

	
	
}
