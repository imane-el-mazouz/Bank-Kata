package org.bank.model;

import java.time.LocalDate;

public class Transaction {
    private final int amount;
    private final String type;
    private final LocalDate date;

    public Transaction(int amount, String type) {
        this.amount = amount;
        this.type = type;
        this.date = LocalDate.now();
    }

    public int getAmount() {
        return amount;
    }

    public String getType() {
        return type;
    }

    public LocalDate getDate() {
        return date;
    }
}
