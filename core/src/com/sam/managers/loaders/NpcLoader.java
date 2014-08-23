package com.sam.managers.loaders;

import java.io.IOException;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.utils.XmlReader;
import com.sam.entities.characters.Character;
import com.sam.enums.Type;
import com.sam.managers.EntityManager;

public class NpcLoader {

	public XmlReader	reader;
	public EntityManager	entityManager;
	public Type 		name;
	public String 		image, xml, mapname;
	public int 			Xpos, Ypos;
	public Character	charact;
	public TiledMap		map, map2;
	
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
					image = reader.parse(Gdx.files.internal(xml)).getChild(i).get("image");
					Xpos = Integer.parseInt(reader.parse(Gdx.files.internal(xml)).getChild(i).get("Xpos"));
					Ypos = Integer.parseInt(reader.parse(Gdx.files.internal(xml)).getChild(i).get("Ypos"));
					mapname = reader.parse(Gdx.files.internal(xml)).getChild(i).get("map");
					if(map.getProperties().containsKey(mapname)){
						charact = new Character(name, map, image, Xpos, Ypos, entityManager);
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
