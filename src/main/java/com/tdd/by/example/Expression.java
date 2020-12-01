package com.tdd.by.example;

public interface Expression {
    Expression times(int multiplier);

    Expression plus(Expression added);

    Money reduce(Bank bank, String to);
}
