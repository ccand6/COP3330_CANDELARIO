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
