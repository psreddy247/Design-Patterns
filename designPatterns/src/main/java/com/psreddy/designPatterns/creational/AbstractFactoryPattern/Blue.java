package com.psreddy.designPatterns.creational.AbstractFactoryPattern;

/**
 * @author psreddy
 * 
 */
public class Blue implements Color {

	/* (non-Javadoc)
	 * @see com.psreddy.designPatterns.creational.FactoryPattern.Shape#draw()
	 */
	public void fill() {
		System.out.println("I am in blue fill()");

	}
}
