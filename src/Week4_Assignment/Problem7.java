package Week4_Assignment;

  interface Payment {
        abstract void play();
        abstract void pause();
  }

     class CreditPayment implements Payment{
          @Override
          public void pause(){
              System.out.println("Pausing the Credit payment");
          }
           @Override
             public void play(){
               System.out.println("Invoking the Credit Payment");
           }
     }
        class UPIPayment implements Payment{
            @Override
            public void pause(){
                System.out.println("Pausing the UPI payment");
            }
            @Override
            public void play(){
                System.out.println("Invoking the UPI Payment");
            }
        }

public class Problem7 {
    public static void main(String[] args) {
           Payment payment = new CreditPayment();
           payment.pause();
           payment.play();

           System.out.println();

           payment = new UPIPayment();
           payment.play();
           payment.pause();
    }
  }
