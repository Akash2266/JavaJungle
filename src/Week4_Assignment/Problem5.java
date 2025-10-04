package Week4_Assignment;

  class Book {
         String title, author;
         int price;

            Book (String author, String title, int price){
                  this.author = author;
                  this.title = title;
                  this.price = price;
            }
  }

     class Magazine extends Book {
          int pages;
              Magazine (int pages, String author, String title, int price){
                     super(author, title, price);
                     this.pages = pages;
              }

                 void getMagazine (){
                     System.out.println("Magazine Details: ");
                     System.out.println("------------------------");
                     System.out.println("Title: "+title);
                     System.out.println("Author: "+author);
                     System.out.println("Price: "+price);
                     System.out.println("Pages: "+pages);
                     System.out.println();
                 }
     }

       class TextBook extends Book{
             String publishedDate;

             TextBook(String publishedDate, String author, String title, int price){
                    super(author, title, price);
                    this.publishedDate = publishedDate;
             }

               void getTexBook(){

                   System.out.println("TextBook Details: ");
                   System.out.println("------------------------");
                   System.out.println("Title: "+title);
                   System.out.println("Author: "+author);
                   System.out.println("Price: "+price);
                   System.out.println("Published Date: "+publishedDate);
               }

       }


public class Problem5 {
    public static void main(String[] args) {
             Magazine magazine = new Magazine(99, "Alex_Holland", "Midnight_Breakfast", 199);
             TextBook textBook = new TextBook("12/12/2006", "Dennis_Ritchie", "C", 565);
             magazine.getMagazine();
             textBook.getTexBook();
    }
}

