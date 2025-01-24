//Create a Circle class where
//declare a private constant  double variable PI has valueof 3,141519
// declare a private variable called radius.
//class constructor will have an argument to set radius.
//declare a method called computeArea() to compute areaof a circle object.
//create 3 different circle instances, with radiuses 5, 10,15.
//print all the areas using a foreach loop



public class Circle {
    // Sabit (constant) bir değişken tanımlıyoruz. PI'nin değeri değiştirilemez.
    private static final double PI = 3.141519;

    // Çemberin yarıçapını tutacak özel (private) bir değişken tanımlıyoruz.
    private double radius;

    // Constructor (kurucu metot) - Çember nesnesi oluşturulurken yarıçap atanır.
    public Circle(double radius) {
        this.radius = radius;
    }


    public double computeArea() {
        // Alan formülü: PI * radius^2
        return PI * radius * radius;
    }


    public double getRadius() {
        return radius;
    }
}

