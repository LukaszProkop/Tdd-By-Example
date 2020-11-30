package com.tdd.by.example;

public class Bank {
    public Money reduce(Expression source, String toCurrency) {
        return source.reduce(toCurrency);

//        if (source instanceof Money) return (Money) source;
//        Sum sum = (Sum) source;
//        return sum.reduce(toCurrency);
    }
}
