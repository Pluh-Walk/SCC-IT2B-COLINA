
package receipt;

import java.util.Scanner;

public class Receipt {

    public void getReceipt() {
        
        Scanner sc = new Scanner(System.in);
        
        String fname, pname; 
        int quan, price, cash, totald, change;
        
        
        System.out.println("Customer Name: ");
        fname = sc.nextLine();
        
        System.out.println("Product Name: ");
        pname = sc.nextLine();
        
        System.out.println("Quantity: ");
        quan = sc.nextInt();
        
        System.out.println("Price: ");
        price = sc.nextInt();
        
        System.out.println("Cash: ");
        cash = sc.nextInt();
        
        System.out.println("-------------------");
        System.out.println("Receipt");
        System.out.println("--------------------");
        System.out.println("Name: "+fname);        
        System.out.println("Item: "+pname);
        System.out.println("Quantity"+quan);
        System.out.println("--------------------");
        System.out.println("Total due: "+(price*quan));
        totald = sc.nextInt();
        
        System.out.println("Cash: "+cash);
        System.out.println("----------------------");
        System.out.println("Change: "+cash); 
        change = cash - totald;
        System.out.println("-----------------------");
        
        
        
    }
    
}
