package com.sam.gamestates;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputProcessor;
import com.sam.managers.GameStateManager;
import com.sam.managers.LevelManager;
import com.sam.managers.loaders.LevelLoader;
import com.sam.managers.others.GameInputProcessor;

public class PlayState extends GameState {

	public LevelLoader	loader;
	public LevelManager	manager;
	public InputProcessor	processor;

	public PlayState(GameStateManager gsm) {
		super(gsm);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void init() {
		manager = new LevelManager();
		loader = new LevelLoader("Levels.xml", manager);
		manager.switchToLevel(manager.getLevel(0));
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
