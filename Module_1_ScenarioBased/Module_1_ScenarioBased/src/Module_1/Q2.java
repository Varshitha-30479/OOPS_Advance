/*Q2: An online bookstore wants to protect book details from unauthorized access 
 * while allowing controlled updates.
 * Design a Book class with title, author, and price as private fields.
 * Provide getter/setter methods with proper validation (e.g., price must be positive).
 * Use an initialization block to print a welcome message when any book object is created.
*/
package Module_1;

public class Q2 {

    static class Book {
     
        private String title;
        private String author;
        private double price;

        {
            System.out.println("📚 Welcome to the Online Bookstore! A new book record is being created...");
        }

        public Book(String title, String author, double price) {
            this.title = title;
            this.author = author;
            setPrice(price);
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            if (price > 0) {
                this.price = price;
            } else {
                System.out.println("❌ Price must be positive. Setting price to default (100).");
                this.price = 100; 
            }
        }

        public void displayDetails() {
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("Price: ₹" + price);
            System.out.println("------------------------------");
        }
    }

    public static void main(String[] args) {
 
        Book b1 = new Book("Java Programming", "James Gosling", 550);
        b1.displayDetails();

        Book b2 = new Book("Clean Code", "Robert C. Martin", -200);
        b2.displayDetails();

        b2.setPrice(750);
        b2.displayDetails();
    }
}