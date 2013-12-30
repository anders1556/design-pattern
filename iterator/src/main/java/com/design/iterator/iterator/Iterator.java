package com.design.iterator.iterator;

import com.design.iterator.person.IPerson;

public interface Iterator {

public boolean hasNext();
	
	public IPerson next();
	
	public Object remove();
}
