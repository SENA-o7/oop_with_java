import java.util.ArrayList;
import java.util.Date;


public class Main {
    public static void main(String[] args) {
        // Kitap örneği
        Book book = new Book("Java Programming", new Date());
        book.addAuthor("ASLI DOĞAN");
        book.addAuthor("KEMAL KIRILMAZ");

        System.out.println("Kitap Başlığı: " + book.getTitle());
        System.out.println("Yazarlar: " + book.getAuthors());
        System.out.println("Tarih: " + book.getDate());

        // E-posta örneği
        EMail email = new EMail("Toplantı Hatırlatıcısı", new Date());
        email.addAuthor("Project Manager :FIRAT KARA");
        email.addTo("team@gmail.com");
        email.addTo("ceo@gmail.com");

        System.out.println("\nE-posta Konusu: " + email.getSubject());
        System.out.println("Gönderen: " + email.getAuthors());
        System.out.println("Alıcılar: " + email.getTo());
        System.out.println("Tarih: " + email.getDate());
    }
}

