package org.bank.model;

import org.bank.model.Transaction;

import java.util.List;

public class StatementPrinter {
    public void print(List<Transaction> transactions) {
        System.out.println("DATE | AMOUNT | BALANCE");
        int balance = 0;
        for (Transaction transaction : transactions) {
            balance += transaction.getAmount();
            System.out.println(transaction.getDate() + " | " + transaction.getAmount() + " | " + balance);
        }
    }
}
