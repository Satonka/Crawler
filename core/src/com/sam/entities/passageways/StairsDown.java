package com.sam.entities.passageways;

import com.badlogic.gdx.maps.tiled.TiledMap;
import com.sam.levels.LevelBase;
import com.sam.managers.EntityManager;

public class StairsDown extends Passageway {

	public StairsDown(LevelBase level1, LevelBase level2,  String title, TiledMap mip, float x, float y, EntityManager entman) {
		super(level1, level2, title, mip, "StairsDown.png", x, y, entman);
		// TODO Auto-generated constructor stub
	}
}
