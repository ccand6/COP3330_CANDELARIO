//The abstract classes set the requirements for each class that inherits from them.
//The program was extremely simplified after realizing that the tests wouldn't run if they ran a function with a prompt for user input.
//This assignment was going to have the user put in measurements and shape, but it interfered with the JUnit tests.

abstract class Shape {
    public abstract String getName();
}

abstract class Shape2D extends Shape {
    public abstract double getArea();
}

abstract class Shape3D extends Shape {
    public abstract double getArea();
    public abstract double getVolume();
}
