/**
 * 
 */
package com.psreddy.designPatterns.creational.singletonPattern;

/**
 * @author psreddy 
 * This pattern involves a single class which is responsible to
 *         create an object while making sure that only single object gets
 *         created. 
 * This class provides a way to access its only object which
 *         can be accessed directly without need to instantiate the object of
 *         the class.
 */
public class SingletonObject {

	private static SingletonObject singletonObject = new SingletonObject();
	private int messageCount = 0;
	/**
	 * private constructor not allows to create object form outside
	 */
	private SingletonObject() {
		// TODO Auto-generated constructor stub
	}

	public static SingletonObject getInstance() {
		return singletonObject;
	}
	
	public void getMessage(){
		messageCount++;
		System.out.println("message from the singleton object: count: "+messageCount);
	}

}
