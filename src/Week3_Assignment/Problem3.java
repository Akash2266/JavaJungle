package Week3_Assignment;

class Book {
    String title, author;
    double price;

       Book (){
           this.author = "JK_Rowling";
           this.title = "Harry Potter";
           this.price = 2999.09;
       }

       Book (String title, String author, double price){
             this.author = author;
             this.title = title;
             this.price = price;
       }

       void BookDetails (){
           System.out.println("Book Details: ");
           System.out.println("===================");
           System.out.println("Title: "+title);
           System.out.println("Author: "+author);
           System.out.println("Price: "+price);
           System.out.println();
       }



}


public class Problem3 {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.BookDetails();

        Book book2 = new Book("Diary_of_a_Wimpy_Kid", "Jeff Kinney", 3499.09);
        book2.BookDetails();
    }
}
