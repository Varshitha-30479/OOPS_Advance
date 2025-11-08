/*Q1: A school management system wants to store details of 
 * teachers including name, ID, and subject. 
 * Each time a teacher object is created, the system should assign a unique ID automatically.
 * Create a class Teacher with instance variables for name, id, and subject.
 * Use a static counter to auto-generate unique IDs.
 * Create a constructor to initialize the values and display the
 *  details of each teacher object.
*/

package Module_1;

class Teacher{
    private String name;
    private int id;
    private String subject;
    private static int counter = 1000;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
        this.id = ++counter;  
    }

    public void showDetails() {
        System.out.println("Teacher ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Subject: " + subject);
        System.out.println("--------------------");
    }
}

public class Q1 {
	public static void main(String[] args) {
        Teacher t1 = new Teacher("Keer", "English");
        Teacher t2 = new Teacher("Rahul", "Math");
        Teacher t3 = new Teacher("latha", "Science");
        t1.showDetails();
        t2.showDetails();
        t3.showDetails();
    }
}