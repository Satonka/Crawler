package com.sam.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.sam.managers.GameKeys;
import com.sam.managers.GameStateManager;

public class Game extends ApplicationAdapter {

	public GameStateManager gsm;

	@Override
	public void create () {
		gsm = new GameStateManager();
	}

	@Override
	public void render () {
		gsm.update(Gdx.graphics.getDeltaTime());
		gsm.draw();
		
		GameKeys.update();
	}
}
