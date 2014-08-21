package com.sam.managers;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.maps.MapLayer;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.TiledMapTileLayer;
import com.sam.entities.Entity;

public class CameraManager {

	public OrthographicCamera 		camera;
	public TiledMap 				map;
	public MapLayer					layer1;
	public TiledMapTileLayer 		layer2;
	public Entity					entity;
	
	public CameraManager(OrthographicCamera cam, TiledMap mip){
		camera = cam;
		map = mip;
	}
	
	public void itit(){
		camera.setToOrtho(false);
		camera.zoom = 1/3f;
		layer1 = this.map.getLayers().get(0);
		layer2 = (TiledMapTileLayer) layer1;
	}
	
	public void move(){
		if(Gdx.input.isKeyPressed(Input.Keys.UP)) {
			if(camera.position.y < layer2.getHeight()*16-96){
				camera.translate(0, 4, 0);
			}
		}
		if(Gdx.input.isKeyPressed(Input.Keys.DOWN)) {
			if(camera.position.y > 96){
				camera.translate(0, -4, 0);
			}
		}    
		if(Gdx.input.isKeyPressed(Input.Keys.LEFT)) {
			if(camera.position.x > 96){
				camera.translate(-4, 0, 0);
			}
		}
		if(Gdx.input.isKeyPressed(Input.Keys.RIGHT)) {
			if(camera.position.x < layer2.getWidth()*16-96){
				camera.translate(4, 0, 0);
			}
		}
	}
	
	public void update(){
		camera.update();
		move();
	}
	
	
	public void target(Entity ent){
		entity = ent;
		camera.position.x = entity.getX()+16;
		camera.position.y = entity.getY()-16;
		if(camera.position.x < 96){
			camera.position.x = 96;
		}
		if(camera.position.x > layer2.getWidth()*16-96){
			camera.position.x = layer2.getWidth()*16-96;
		}
		if(camera.position.y < 96){
			camera.position.y = 96;
		}
		if(camera.position.y > layer2.getHeight()*16-96){
			camera.position.y = layer2.getHeight()*16-96;
		}
	}
	
	
}
