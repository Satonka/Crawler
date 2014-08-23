package com.sam.managers;

import java.util.ArrayList;

import com.sam.entities.passageways.Passageway;

public class PassagewayManager {

	
	public ArrayList<Passageway>	passlist;
	
	public PassagewayManager(){
		passlist = new ArrayList<Passageway>();
	}
	
	public void add(Passageway pass){
		passlist.add(pass);
	}
}
