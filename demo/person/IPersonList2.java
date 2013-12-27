package com.demo.person;


import com.demo.iterator.Iterator;

public interface IPersonList2 extends IPerson{

	public IPerson[] getPersonList();
	public Iterator iterator();
}
