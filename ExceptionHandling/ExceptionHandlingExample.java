
import java.util.InputMismatchException; // InputMismatchException sınıfı hataları yakalamak için kullanılır.
import java.util.Scanner; // Kullanıcıdan veri almak için Scanner sınıfı kullanılır.

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        // Kullanıcıdan girdi almak için Scanner nesnesi oluşturuluyor
        Scanner scanner = new Scanner(System.in);

        int number;


        System.out.println("Bir sayı giriniz: ");

        try {
            // try bloğu içinde riskli kod yazılır.
            // Burada, kullanıcıdan tam sayı girişi alıyoruz.
            number = scanner.nextInt();

            // Eğer kullanıcı doğru bir tam sayı girerse, bu mesaj yazdırılır.
            System.out.println("Girdiğiniz sayı: " + number);
        } catch (InputMismatchException e) {
            // Eğer kullanıcı tam sayı yerine başka bir türde veri girerse
            // bu blok çalışır ve hata yakalanır.
            System.out.println("Hatalı giriş yaptınız!");
        } finally {
            // finally bloğu her durumda çalışır (hata oluşsa da oluşmasa da).
            // Burada Scanner nesnesini kapatarak kaynağı serbest bırakıyoruz.
            scanner.close();
        }
    }
}