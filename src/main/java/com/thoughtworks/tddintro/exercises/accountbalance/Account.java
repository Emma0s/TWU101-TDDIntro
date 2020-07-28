package com.thoughtworks.tddintro.exercises.accountbalance;

public class Account {
    protected int amount;
    public Account(int amount){
        this.amount = amount;
    }

    public int deposit(int depNum) {
        return this.amount += depNum;
    };

    public int withdraw(int witNum) {
        if (amount-witNum < 0){
            return amount;
        }
        return amount -= witNum;
    }
}
