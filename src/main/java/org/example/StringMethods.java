package org.example;

import io.cucumber.java.be.I;

public class StringMethods {
    public static void main(String[] args) {
//        String str = "Sulaiman";
//        StringBuilder reversed = new StringBuilder();
//
//        int lastIndex = str.length();
//        while (lastIndex > 0) {
//            char lastChar = str.charAt(lastIndex - 1); // Get the last character
//            reversed.append(lastChar); // Add it to the reversed string
//            lastIndex--; // Move to the next character from the end
//        }
//
//        System.out.println("Original String: " + str);
//        System.out.println("Reversed String: " + reversed.toString());
//    }

//    public void stringbuffer(){
//        StringBuffer stringBuffer1 = new StringBuffer("dfasdf");
//
        reverseString();
    }

    private static void reverseString() {
        StringBuffer str = new StringBuffer("Welcome to gspann");
        System.out.println(str.reverse());

        String string = new String("welcome to java world");
        StringBuilder reversed = new StringBuilder();

        int lastName = string.length();
        for (int i=0;i<lastName;i++){
           char lastChar =  string.charAt(lastName-1);
           reversed.append(lastChar);
           lastName--;
        }
        System.out.println(reversed);
    }

    ///
//    public static void modifyObject(StringBuilder str) { // str is a COPY of the reference
//        str.append(" World"); // Modifies the object in the heap. Both references see the change.
//        str = new StringBuilder("New String"); // Creates a NEW StringBuilder object. str now points to this new object. The original reference in main() is unaffected.
//        System.out.println("from modify object method:"+str);
//
//
//    }
//
//    public static void main(String[] args) {
//        StringBuilder myStr = new StringBuilder("Hello"); // myStr holds the original reference
//        modifyObject(myStr); // A COPY of myStr is passed to modifyObject
//        System.out.println(myStr); // myStr still points to the original object, which was modified.
//    }



}

