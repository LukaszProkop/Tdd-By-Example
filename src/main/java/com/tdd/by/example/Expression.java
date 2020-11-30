package com.tdd.by.example;

public interface Expression {
    Expression plus(Expression added);

    Money reduce(Bank bank, String to);
}
