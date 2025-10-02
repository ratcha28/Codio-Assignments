package Week3Tasks;
class Book{
    String title;
    String author;
    double price;
    Book(){
        title="Harry potter";
        author="J.K.Rowling";
        price=399.99;
    }
    Book(String t,String a,double p){
        title=t;
        author=a;
        price=p;
    }
    void DisplayBookDetails(){
        System.out.println("Title:"+ title);
        System.out.println("Author:"+ author);
        System.out.println("Price:"+ price);
        System.out.println("-----------------------------");
    }
}

public class BookAndAuthor {
    public static void main(String[] args) {
        Book b1=new Book();
        Book b2=new Book("Rich Dad Poor Dad","Robert T.Kiyosaki",350.00);
        Book b3=new Book("Little Women","Lousia May Alcott",300.00);
        b1.DisplayBookDetails();
        b2.DisplayBookDetails();
        b3.DisplayBookDetails();
    }
}
