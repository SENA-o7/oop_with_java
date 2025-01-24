import java.util.ArrayList;
import java.util.Date;


public class EMail extends Document {
    private String subject;
    private ArrayList<String> to;

    // Constructor
    public EMail(String subject, Date date) {
        super(date);
        this.subject = subject;
        this.to = new ArrayList<>();
    }


    public String getSubject() {
        return this.subject;
    }


    public ArrayList<String> getTo() {
        return this.to;
    }


    public void addTo(String recipient) {
        this.to.add(recipient);
    }
}
