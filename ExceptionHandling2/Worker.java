// Worker sınıfı tanımlanıyor
public class Worker {
    // Nitelikler (Attributes)
    private String name;
    private double salary;
    private static int counter = 0; // Tüm Worker nesneleri için ortak çalışan sayacı

    // Constructor (Kurucu metot)
    public Worker(String name, double salary) {
        this.name = name;
        setSalary(salary);
        counter++; // Yeni bir çalışan oluşturulduğunda sayaç bir artırılır
    }

    // setName metodu - Çalışanın adını değiştirmek için
    public void setName(String name) {
        this.name = name;
    }

    // setSalary metodu - Maaşı kontrol ederek atama yapar
    public void setSalary(double salary) {
        // Eğer maaş 0'dan küçükse, IllegalArgumentException fırlatılır
        if (salary < 0) {
            throw new IllegalArgumentException("Maaş 0'dan büyük olmalı!!");
        }
        this.salary = salary;
    }

    // Çalışan sayısını döndüren static bir metot
    public static int getWorkerCount() {
        return counter;
    }

    // Çalışanın bilgilerini yazdırmak için bir metot
    public void displayWorkerInfo() {
        System.out.println("Name: " + name +  "  Salary: $" + salary);
    }
}
