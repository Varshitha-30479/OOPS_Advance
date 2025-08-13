package oops_practical_tasks;
import java.util.Scanner;
class Student{
	String name;
	int Rollno;
	int[] marks;

		void setter(String name, int Rollno, int[] marks)
	{
		this.name = name;
		this.Rollno = Rollno;
		this.marks = marks;
		
	}
		
	void getter()
	{
		System.out.println("Name of the Student: " + name);
		System.out.println("Rollno of the Student: " + Rollno);
		System.out.println("Marks of the Student:  " );
		  for (int marks : marks) {
		        System.out.print(marks + " ");
		    }
		
	}
}
public class Task1 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name:");
		String name=sc.next();
		System.out.println("enter the Rollno.:");
		int Rollno=sc.nextInt();
		System.out.println("enter the no.of subjects: ");
		int subjects=sc.nextInt();
		int[] marks=new int[subjects];
		for(int i=0;i<subjects;i++) {
			System.out.print("Enter marks for subject " + (i + 1) + ": ");
	        marks[i] = sc.nextInt();
	        
		}
	        Student st = new Student();
	    	st.setter(name,Rollno,marks);
	    	st.getter();
	    	sc.close();
		
	}
	

}


