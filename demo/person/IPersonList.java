package com.demo.person;

import java.util.ArrayList;

import com.demo.iterator.Iterator;

public interface IPersonList {

	public ArrayList<IPerson> getPersonList();
	public Iterator iterator();
}
