// Cylinder Class
public class Cylinder extends Shape3D {
    private static final double PI = Math.PI;

    public Cylinder(double height, double radius) {
        super(height, radius);
    }

    @Override
    public double getVolume() {
        return PI * radius * radius * height;
    }

    @Override
    public double getArea() {
        return 2 * PI * radius * (radius + height);
    }
}
