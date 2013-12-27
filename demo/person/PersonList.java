package com.demo.person;

import java.util.ArrayList;
import java.util.Random;

import com.demo.iterator.Iterator;
import com.demo.iterator.PersonIterator;

public class PersonList implements IPersonList{

	private ArrayList<IPerson> list = new ArrayList<IPerson>();
	
	public PersonList(){
		Random random = new Random();
		for(int i=0;i<10;i++){
			IPerson person = new Person(" 人员"+ i, random.nextInt(30),random.nextInt(2));
			this.list.add(person);
		}
	}
	
	public ArrayList<IPerson> getPersonList(){
		return this.list;
	}

	@Override
	public Iterator iterator() {
		return new PersonIterator(this.list);
	}
}
