package com.company.multithreading_task;

public class PrinterThread extends Thread {

    private String letter;
    private int internal;
    private int amount;


    public PrinterThread(String letter, int internal, int amount){
        this.letter = letter;
        this.internal = internal;
        this.amount = amount;
    }

    public void run(){
        for (int i = 1; i <= amount; i++) {
            System.out.println(letter);
            try {
                Thread.sleep(internal);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
