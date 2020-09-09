package exbankexception;

import entities.Account;
import exceptions.DomainException;
import java.util.Locale;
import java.util.Scanner;

public class ExBankException {
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account data");
        System.out.print("Number: ");
        int number = sc.nextInt();        
        System.out.print("Holder:");
        sc.next();
        String holder = sc.nextLine();        
        System.out.print("Initial balance: ");
        double balance = sc.nextDouble();
        System.out.print("Withdraw limit: ");
        double withdrawLimit = sc.nextDouble();
        System.out.println("");

        Account acc = new Account(number, holder, balance, withdrawLimit);

        try {
        System.out.print("Enter Amount for withdraw: ");        
        double amount = sc.nextDouble();
        acc.withdraw(amount);        
        System.out.println("New balance:" + acc.getBalance());
        }        
        catch (DomainException e){        
            
            System.out.println("Withdraw error: " + e.getMessage());
            
        }       
        

        sc.close();

    }

}
