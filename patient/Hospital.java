
public class Hospital {
    // Hastane içerisinde hasta listesini tutan dizi.
    private static Patient[] patients;


    public static void main(String[] args) {

        patients = new Patient[4];

        // Hasta ID'sini otomatik artırmak için bir sayaç.
        int patientCounter = 1;


        patients[0] = new Patient(patientCounter++, "SUAT DOKTOR");
        patients[1] = new Patient(patientCounter++, "KEMAL YAPMAZ");
        patients[2] = new Patient(patientCounter++, "FERHAT DAĞDELEN");
        patients[3] = new Patient(patientCounter++, "NURSEMA BOYNUBÜKÜK");


        for (Patient patient : patients) {
            System.out.println(patient); // toString metodu  çağrılır.
        }
    }
}
