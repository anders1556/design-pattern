package com.design.iterator.person;

import java.util.Random;

import com.design.iterator.iterator.ArrPersonIterator;
import com.design.iterator.iterator.Iterator;

public class PersonList2 implements IPersonList2{

	private final IPerson[] list = new IPerson[10];
	
	public PersonList2(){
		Random random = new Random();
		for(int i=0;i<10;i++){
			IPerson person = new Person(" 人员"+ i, random.nextInt(30),random.nextInt(2));
			list[i] = person;
			//this.list.add(person);
		}
	}
	
	public IPerson[] getPersonList(){
		return this.list;
	}

	public Iterator iterator() {
		return new ArrPersonIterator(this.list);
	}

	public String getPersonInfo() {
		return null;
	}


}
