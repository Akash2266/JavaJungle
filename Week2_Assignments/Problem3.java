  import java.text.AttributedCharacterIterator;
  import java.util.Scanner;

    class Book {
        String tile, author;
        int price;

           Book (){
               Scanner scanner = new Scanner(System.in);

               System.out.print("Title of the Book: ");
               tile = scanner.next();

               System.out.print("Author of the Book: ");
               author = scanner.next();

               System.out.print("Price: ");
               price = scanner.nextInt();
           }

             Book (String title, String author, int price){
                 System.out.println();

                 this.tile = title;
                 this.author = author;
                 this.price = price;
           }

                void printBookDetails (){
                    System.out.println();

                    System.out.println("BOOK DETAILS: ");
                    System.out.println("=======================");
                    System.out.println("Title: "+tile);
                    System.out.println("Author: "+author);
                    System.out.println("Price: "+price);
                }

    }

public class Problem3 {
    public static void main(String[] args) {
             Book book1 = new Book();
             book1.printBookDetails();

             Book book2 = new Book("Chamber_of_Secrets", "ROWLING",2999);
             book2.printBookDetails();
    }
}
