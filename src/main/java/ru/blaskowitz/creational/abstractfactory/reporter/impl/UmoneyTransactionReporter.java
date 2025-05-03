package ru.blaskowitz.creational.abstractfactory.reporter.impl;

import ru.blaskowitz.creational.abstractfactory.reporter.TransactionReporter;

public class UmoneyTransactionReporter implements TransactionReporter {

    @Override
    public void generateReport() {
        System.out.println("generating Umoney transaction report...");
    }
}
