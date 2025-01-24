public class Teacher {

    private int id;
    private Branch branch;

    // Constructor - id ve branch parametreleri ile nesne oluşturulur.
    public Teacher(int id, Branch branch) {
        this.id = id;
        this.branch = branch;
    }


    public Branch getBranch() {
        return branch;
    }


    public int getId() {
        return id;
    }
}
