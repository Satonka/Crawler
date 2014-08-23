package com.sam.managers.loaders;

import java.io.IOException;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.utils.XmlReader;
import com.sam.levels.LevelBase;
import com.sam.managers.LevelManager;

public class LevelLoader {

	public XmlReader 	reader;
	public String 		str;
	public LevelBase	level;
	
	public LevelLoader(String xml, LevelManager manager){
		reader = new XmlReader();
		try {
			for(int i = 0; i < reader.parse(Gdx.files.internal(xml)).getChildCount(); i++){
				try {
					str = reader.parse(Gdx.files.internal(xml)).getChild(i).get("map");
					level = new LevelBase(str, manager);
					
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
