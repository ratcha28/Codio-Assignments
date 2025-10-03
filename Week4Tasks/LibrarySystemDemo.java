package Week4Tasks;
class Book {
    String title;
    String author;
    double price;

    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}

class TextBook extends Book {
    String subject;

    TextBook(String title, String author, double price, String subject) {
        super(title, author, price);
        this.subject = subject;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Subject: " + subject);
    }
}

class Magazine extends Book {
    int issueNumber;

    Magazine(String title, String author, double price, int issueNumber) {
        super(title, author, price);
        this.issueNumber = issueNumber;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Issue Number: " + issueNumber);
    }
}

public class LibrarySystemDemo {
    public static void main(String[] args) {
        TextBook tb = new TextBook("Java Basics", "James Gosling", 500, "Computer Science");
        Magazine mg = new Magazine("Tech Today", "John Doe", 150, 42);

        System.out.println("=== Text Book Details ===");
        tb.displayDetails();

        System.out.println("\n=== Magazine Details ===");
        mg.displayDetails();
    }
}



