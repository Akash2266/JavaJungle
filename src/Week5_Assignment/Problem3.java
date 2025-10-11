package Week5_Assignment;

import java.util.Scanner;

class Library{

       void addBook(){

           String title, author;
           int price;
           Scanner scanner = new Scanner(System.in);

           System.out.println();

           System.out.print("Enter book's title: ");
           title = scanner.nextLine();

           System.out.print("Enter book's author: ");
           author = scanner.nextLine();

           System.out.print("Enter book's price: ");
           price = scanner.nextInt();

           Book book = new Book(title, author, price);
           book.displayBookDetails();

       }

      class Book{
      String title, author;
      int price;

         Book (String title, String author, int price){
              this.price = price;
              this.author = author;
              this.title = title;
         }

      void displayBookDetails(){
          System.out.println();
          System.out.println("Book Details: ");
          System.out.println("----------------------");
          System.out.println("Title: "+title);
          System.out.println("Author: "+author);
          System.out.println("Price: "+price);
      }

     }
 }

public class Problem3 {
    public static void main(String[] args) {
              Library library = new Library();

                for (int i=0; i<3; i++)
                    library.addBook();
    }
}
