package com.psreddy.designPatterns.creational.AbstractFactoryPattern;

public class ShapeFactory extends AbstractFactory {
	
	/**
	 * @param shapeName
	 */
	@Override
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
	
	@Override
	public Color getColor(String colorName){
		return null;
	}
}
