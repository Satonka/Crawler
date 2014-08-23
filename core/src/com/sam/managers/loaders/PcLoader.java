package com.sam.managers.loaders;

import java.io.IOException;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.utils.XmlReader;
import com.sam.entities.characters.pcs.PlayerCharacter;
import com.sam.managers.EntityManager;
import com.sam.managers.PcManager;

public class PcLoader {

	public XmlReader	reader;
	public EntityManager	entityManager;
	public PcManager	pcmanager;
	public String 		name, image, xml;
	public int 			Xpos, Ypos;
	public PlayerCharacter	charact;
	public TiledMap		map;
	
	public PcLoader(String xml1, PcManager pcman, EntityManager entman, TiledMap mip){
		reader = new XmlReader();
		pcmanager = pcman;
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
					charact = new PlayerCharacter(map, image, Xpos, Ypos, entityManager, pcmanager);
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
