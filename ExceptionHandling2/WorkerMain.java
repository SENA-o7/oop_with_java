
public class WorkerMain {
    public static void main(String[] args) {
        // Exception handling (Hata yönetimi) için try-catch bloğu kullanıyoruz
        try {
            // İlk çalışan oluşturuluyor
            Worker worker1 = new Worker("SARE", 2500);
            System.out.println("----------------");
            System.out.println("Worker 1 başarıyla oluşturuldu.");
           worker1.displayWorkerInfo();
            System.out.println("----------------");

            // Hatalı maaş değeri ile bir çalışan oluşturuluyor
            Worker worker2 = new Worker("KAYA", -1500);
        } catch (IllegalArgumentException e) {
            // Exception yakalandığında mesaj ekrana yazdırılır
            System.out.println("Hata yakalandı.Worker 2 başarıyla oluşturulamadı. " + e.getMessage());
        }

        // Yeni çalışanlar oluşturuluyor
        Worker worker3 = new Worker("MERT", 3000);
        Worker worker4 = new Worker("AZRA", 4000);

        System.out.println("----------------");
        System.out.println("Toplam workers: " + Worker.getWorkerCount());
        System.out.println("----------------");

        System.out.println("Worker 3 başarıyla oluşturuldu.");
        worker3.displayWorkerInfo();
        System.out.println("----------------");
        System.out.println("Worker 4 başarıyla oluşturuldu.");
        worker4.displayWorkerInfo();
    }
}
