package com.sam.managers;

import java.util.ArrayList;

import com.sam.levels.LevelBase;

public class LevelManager {

	
	public ArrayList<LevelBase>	levelList;
	public LevelBase			currentLevel;
	
	public LevelManager(){
		levelList = new ArrayList<LevelBase>();
	}
	
	public LevelBase getLevel(int i){
		return levelList.get(i);
	}
	
	public void switchToLevel(LevelBase level){
		currentLevel = level;
	}
	
	public void addLevel(LevelBase level){
		levelList.add(level);
	}
	
	public LevelBase getCurrentLevel(){
		return currentLevel;
	}
	
	public LevelBase getLevel(String name){
		for(int i = 0; i < levelList.size(); i++){
			if(levelList.get(i).map.getProperties().containsKey(name)){
				LevelBase level = levelList.get(i);
				return level;
			}
		}
		return null;
	}
}
