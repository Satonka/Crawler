package com.sam.managers;

import java.io.IOException;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.utils.XmlReader;
import com.sam.levels.LevelBase;

public class LevelLoader {

	public XmlReader 	reader;
	public String 		str;
	
	public LevelLoader(String xml, LevelManager manager){
		reader = new XmlReader();
		try {
			for(int i = 0; i < reader.parse(Gdx.files.internal(xml)).getChildCount(); i++){
				try {
					str = reader.parse(Gdx.files.internal(xml)).getChild(i).get("map");
					manager.addLevel(new LevelBase(str, manager));
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
