public class Cube extends Shape3D {
    double area;
    double side = 10;
    double volume;
    String Name;

    public Cube() {
        double side;
        getName();
        getArea();
        getVolume();
    }

    public String getName() {
        Name = "cube";
        return Name;
    }

    public double getArea() {
        area = 6 * (side * side);
        return area;
    }

    public double getVolume() {
        volume = 3 * side;
        return volume;
    }
}
