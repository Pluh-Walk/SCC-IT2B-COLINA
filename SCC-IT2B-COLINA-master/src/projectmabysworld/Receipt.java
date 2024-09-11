
package projectmabysworld;

import java.util.Scanner;


 public class Receipt {

   
         public void getReceipt(){
    Scanner input = new Scanner(System.in);
                
        String cname, product; 
        int cash, quan, price, total;
        
        
              
        System.out.print("Enter your name:");
        cname = input.nextLine();
        
        System.out.print("Product Name:");
        product = input.nextLine();
        
        System.out.print("Quantity:");
        quan = input.nextInt();
        
        System.out.print("Price:");
        price = input.nextInt();
        
        System.out.print("Enter Cash Amount:");
        cash = input.nextInt();
        
        System.out.println("\n----------------------");
        System.out.print("\nRECEIPT");
        
        System.out.println("\n----------------------");
        
        System.out.println("Customer Name:" +cname+"\nItem: "+product+"\nQuantity: "+quan);
        
        System.out.println("\n ----------------------");
        
        System.out.println("Total Due: "+(quan*price)+"\nCash: "+cash);
        
        System.out.println("\n ----------------------");
        
        System.out.println("Change: " +(cash-(quan*price)));
        
         }
}
