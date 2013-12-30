package com.design.iterator.iterator;

import java.util.ArrayList;

import com.design.iterator.person.IPerson;

public class PersonIterator implements Iterator{

	private final ArrayList<IPerson> personList;
	private int index = -1;
	
	public PersonIterator(ArrayList<IPerson> personList){
		this.personList = personList;
	}

	public boolean hasNext() {
		return (this.personList == null ? false : (index < this.personList.size() - 1));
	}

	public IPerson next() {
		if(this.personList != null && (index < this.personList.size() - 1)){
			return this.personList.get(++index);
		}
		return null;
	}

	public Object remove() {
		if(this.personList != null){
			return this.personList.remove(index);
		}
		return null;
	}
}
