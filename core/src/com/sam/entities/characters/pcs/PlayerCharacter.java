package com.sam.entities.characters.pcs;

import com.badlogic.gdx.maps.tiled.TiledMap;
import com.sam.entities.characters.Character;
import com.sam.enums.Type;
import com.sam.managers.EntityManager;
import com.sam.managers.PcManager;
import com.sam.managers.others.GameKeys;

public class PlayerCharacter extends Character{
	
	public PcManager pcManager;

	public PlayerCharacter(TiledMap mip, String image, float x, float y, EntityManager entman, PcManager pcman) {
		super(Type.Pc, mip, image, x, y, entman);
		pcManager = pcman;
		pcManager.add(this);
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
