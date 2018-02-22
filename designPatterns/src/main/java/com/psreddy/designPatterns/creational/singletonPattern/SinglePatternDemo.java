package com.psreddy.designPatterns.creational.singletonPattern;
/*
 *@author psreddy247
 *
 */
public class SinglePatternDemo {

	public static void main(String[] args) {
		//This code gets a object of SingletonObject
		SingletonObject singletonObject1 = SingletonObject.getInstance();
		singletonObject1.getMessage();
		
		//This code also gest the same object of SingletonObject as we get above
		SingletonObject singletonObject2 = SingletonObject.getInstance();
		singletonObject2.getMessage();
		

	}

}
