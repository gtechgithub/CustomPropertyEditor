package com.javapoint;

class PersonType {
	
	private String type;

	PersonType(){
		
	}
	
	PersonType(String type){
		this.type=type;
	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}

public class Person {

	private String name;
	private PersonType type;

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public PersonType getType() {
		return type;
	}
	
	public void setType(PersonType type) {
		this.type = type;
	}
}
