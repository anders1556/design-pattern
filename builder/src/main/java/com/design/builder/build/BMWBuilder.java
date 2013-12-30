package com.design.builder.build;

import java.util.ArrayList;

import com.design.builder.model.BMWModel;
import com.design.builder.model.CarModel;

public class BMWBuilder {

	private BMWModel bmw = new BMWModel(); 
	 
	public CarModel getCarModel() { 
	 
	return this.bmw; 
	 
	} 
	 
	public void setSequence(ArrayList<String> sequence) { 
	 
	this.bmw.setSequence(sequence); 
	 
	} 
}
