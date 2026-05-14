package com.pluralsight.finance;

import com.pluralsight.finance.BankAccount;
import com.pluralsight.finance.CreditCard;
import com.pluralsight.finance.Gold;
import com.pluralsight.finance.Valuable;

public class FinanceApplication {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Pam", "123", 12500);
        Valuable account2 = new BankAccount("Gary", "456", 1500);

        // try to deposit money into both accounts
        account1.deposit(100);
        ((BankAccount) account2).deposit(200);

        Portfolio portfolio = new Portfolio("Potato", "Steer");

        portfolio.add(account1);
        portfolio.add(account2);

        System.out.println(portfolio.getMostValuable());
        System.out.println(portfolio.getLeastValuable());



    }
}