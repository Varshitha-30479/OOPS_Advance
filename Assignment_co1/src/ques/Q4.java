package ques;
public class Q4 {
	public static void main(String[] args) {
        
        String s1 = "preeth";
        String s2 = "Preeth";

        // New String objects (stored in Heap)
        String s3 = new String("Preeth");
        String s4 = new String("PREETH");

        System.out.println("--- Using == (Reference Comparison) ---");
        System.out.println("s1 == s2: " + (s1 == s2)); 
        System.out.println("s1 == s3: " + (s1 == s3)); 
        System.out.println("s3 == s4: " + (s3 == s4)); 

        System.out.println("\n--- Using equals() (Content Comparison, Case-Sensitive) ---");
        System.out.println("s1.equals(s2): " + s1.equals(s2)); 
        System.out.println("s1.equals(s3): " + s1.equals(s3)); 
        System.out.println("s1.equals(s4): " + s1.equals(s4)); 

        System.out.println("\n--- Using equalsIgnoreCase() (Content Comparison, Case-Insensitive) ---");
        System.out.println("s1.equalsIgnoreCase(s4): " + s1.equalsIgnoreCase(s4)); 
    }
}
