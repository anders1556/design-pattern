package com.design.iterator.iterator;

import com.design.iterator.person.IPerson;

public class ArrPersonIterator implements Iterator{

	private final IPerson[] personList;
	private int index = -1;
	
	public ArrPersonIterator(IPerson[] personList){
		this.personList = personList;
	}

	public boolean hasNext() {
		return (this.personList == null ? false : (index < this.personList.length - 1));
	}

	public IPerson next() {
		if(this.personList != null && (index < this.personList.length - 1)){
			return this.personList[++index];
		}
		return null;
	}

	public Object remove() {
		if(this.personList != null){
			IPerson person = this.personList[index];
			this.personList[index] = null;
			return person;
		}
		return null;
	}
}