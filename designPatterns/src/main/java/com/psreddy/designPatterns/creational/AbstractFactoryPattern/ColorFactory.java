package com.psreddy.designPatterns.creational.AbstractFactoryPattern;

public class ColorFactory extends AbstractFactory {
	
	/**
	 * @param shapeName
	 */
	public Color getColor(String colorName){
		if("RED".equalsIgnoreCase(colorName)){
			return new Red();
		}else if("GREEN".equalsIgnoreCase(colorName)){
			return new Green();
		}else if("BLUE".equalsIgnoreCase(colorName)){
			return new Blue();
		}else{
			return null;
		}
	}
	public Shape getShape(String shapeName){
		return null;
	}
	
}
