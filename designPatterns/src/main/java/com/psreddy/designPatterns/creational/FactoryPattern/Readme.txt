In Factory pattern, we create object without exposing the creation logic to the client and refer to newly created object using a common interface.

Implementation:

Created interface:
 1. Shape (interface)

Created concrete classes:
 1. Circle (implements the Shape interface).
 2. Rectangle (implements the Shape interface).
 3. Square (implements the Shape interface).
 4. ShapeFactory (A factory class).
 5. FactoryPatternDemo (With main method)

FactoryPatternDemo, our demo class will use ShapeFactory to get a Shape object. It will pass information (CIRCLE / RECTANGLE / SQUARE) to ShapeFactory to get the type of object it needs.

ULM is added for above