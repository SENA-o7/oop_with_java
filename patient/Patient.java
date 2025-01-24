public class Patient {

    private int patientId;
    private String name;

    // Patient sınıfının constructor'ı (yapıcı metodu).
    public Patient(int patientId, String name) {
        this.patientId = patientId;
        this.name = name;
    }


    public String getName() {
        return name;
    }


    public int getPatientId() {
        return patientId;
    }

    // Hastanın bilgilerini string formatında döndüren metot.
    @Override
    public String toString() {
        return "HASTA ID: " + patientId + ", AD VE SOYAD: " + name;
    }
}
