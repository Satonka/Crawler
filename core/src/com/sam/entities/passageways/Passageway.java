package com.sam.entities.passageways;

import com.badlogic.gdx.maps.tiled.TiledMap;
import com.sam.entities.Entity;
import com.sam.entities.characters.pcs.PlayerCharacter;
import com.sam.enums.Type;
import com.sam.levels.LevelBase;
import com.sam.managers.EntityManager;
import com.sam.managers.PassagewayManager;

public class Passageway extends Entity{
	
	public LevelBase from, to;

	public Passageway(LevelBase level1, LevelBase level2, String title, TiledMap mip, String image, float x, float y, EntityManager entman,
			PassagewayManager passman){
		super(Type.Pw, mip, false, false, image, x, y, entman);
		passman.add(this);
		from = level1;
		to = level2;
	}
	

	public void update(){
		for(int i = 0; i < entityManager.getPcs().size(); i++){
			PlayerCharacter pc  = entityManager.getPcs().get(i);
			if(pc.getX() == this.getX() && pc.getY() == this.getY()){
				from.dispose();
				from.levelManager.switchToLevel(to);
				to.init();
			}
		}
	}
}
