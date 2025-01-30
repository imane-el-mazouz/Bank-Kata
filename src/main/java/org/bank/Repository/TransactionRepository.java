package org.bank.Repository;

import org.bank.model.Transaction;

import java.util.ArrayList;
import java.util.List;

public class TransactionRepository {
    private final List<Transaction> transactions = new ArrayList<>();

    public void addDeposit(int amount) {
        transactions.add(new Transaction(amount, "DEPOSIT"));
    }

    public void addWithdrawal(int amount) {
        transactions.add(new Transaction(-amount, "WITHDRAWAL"));
    }

    public List<Transaction> allTransactions() {
        return transactions;
    }
}
