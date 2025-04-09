package org.sel.com;

public class ParallelBrowserTest {
    public static void main(String[] args) {
        // Create threads for different browsers
        Thread firefoxThread = new Thread(new BrowserTest("firefox"));
        Thread edgeThread = new Thread(new BrowserTest("edge"));

        // Start the threads
        firefoxThread.start();
        edgeThread.start();
    }
}
