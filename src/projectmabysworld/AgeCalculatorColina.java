
package projectmabysworld;

import java.util.Scanner;


public class AgeCalculatorColina {
    
public void getAge(){
Scanner input = new Scanner(System.in);

    String fname; 
    int byear;

    System.out.print("Enter your name:");
    fname = input.nextLine();
    System.out.println("Enter Birth Year:");
    byear = input.nextInt();

    System.out.println("Hello " +fname+" Your Age is "+(2024-byear));

    }
}
