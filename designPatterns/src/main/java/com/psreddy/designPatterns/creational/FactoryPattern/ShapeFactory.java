package com.psreddy.designPatterns.creational.FactoryPattern;

public class ShapeFactory {
	
	/**
	 * @param shapeName
	 */
	public Shape getShape(String shapeName){
		if("CIRCLE".equalsIgnoreCase(shapeName)){
			return new Circle();
		}else if("RECTANGLE".equalsIgnoreCase(shapeName)){
			return new Rectangle();
		}else if("SQUARE".equalsIgnoreCase(shapeName)){
			return new Square();
		}else{
			return null;
		}
	}
}
