public class StudentApp {
    public static void main(String[] args) {

        BachelorStudent bachelor = new BachelorStudent(1, 70, 80);
        MasterStudent master = new MasterStudent(2, 85, 90, 3);
        PhDStudent phd = new PhDStudent(3, 88, 92, 4);

        System.out.println("\n");
        System.out.println("Bachelor Student Total Score: " + bachelor.computeBaseScore());
        System.out.println("Bachelor Student Project Score: " + bachelor.projectScore());
        System.out.println("\n");
        System.out.println("Master Student Total Score: " + master.computeBaseScore());
        System.out.println("Master Student Conference Score: " + master.conferenceScore());
        System.out.println("\n");
        System.out.println("PhD Student Total Score: " + phd.computeBaseScore());
        System.out.println("PhD Student Article Score: " + phd.articleScore());
    }
}
