package com.sam.managers;

import com.sam.gamestates.GameState;
import com.sam.gamestates.PlayState;

public class GameStateManager {

	private GameState gameState;
	
	public enum State{
		PLAY
	}
	
	public GameStateManager(){
		setState(State.PLAY);
	}
	
	public void setState(State state){
		if(gameState != null) gameState.dispose();

		if(state == State.PLAY) {
			gameState = new PlayState(this);
		}
	
	}
	
	public void update(float dt) {
		gameState.update(dt);
	}
	
	public void draw(){
		gameState.draw();
	}
}
