In AbstractFactory pattern, An interface is responsible to create a factory of related Objects without specifying their classes. Each generated factory can give the objects as per the Factory pattern.   
Implementation:

Created interface:
 1. Shape
 2. Color 

Created abstract classes:
4. AbstractFactory (A factory of factory).

Created concrete classes:
 1. Circle (implements the Shape interface).
 2. Rectangle (implements the Shape interface).
 3. Square (implements the Shape interface).
 4. ShapeFactory (A factory class)
 5. ColorFactory (A factory class).
 6. FactoryProducer.
 5. AbstractFactoryPatternDemo (With main method)

AbstractFactoryPatternDemo, our demo class will use FactoryProducer to get a factory by sending factory name. The corresponding factory will creates related object.

ULM is added for above