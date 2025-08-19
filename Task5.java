package oops_practical;

import java.util.Scanner;

//Payment interface
interface Payment {
 void pay(double amount);
}

//PayPal implementation
class PayPal implements Payment {
 @Override
 public void pay(double amount) {
     System.out.println("Paid ₹" + amount + " using PayPal.");
 }
}

//RazorPay implementation
class RazorPay implements Payment {
 @Override
 public void pay(double amount) {
     System.out.println("Paid ₹" + amount + " using RazorPay.");
 }
}

//Main class
public class Task5 {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     System.out.println("Select Payment Method:");
     System.out.println("1. PayPal");
     System.out.println("2. RazorPay");
     System.out.print("Enter choice: ");
     int choice = sc.nextInt();

     System.out.print("Enter amount to pay: ₹");
     double amount = sc.nextDouble();

     // Runtime dispatch
     Payment paymentMethod;
     if (choice == 1) {
         paymentMethod = new PayPal();
     } else if (choice == 2) {
         paymentMethod = new RazorPay();
     } else {
         System.out.println("Invalid choice. Exiting...");
         sc.close();
         return;
     }

     paymentMethod.pay(amount);

     sc.close();
 }
}