package com.javapoint;

import java.beans.PropertyEditorSupport;


public class PersonTypeEditor extends PropertyEditorSupport{
	public void setAsText(String text) {
		System.out.println("inside converting string to persontype");
		setValue(new PersonType(text.toUpperCase()));
	}
}
