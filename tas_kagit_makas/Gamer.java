import java.util.Scanner;

public class Gamer {
    String name;
    HandSign sign;
    static int numDraw = 0;
    static int numTrials = 0;
    int numOfWins = 0;

    // Constructor
    public Gamer(String name) {
        this.name = name;
    }

    // Oyuncunun el hareketini seçmesini sağlar
    public void move(Scanner scanner) {
        boolean isValid = false;
        do {
            System.out.println(this.name + ", Taş, Kağıt veya Makas seçiniz (Tas, Kagit, Makas):");
            String input = scanner.nextLine();
            input = input.substring(0, 1).toUpperCase() + input.substring(1).toLowerCase(); // İlk harfi büyük yapar
            try {
                this.sign = HandSign.valueOf(input); // Geçerli bir hareket seçilmişse
                isValid = true;
            } catch (IllegalArgumentException e) {
                System.out.println("Geçersiz giriş! Lütfen Taş, Kağıt veya Makas seçiniz.");
            }
        } while (!isValid);
    }
}
