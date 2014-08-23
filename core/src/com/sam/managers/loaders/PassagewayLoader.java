package com.sam.managers.loaders;

import java.io.IOException;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.utils.XmlReader;
import com.sam.entities.passageways.Passageway;
import com.sam.managers.EntityManager;
import com.sam.managers.LevelManager;
import com.sam.managers.PassagewayManager;

public class PassagewayLoader {
	
	public XmlReader	reader;
	public String 		from, to, xml, name, image;
	public int 			Xpos, Ypos;
	public TiledMap		map;
	public Passageway	pass;
	public PassagewayManager passagewayManager;
	public LevelManager levelManager;
	public EntityManager	entityManager;
	
	public PassagewayLoader(String xml1, PassagewayManager passman, TiledMap mip, LevelManager levman, EntityManager entman){
		reader = new XmlReader();
		passagewayManager = passman;
		levelManager = levman;
		entityManager = entman;
		xml = xml1;
		map = mip;
	}
	
	public void load(){
		try {
			for(int i = 0; i < reader.parse(Gdx.files.internal(xml)).getChildCount(); i++){
				try {
					from = reader.parse(Gdx.files.internal(xml)).getChild(i).get("from");
					to = reader.parse(Gdx.files.internal(xml)).getChild(i).get("to");
					Xpos = Integer.parseInt(reader.parse(Gdx.files.internal(xml)).getChild(i).get("xpos"));
					Ypos = Integer.parseInt(reader.parse(Gdx.files.internal(xml)).getChild(i).get("ypos"));
					name = reader.parse(Gdx.files.internal(xml)).getChild(i).get("name");
					image = reader.parse(Gdx.files.internal(xml)).getChild(i).get("image"); 
					if(map.getProperties().containsKey(from)){
						pass = new Passageway(levelManager.currentLevel, levelManager.getLevel(to), name, map, image, Xpos, Ypos, entityManager,
								passagewayManager);
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
