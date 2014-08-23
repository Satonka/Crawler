package com.sam.levels;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.renderers.OrthogonalTiledMapRenderer;
import com.sam.entities.characters.Character;
import com.sam.entities.characters.pcs.PlayerCharacter;
import com.sam.entities.passageways.StairsUp;
import com.sam.managers.CameraManager;
import com.sam.managers.EntityManager;
import com.sam.managers.LevelManager;

public class Cave extends LevelBase{
	
	

	public PlayerCharacter 	guy;
	public Character		girl;
	public CameraManager	camman;
	public OrthogonalTiledMapRenderer 	renderer;

	
	public Cave(String mapname, LevelManager lm){
		super(mapname, lm);
	}
	
	public void init(){
		//guy = new PlayerCharacter("Guy", map, "guy.png", 4*16f, 27*16f, entman);
		
		//girl = new Character("Girl", map, "girl.png", 5*16f, 26*16f, entman);

		camman.target(guy);
	}
	
	public void update(){      
        guy.move();
	}
	
	public void draw(){
		renderer.getSpriteBatch().begin();
		guy.draw(renderer.getSpriteBatch());
		girl.draw(renderer.getSpriteBatch());
		renderer.getSpriteBatch().end();	
	}
	
	public void dispose(){
		
	}
}
