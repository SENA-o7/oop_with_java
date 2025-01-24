//1. Create Branch Enum type will contain following branches
    //1. MATH(“information regarding math”)
    //2. PHYSICS(“information regarding physics”)
    //3. CS(“information regarding cs”)
    // 4. ENG(“information regarding eng”)
//2. Create a Teacher Class which contains id (int), and branch (Enum) attributes. The class must have a constructor with these two parameters.
//3. Create four teacher objects; each has different branch.
//4. Put them all in an array, and print their branches using for loop


// Main sınıfı ve ana metot
public class Main {
    public static void main(String[] args) {
        // 4 farklı öğretmen nesnesi oluşturuluyor.
        Teacher teacher1 = new Teacher(1, Branch.MATH);
        Teacher teacher2 = new Teacher(2, Branch.PHYSICS);
        Teacher teacher3 = new Teacher(3, Branch.CS);
        Teacher teacher4 = new Teacher(4, Branch.ENG);

        Teacher[] teachers = {teacher1, teacher2, teacher3, teacher4};


        System.out.println("Teachers' Branches:");
        for (Teacher teacher : teachers) {
            System.out.println("Teacher ID: " + teacher.getId() +
                    ", Branch: " + teacher.getBranch() +
                    ", Description: " + teacher.getBranch().getDescription());
        }
    }
}
