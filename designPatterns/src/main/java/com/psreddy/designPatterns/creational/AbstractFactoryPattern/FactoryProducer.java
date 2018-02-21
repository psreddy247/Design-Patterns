/**
 * 
 */
package com.psreddy.designPatterns.creational.AbstractFactoryPattern;

/**
 * @author psreddy
 *
 */
public class FactoryProducer {
	
	private static final String AF_SHAPE = "Shape";
	private static final String AF_COLOR = "Color";
	
	public static AbstractFactory getFactory(String choice){
		if(AF_SHAPE.equalsIgnoreCase(choice)){
		 return new ShapeFactory();	
		}else if(AF_COLOR.equalsIgnoreCase(choice)){
			 return new ColorFactory();	
		}else{
			return null;
		}
	}
}
