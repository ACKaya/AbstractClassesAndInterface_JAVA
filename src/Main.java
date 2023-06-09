import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
   Scanner scan=new Scanner(System.in);
   System.out.print("Enter Your Card Number:");
   int cardNumber= scan.nextInt();
   System.out.print("Enter Your Card Expire Date:");
   int expdate= scan.nextInt();
   System.out.print("Enter Your CVC:");
   int cvc= scan.nextInt();

   System.out.println("Choose a Bank");
   System.out.println("1- ABank" +
           "2- BBank");
   int result = scan.nextInt();

   switch (result){
       case 1:
           ABANK a=new ABANK("ABANK","123","456");
           a.connect();
           a.sendCardInfo("100");
           break;
       case 2:
           BBANK b=new BBANK("BBANK","456","789");
           b.connect();
           b.sendCardInfo("200");
           break;
       default:
           System.out.println("ENTER A VALID NUMBER");

   }



    }
}
