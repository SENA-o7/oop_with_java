public class Person {
    // Sınıf nitelikleri
    private int id;
    private String firstName;
    private String lastName;
    private int age;


    private static int idCounter = 0;

    // Birinci constructor - Tüm nitelikleri kullanıcıdan alır
    public Person(int id, String firstName, String lastName, int age) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;

    }

    // İkinci constructor - Sadece ad ve soyadı alır, id otomatik atanır, yaş 0 olur
    public Person(String firstName, String lastName) {
        this.id = ++idCounter;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = 0;
    }

    // Üçüncü constructor - Sadece id alır, diğerleri varsayılan değerlere atanır
    public Person(int id) {
        this.id = id;

    }

    // Dördüncü constructor - Sadece idCounter artırılır, diğer nitelikler varsayılan olur
    public Person() {
        this.id = ++idCounter;
        this.firstName = "Unknown";
        this.lastName = "Unknown";
        this.age = 0;               }

    // Getter metotlar
    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    // Bilgileri yazdıran bir metot
    public void displayInfo() {
        System.out.println("ID: " + id + ", First Name: " + firstName + ", Last Name: " + lastName + ", Age: " + age);
    }
}
