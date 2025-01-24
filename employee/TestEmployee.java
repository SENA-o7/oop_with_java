// Employee sınıfı oluşturuluracak.
// Bu sınıfın aşağıdaki özellikleri ve metotları olacak:
// 1. **name**: Çalışanın adı (String türünde).
// 2. **socialSecurityNumber**: Çalışanın sosyal güvenlik numarası (int türünde).
// 3. **wage**: Çalışanın saatlik ücreti (float türünde).
// 4. **workingHours**: Çalışanın haftalık çalışma saati (int türünde).

// Ayrıca şu davranışlar (metotlar) olacak:
// - **displayInfo()**: Çalışanın adını ve sosyal güvenlik numarasını ekrana yazdırır.
// - **displaySalary()**: Çalışanın toplam maaşını hesaplar (wage * workingHours) ve yazdırır.

// İlk olarak bir çalışan nesnesi oluşturulacak ve özellikleri doğrudan atanacak.
// Ardından displayInfo() ve displaySalary() metodları çağrılacak.

// Daha sonra başka bir çalışan nesnesi oluşturulacak. Ancak bu sefer özellikler klavyeden (kullanıcıdan) alınacak.

import java.util.Scanner;// Klavye girişi için Scanner sınıfı kullanılacak.

class Employee {
    // Nitelikler (Attributes)
    String name;
    int socialSecurityNumber;
    float wage;
    int workingHours;

    // Kurucu metot (Constructor), nitelikleri başlatmak için
    public Employee(String name, int socialSecurityNumber, float wage, int workingHours) {
        this.name = name;
        this.socialSecurityNumber = socialSecurityNumber;
        this.wage = wage;
        this.workingHours = workingHours;
    }

    // Çalışan bilgilerini ekrana yazdıran metot
    public void displayInfo() {
        System.out.println("Çalışan Adı: " + name);
        System.out.println("Sosyal Güvenlik Numarası: " + socialSecurityNumber);
    }

    // Maaşı hesaplayıp ekrana yazdıran metot
    public void displaySalary() {
        float salary = wage * workingHours;
        System.out.println("Çalışanın Maaşı: $" + salary);
    }
}



public class TestEmployee {
    public static void main(String[] args) {
        // İlk çalışan nesnesi oluşturuluyor ve özellikleri atanıyor.
        Employee employee1 = new Employee("SEMA YILMAZ", 12345, 20.5f, 40);
        System.out.println("İlk Çalışanın Bilgileri:");
        employee1.displayInfo();
        employee1.displaySalary();
        System.out.println();

        // İkinci çalışan için kullanıcıdan veri almak
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nİkinci çalışanın adını girin: ");
        String name2 = scanner.nextLine();

        System.out.println("İkinci çalışanın Sosyal Güvenlik Numarasını girin: ");
        int socialSecurityNumber2 = scanner.nextInt();

        System.out.println("İkinci çalışanın saatlik ücretini girin: ");
        float wage2 = scanner.nextFloat();

        System.out.println("İkinci çalışanın çalışma saatini girin: ");
        int workingHours2 = scanner.nextInt();

        // Kullanıcıdan alınan verilerle ikinci çalışan nesnesini oluşturma
        Employee employee2 = new Employee(name2, socialSecurityNumber2, wage2, workingHours2);

        System.out.println("\nİkinci Çalışanın Bilgileri:");
        employee2.displayInfo();      // displayInfo() metodu çağrılıyor.
        employee2.displaySalary();   // displaySalary() metodu çağrılıyor.

        scanner.close(); // Scanner nesnesi kapatılıyor.
    }
}