package com.design.builder.build;

import java.util.ArrayList;

import com.design.builder.model.BenzModel;
import com.design.builder.model.CarModel;

public class BenzBuilder extends CarBuilder{

	private BenzModel benz = new BenzModel(); 
	 
	public CarModel getCarModel() { 
	 
	return this.benz; 
	 
	} 
	 
	public void setSequence(ArrayList<String> sequence) { 
	 
	this.benz.setSequence(sequence); 
	 
	} 
}
