public class Main {
    public static void main(String[] args) {
        // Birinci constructor ile tüm nitelikleri ayarlayan nesne
        Person person1 = new Person(01, "KEMAL", "ADA", 25);

        // İkinci constructor ile ad ve soyad ayarlanan nesne
        Person person2 = new Person("ESMA", "KİTAP");

        // Üçüncü constructor ile sadece id ayarlanan nesne
        Person person3 = new Person(03);

        // Dördüncü constructor ile sadece idCounter artırılan nesne
        Person person4 = new Person();

        person1.displayInfo();
        person2.displayInfo();
        person3.displayInfo();
        person4.displayInfo();
    }
}
