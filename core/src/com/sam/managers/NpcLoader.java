package com.sam.managers;

import java.io.IOException;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.utils.XmlReader;
import com.sam.entities.characters.Character;

public class NpcLoader {

	public XmlReader	reader;
	public EntityManager	entityManager;
	public String 		name, image, xml;
	public int 			Xpos, Ypos;
	public Character	charact;
	public TiledMap		map;
	
	public NpcLoader(String xml1, EntityManager entman, TiledMap mip){
		reader = new XmlReader();
		entityManager = entman;
		xml = xml1;
		map = mip;
	}
	
	public void load(){
		try {
			for(int i = 0; i < reader.parse(Gdx.files.internal(xml)).getChildCount(); i++){
				try {
					name = reader.parse(Gdx.files.internal(xml)).getChild(i).get("name");
					image = reader.parse(Gdx.files.internal(xml)).getChild(i).get("image");
					Xpos = Integer.parseInt(reader.parse(Gdx.files.internal(xml)).getChild(i).get("Xpos"));
					Ypos = Integer.parseInt(reader.parse(Gdx.files.internal(xml)).getChild(i).get("Ypos"));
					charact = new Character(name, map, image, Xpos, Ypos, entityManager);
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
