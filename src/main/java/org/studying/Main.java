package org.studying;

import org.studying.entity.CheckingAccount;
import org.studying.entity.SavingsAccount;

public class Main {
    public static void main(String[] args) {
        CheckingAccount account1 = new CheckingAccount(123, 0.0);
        SavingsAccount account2 = new SavingsAccount(123, 0.0);
        CheckingAccount account3 = new CheckingAccount(456, 0.0);
        SavingsAccount account4 = new SavingsAccount(456, 0.0);


        System.out.println("##### TESTING deposit & withdraw METHODS #####\n");
        account1.deposit(-1000);
        account1.deposit(1000);
        account1.withdraw(2000);
        account1.withdraw(-200);
        account1.withdraw(200);
        System.out.println(account1);
        System.out.println(account2);
        System.out.println(account4);
        System.out.println(account3);

        System.out.println("##### TESTING save & retrieve METHODS #####\n");
        account1.save(account4, 500);
        account1.save(account2, -500);
        account1.save(account2, 5000);
        account1.save(account2, 500);
        account1.retrieve(account4, 500);
        account1.retrieve(account2, -500);
        account1.retrieve(account2, 5000);
        account1.retrieve(account2, 50);
        System.out.println(account1);
        System.out.println(account2);
        System.out.println(account4);
        System.out.println(account3);

        System.out.println("##### TESTING transfer METHOD #####\n");
        account1.transfer(account3, -50);
        account1.transfer(account3, 5000);
        account1.transfer(account3, 50);
        System.out.println(account1);
        System.out.println(account2);
        System.out.println(account4);
        System.out.println(account3);
    }
}
