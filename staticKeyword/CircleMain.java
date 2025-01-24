
public class CircleMain {
    public static void main(String[] args) {
        // 3 farklı Circle nesnesi oluşturuluyor.
        Circle circle1 = new Circle(5);
        Circle circle2 = new Circle(10);
        Circle circle3 = new Circle(15);

        // Circle nesnelerini bir diziye (array) ekliyoruz.
        Circle[] circles = {circle1, circle2, circle3};


        System.out.println("Circle Areas:");
        for (Circle circle : circles) {
            System.out.println("Radius: " + circle.getRadius() + ", Area: " + circle.computeArea());
        }
    }
}
