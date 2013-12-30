package com.design.iterator.person;

public class Person implements IPerson{

	private String name;
	private int age;
	private int sex;
	public Person(String name,int age , int sex){
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	public String getPersonInfo(){
		return "姓名" + this.name + "－年龄" + this.age + "－性别" + (this.sex == 1? "man" : (
				this.sex == 0? "woman":""));
	}
}