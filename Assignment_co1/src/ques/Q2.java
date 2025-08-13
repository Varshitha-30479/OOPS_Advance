package ques;
public class Q2 {
	 public static void main(String[] args) {
	        
	        String[] students = { "Alice", "Bob", "Charlie", "David" };

	        
	        int[][] marks = {
	            { 45, 67, 89 },   
	            { 35, 35, 35 },   
	            { 50, 22, 40 },   
	            { 70, 80, 90 }    
	        };

	        System.out.println("---- Students who passed all subjects ----");
	        for (int i = 0; i < students.length; i++) {
	            boolean passedAll = true;

	            for (int j = 0; j < marks[i].length; j++) {
	                if (marks[i][j] < 35) {
	                    passedAll = false;
	                    break;
	                }
	            }

	            if (passedAll) {
	                System.out.println("Name: " + students[i]);
	            }
	        }
	    }
	}
