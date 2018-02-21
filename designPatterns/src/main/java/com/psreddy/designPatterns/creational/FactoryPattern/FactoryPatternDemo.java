/**
 * 
 */
package com.psreddy.designPatterns.creational.FactoryPattern;

/**
 * @author psreddy
 *
 *         In Factory pattern, we create object without exposing the creation
 *         logic to the client and refer to newly created object using a common
 *         interface.
 */
public class FactoryPatternDemo {

	private static final String SHAPE_CIRCLE = "Circle";
	private static final String SHAPE_RECTANGLE = "Rectangle";
	private static final String SHAPE_SQUARE = "Square";

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ShapeFactory();
		// Creates shape object of Circle. The creation is hidden.
		Shape shape1 = shapeFactory.getShape(SHAPE_CIRCLE);
		shape1.draw();

		// Creates shape object of Rectangle. The creation is hidden.
		Shape shape2 = shapeFactory.getShape(SHAPE_RECTANGLE);
		shape2.draw();

		// Creates shape object of Square. The creation is hidden.
		Shape shape3 = shapeFactory.getShape(SHAPE_SQUARE);
		shape3.draw();
	}

}
