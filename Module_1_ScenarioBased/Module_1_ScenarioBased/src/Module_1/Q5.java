/*Build A hospital management system that keeps track of patient visits.
 * Task: Create a class Patient with encapsulated fields: patientId, name, visits[].
 * Include a static counter for total patients.
 * Create constructors to initialize data.
 * Display visit data using enhanced for loop.
 * Demonstrate usage of String fields and proper comparisons.
*/
package Module_1;

public class Q5 {

 static class Patient {

     private int patientId;
     private String name;
     private String[] visits;
     
     private static int totalPatients = 0;

     public Patient(String name, String[] visits) {
         this.patientId = ++totalPatients; 
         this.name = name;
         this.visits = visits;
     }

     public int getPatientId() {
         return patientId;
     }

     public String getName() {
         return name;
     }

     public String[] getVisits() {
         return visits;
     }

     public void displayDetails() {
         System.out.println("Patient ID: " + patientId);
         System.out.println("Name: " + name);
         System.out.println("Visits:");
         for (String visit : visits) { 
             System.out.println(" - " + visit);
         }
         System.out.println("-------------------------");
     }

     public static void showTotalPatients() {
         System.out.println("Total Patients: " + totalPatients);
     }
 }

 public static void main(String[] args) {
     Patient p1 = new Patient("Keerthana", new String[]{"2025-08-01", "2025-08-10"});
     Patient p2 = new Patient("John", new String[]{"2025-08-05"});

     p1.displayDetails();
     p2.displayDetails();

     Patient.showTotalPatients();

     String searchName = "Keerthana";
     if (p1.getName().equals(searchName)) { 
         System.out.println("✅ Patient name matches using equals()");
     }
     if (p1.getName() == searchName) { 
         System.out.println("✅ Patient name matches using == (same reference)");
     } else {
         System.out.println("⚠ Patient name does not match using == (different reference)");
     }
 }
}
