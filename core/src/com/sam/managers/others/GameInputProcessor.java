package com.sam.managers.others;

import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.InputProcessor;

public class GameInputProcessor implements InputProcessor{

	public boolean keyDown(int k) {
		if(k == Keys.D) {
			GameKeys.setKey(GameKeys.RIGHT, true);
		}
		if(k == Keys.A) {
			GameKeys.setKey(GameKeys.LEFT, true);
		}
		if(k == Keys.S) {
			GameKeys.setKey(GameKeys.DOWN, true);
		}
		if(k == Keys.W) {
			GameKeys.setKey(GameKeys.UP, true);
		}
		if(k == Keys.ENTER) {
			GameKeys.setKey(GameKeys.ENTER, true);
		}
		if(k == Keys.ESCAPE) {
			GameKeys.setKey(GameKeys.ESCAPE, true);
		}
		if(k == Keys.SPACE) {
			GameKeys.setKey(GameKeys.SPACE, true);
		}
		if(k == Keys.SHIFT_LEFT || k == Keys.SHIFT_RIGHT) {
			GameKeys.setKey(GameKeys.SHIFT, true);
		}
		if(k == Keys.Q) {
			GameKeys.setKey(GameKeys.SEVEN, true);
		}
		if(k == Keys.E) {
			GameKeys.setKey(GameKeys.NINE, true);
		}
		if(k == Keys.Z) {
			GameKeys.setKey(GameKeys.ONE, true);
		}
		if(k == Keys.C) {
			GameKeys.setKey(GameKeys.THREE, true);
		}
		if(k == Keys.NUMPAD_5) {
			GameKeys.setKey(GameKeys.FIVE, true);
		}
		if(k == Keys.W) {
			GameKeys.setKey(GameKeys.EIGHT, true);
		}
		if(k == Keys.A) {
			GameKeys.setKey(GameKeys.FOUR, true);
		}
		if(k == Keys.D) {
			GameKeys.setKey(GameKeys.SIX, true);
		}
		if(k == Keys.S) {
			GameKeys.setKey(GameKeys.TWO, true);
		}
		return true;
	}
	
	public boolean keyUp(int k) {
		if(k == Keys.W) {
			GameKeys.setKey(GameKeys.UP, false);
		}
		if(k == Keys.A) {
			GameKeys.setKey(GameKeys.LEFT, false);
		}
		if(k == Keys.S) {
			GameKeys.setKey(GameKeys.DOWN, false);
		}
		if(k == Keys.D) {
			GameKeys.setKey(GameKeys.RIGHT, false);
		}
		if(k == Keys.ENTER) {
			GameKeys.setKey(GameKeys.ENTER, false);
		}
		if(k == Keys.ESCAPE) {
			GameKeys.setKey(GameKeys.ESCAPE, false);
		}
		if(k == Keys.SPACE) {
			GameKeys.setKey(GameKeys.SPACE, false);
		}
		if(k == Keys.SHIFT_LEFT || k == Keys.SHIFT_RIGHT) {
			GameKeys.setKey(GameKeys.SHIFT, false);
		}
		if(k == Keys.Q) {
			GameKeys.setKey(GameKeys.SEVEN, false);
		}
		if(k == Keys.E) {
			GameKeys.setKey(GameKeys.NINE, false);
		}
		if(k == Keys.Z) {
			GameKeys.setKey(GameKeys.ONE, false);
		}
		if(k == Keys.C) {
			GameKeys.setKey(GameKeys.THREE, false);
		}
		if(k == Keys.NUMPAD_5) {
			GameKeys.setKey(GameKeys.FIVE, false);
		}
		if(k == Keys.W) {
			GameKeys.setKey(GameKeys.EIGHT, false);
		}
		if(k == Keys.A) {
			GameKeys.setKey(GameKeys.FOUR, false);
		}
		if(k == Keys.D) {
			GameKeys.setKey(GameKeys.SIX, false);
		}
		if(k == Keys.S) {
			GameKeys.setKey(GameKeys.TWO, false);
		}
		return true;
	}

	@Override
	public boolean keyTyped(char character) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean touchDown(int screenX, int screenY, int pointer, int button) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean touchUp(int screenX, int screenY, int pointer, int button) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean touchDragged(int screenX, int screenY, int pointer) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean mouseMoved(int screenX, int screenY) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean scrolled(int amount) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
