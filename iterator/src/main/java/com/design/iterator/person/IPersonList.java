package com.design.iterator.person;

import java.util.ArrayList;

import com.design.iterator.iterator.Iterator;

public interface IPersonList {

	public ArrayList<IPerson> getPersonList();
	public Iterator iterator();
}
