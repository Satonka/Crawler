package com.sam.gamestates;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.TmxMapLoader;
import com.badlogic.gdx.maps.tiled.renderers.OrthogonalTiledMapRenderer;
import com.sam.entities.characters.Character;
import com.sam.entities.characters.pcs.PlayerCharacter;
import com.sam.entities.passageways.StairsUp;
import com.sam.managers.CameraManager;
import com.sam.managers.EntityManager;
import com.sam.managers.GameInputProcessor;
import com.sam.managers.GameStateManager;
import com.sam.managers.LevelLoader;
import com.sam.managers.LevelManager;

public class PlayState extends GameState {

	public LevelLoader	loader;
	public LevelManager	manager;
	public InputProcessor	processor;
	
	public TiledMap 		map;
	public EntityManager 	entman;
	public Texture 			tex2;
	public PlayerCharacter 	guy;
	public Character		girl;
	public int 				WIDTH, HEIGHT;
	public OrthographicCamera cam;
	public CameraManager	camman;
	public OrthogonalTiledMapRenderer 	renderer;
	public StairsUp			stairs;

	public PlayState(GameStateManager gsm) {
		super(gsm);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void init() {
		manager = new LevelManager();
		loader = new LevelLoader("Levels.xml", manager);
		manager.currentLevel.init();
		
		processor = new GameInputProcessor();
		Gdx.input.setInputProcessor(processor);
	}

	@Override
	public void update(float dt) {
		manager.currentLevel.update();
	}

	@Override
	public void draw() {
		manager.currentLevel.draw();
	}

	@Override
	public void handleInput() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}
}
