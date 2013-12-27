package com.demo.iterator;

import com.demo.person.IPerson;

public interface Iterator {

	public boolean hasNext();
	
	public IPerson next();
	
	public Object remove();
}
