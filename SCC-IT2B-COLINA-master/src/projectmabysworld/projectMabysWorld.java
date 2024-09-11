package projectmabysworld;

import java.util.Scanner;

public class projectMabysWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Salary sl = new Salary();
        Account ac = new Account();
        Receipt rc = new Receipt();
        AgeCalculatorColina acl = new AgeCalculatorColina();
        GradeExperiment ge = new GradeExperiment();
        String transaction;
        
        
        
        do{
                           
                            
                             System.out.println("1. Salary");
                             System.out.println("2. Account");  
                             System.out.println("3. Reciept");
                             System.out.println("4. AgeCalculator");
                             System.out.println("5. Grades");
                             System.out.println("Enter selection: ");
            int select = sc.nextInt();

            switch(select){
                case 1:
                    sr.getalary();
                    break;
                case 2: 
                    ac.getAccounts();
                break;
                case 3:
                    rc.getReceipt();
                    break;
                case 4: 
                    acl.getAge();
                    break;
                case 5:
                    ge.getGrades();
                    break;
                    
                default: System.out.println("Invalid choice.");
            }
            System.out.print("Make another transaction? (y/n): ");
            transaction = sc.next();
        } while(transaction.contains("y"));
        
    }
}