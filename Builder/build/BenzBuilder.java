package com.Builder.build;

import java.util.ArrayList;

import com.Builder.model.BenzModel;
import com.Builder.model.CarModel;

public class BenzBuilder extends CarBuilder{

	private BenzModel benz = new BenzModel(); 
	 
	public CarModel getCarModel() { 
	 
	return this.benz; 
	 
	} 
	 
	public void setSequence(ArrayList<String> sequence) { 
	 
	this.benz.setSequence(sequence); 
	 
	} 
}
