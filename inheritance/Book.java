import java.util.Date;


public class Book extends Document {
    private String title;


    public Book(String title, Date date) {
        super(date); // Document sınıfının constructor'ını çağırır
        this.title = title;
    }


    public String getTitle() {
        return this.title;
    }
}
