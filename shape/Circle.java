public class Circle extends Shape2D {
    private static final double PI = Math.PI;

    public Circle(double radius) {
        super(radius);
    }

    @Override
    public double getArea() {
        return PI * radius * radius;
    }
}
