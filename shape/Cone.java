
public class Cone extends Shape3D {
    private static final double PI = Math.PI;

    public Cone(double height, double radius) {
        super(height, radius);
    }

    @Override
    public double getVolume() {
        return (1.0 / 3.0) * PI * radius * radius * height;
    }

    @Override
    public double getArea() {
        double slantHeight = Math.sqrt(radius * radius + height * height);
        return PI * radius * (radius + slantHeight);
    }
}
