package com.company.multithreading_task;

public class Main {
    public static void main(String[] args) {


        PrinterThread printerThread = new PrinterThread("A", 1, 1000);
        PrinterThread printerThread1 = new PrinterThread("B", 1, 1000);
        PrinterThread printerThread2 = new PrinterThread("C", 1, 1);
        PrinterThread printerThread3 = new PrinterThread("D", 5, 50);

        printerThread.start();
        printerThread1.start();
        printerThread2.start();

        if (!printerThread.isAlive() || !printerThread1.isAlive() || !printerThread2.isAlive()) {
            printerThread3.start();
        }
    }
}
