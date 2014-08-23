package com.sam.entities.passageways;

import com.badlogic.gdx.maps.tiled.TiledMap;
import com.sam.entities.Entity;
import com.sam.levels.LevelBase;
import com.sam.managers.EntityManager;

public class Passageway extends Entity{

	public Passageway(LevelBase level1, LevelBase level2, String title, TiledMap mip, String image, float x, float y, EntityManager entman){
		super(title, mip, false, image, x, y, entman);
		level1.levelManager.switchToLevel(level2);

	}
}
