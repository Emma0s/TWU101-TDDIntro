package com.thoughtworks.tddintro.exercises.accountbalance;

public class Account {
    public int amount = 100;
    public int deposit(int depNum) {
        return amount += depNum;
    };
}
