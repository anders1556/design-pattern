package com.Builder.build;

import java.util.ArrayList;

import com.Builder.model.BMWModel;
import com.Builder.model.CarModel;

public class BMWBuilder extends CarBuilder{

	private BMWModel bmw = new BMWModel(); 
	 
	public CarModel getCarModel() { 
	 
	return this.bmw; 
	 
	} 
	 
	public void setSequence(ArrayList<String> sequence) { 
	 
	this.bmw.setSequence(sequence); 
	 
	} 
}
