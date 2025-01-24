import java.util.ArrayList;
import java.util.Date;

public class Document {
    private ArrayList<String> authors;
    private Date date;


    public Document(Date date) {
        this.authors = new ArrayList<>();
        this.date = date;
    }


    public ArrayList<String> getAuthors() {
        return this.authors;
    }


    public void addAuthor(String name) {
        this.authors.add(name);
    }


    public Date getDate() {
        return this.date;
    }
}
