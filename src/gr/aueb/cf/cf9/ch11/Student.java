package gr.aueb.cf.cf9.ch11;

/**
 * Java Bean.
 * Data class that has
 *  - private fields
 *  - default constructor
 *  - getters and setters
 */
public class Student {
    private static int studentsCount;

    static {
        studentsCount = 0;
    }

    private int id;
    private String firstname;
    private String lastname;

    // Default constructor
    public  Student() {

    }

    // Overloaded constructor
    public Student(int id, String firstname, String lastname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        studentsCount++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public static int getStudentsCount() {
        return studentsCount;
        //id = 0;           //  from static, only static
    }
}
