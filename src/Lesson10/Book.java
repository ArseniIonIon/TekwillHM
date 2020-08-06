package Lesson10;

public class Book {
    String title;
    int yearOfPublishing;
    boolean isAvailable;


    public static void main(String[] args) {
        Book book = new Book();
        book.title = "Harry Potter";
        book.isAvailable = true;
        book.yearOfPublishing = 2001;

        System.out.println("Title of Book is : "+book.title  + "\n Is available : " + book.isAvailable + "\n Year of Publishing : " + book.yearOfPublishing);
    }
}
