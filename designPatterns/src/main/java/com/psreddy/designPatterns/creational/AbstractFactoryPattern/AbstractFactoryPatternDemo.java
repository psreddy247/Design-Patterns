/**
 * 
 */
package com.psreddy.designPatterns.creational.AbstractFactoryPattern;

/**
 * @author psreddy
 *
 *         In Factory pattern, we create object without exposing the creation
 *         logic to the client and refer to newly created object using a common
 *         interface.
 */
public class AbstractFactoryPatternDemo {

	private static final String SHAPE_CIRCLE = "Circle";
	private static final String SHAPE_RECTANGLE = "Rectangle";
	private static final String SHAPE_SQUARE = "Square";
	
	private static final String COLOR_RED = "Red";
	private static final String COLOR_GREEN = "Green";
	private static final String COLOR_BLUE = "Blue";
	
	private static final String AF_SHAPE = "Shape";
	private static final String AF_COLOR = "Color";

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		AbstractFactory abstactFactory1 = FactoryProducer.getFactory(AF_SHAPE);
		
		Shape shape1 = abstactFactory1.getShape(SHAPE_CIRCLE);
		shape1.draw();		
		Shape shape2 = abstactFactory1.getShape(SHAPE_RECTANGLE);
		shape2.draw();		
		Shape shape3 = abstactFactory1.getShape(SHAPE_SQUARE);
		shape3.draw();		
		
		AbstractFactory abstactFactory2 = FactoryProducer.getFactory(AF_COLOR);
		
		// Creates color object of red. The creation is hidden.
		Color color1 = abstactFactory2.getColor(COLOR_RED);
		color1.fill();

		// Creates color object of green. The creation is hidden.
		Color color2 = abstactFactory2.getColor(COLOR_GREEN);
		color2.fill();
		
		// Creates color object of blue. The creation is hidden.
		Color color3 = abstactFactory2.getColor(COLOR_BLUE);
		color3.fill();
	}

}
