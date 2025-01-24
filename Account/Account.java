public class Account {
    // Özellikler (Attributes)
    private String name; // Hesap sahibinin adı
    private double balance; // Hesabın bakiyesi

    // Kurucu metot (Constructor)
    public Account(String name, double balance) {
        this.name = name;
        // Bakiye negatif olamaz, bu durumda 0 olarak ayarlanır.
        if (balance > 0) {
            this.balance = balance;
        } else {
            this.balance = 0.0;
        }
    }

    // Para yatırma metodu
    public void deposit(double depositAmount) {
        if (depositAmount > 0.0) {
            balance += depositAmount;
        } else {
            System.out.println("Miktar sıfırdan büyük olmalıdır.");
        }
    }

    // Bakiye getirme metodu
    public double getBalance() {
        return balance;
    }

    // Hesap sahibinin adını ayarlama metodu
    public void setName(String name) {
        this.name = name;
    }

    // Hesap sahibinin adını getirme metodu
    public String getName() {
        return name;
    }


    public static void main(String[] args) {
        // Yeni bir hesap oluşturulur
        Account account1 = new Account("Ali Veli", 1500.0);


        System.out.println("Hesap Sahibi: " + account1.getName());
        System.out.println("Hesap Bakiyesi: $" + account1.getBalance());

        // Hesaba para yatırılır
        System.out.println("\n500.0 TL para yatırılıyor");
        account1.deposit(500.0);

        // Güncellenen bakiye yazdırılır
        System.out.println("Güncel Hesap Bakiyesi: " + account1.getBalance());

        // Hesap sahibinin adı değiştirilir
        System.out.println("\nHesap sahibinin adı değiştiriliyor.");
        account1.setName("Ayşe Yılmaz");
        System.out.println("Güncellenen Hesap Sahibi: " + account1.getName());
    }
}
