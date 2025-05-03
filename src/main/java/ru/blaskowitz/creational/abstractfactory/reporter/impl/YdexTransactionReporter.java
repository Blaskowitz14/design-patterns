package ru.blaskowitz.creational.abstractfactory.reporter.impl;

import ru.blaskowitz.creational.abstractfactory.reporter.TransactionReporter;

public class YdexTransactionReporter implements TransactionReporter {

    @Override
    public void generateReport() {
        System.out.println("generating Ydex transaction report...");
    }
}
