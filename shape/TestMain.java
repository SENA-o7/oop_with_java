public class TestMain {
    public static void main(String[] args) {

        Circle circle = new Circle(5);
        Square square = new Square(4);
        Rectangle rectangle = new Rectangle(4, 6);

        System.out.println(circle);
        System.out.println(square);
        System.out.println(rectangle);

        // Test 3D shapes
        Cylinder cylinder = new Cylinder(10, 3);
        Sphere sphere = new Sphere(4);
        Pyramid pyramid = new Pyramid(10, 8, 6);
        Cone cone = new Cone(7, 3);

        System.out.println(cylinder);
        System.out.println(sphere);
        System.out.println(pyramid);
        System.out.println(cone);
    }
}

