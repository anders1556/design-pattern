package com.design.iterator.client;

import java.util.ArrayList;

import com.design.iterator.iterator.Iterator;
import com.design.iterator.person.IPerson;
import com.design.iterator.person.IPersonList2;
import com.design.iterator.person.PersonList2;

public class Client {

	/**
	 * @param args
	 */
//	public static void main(String[] args) {
//
//		IPersonList personList = new PersonList();
//		System.out.println("---使用内部对象输出人员信息start----");
//		
//		ArrayList<IPerson> arrayList = personList.getPersonList();
//		for(int i=0 ;i < arrayList.size(); i++){
//			System.out.println(arrayList.get(i).getPersonInfo());
//		}
//		System.out.println("---使用内部对象输出人员信息end---");
//		System.out.println("---使用迭代器输出人员信息start---");
//		Iterator iterator = personList.iterator();
//		while(iterator.hasNext()){
//			IPerson person = iterator.next();
//			if(person != null){
//				System.out.println(person.getPersonInfo());
//			}
//		}
//		System.out.println("---使用迭代器输出人员信息end---");
//	}
	
	public static void main(String[] args) {

		IPersonList2 personList = new PersonList2();
//		System.out.println("---使用内部对象输出人员信息start----");
//		
//		ArrayList<IPerson> arrayList = personList.getPersonList();
//		for(int i=0 ;i < arrayList.size(); i++){
//			System.out.println(arrayList.get(i).getPersonInfo());
//		}
//		System.out.println("---使用内部对象输出人员信息end---");
		System.out.println("---使用迭代器输出人员信息start---");
		Iterator iterator = personList.iterator();
		while(iterator.hasNext()){
			IPerson person = iterator.next();
			if(person != null){
				System.out.println(person.getPersonInfo());
			}
		}
		System.out.println("---使用迭代器输出人员信息end---");
	}

}