package org.example;

public class ParallelBrowserStack {

    public static void main(String[] args) {
        BrowserStack firefox = new BrowserStack("firefox");
        BrowserStack edge = new BrowserStack("edge");


        Thread edgeThread = new Thread(edge);
        Thread firefoxThread = new Thread(firefox);

        edgeThread.start();
        firefoxThread.start();
    }



}
