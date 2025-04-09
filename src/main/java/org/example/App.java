package org.example;

import io.cucumber.java.eo.Do;
import org.openqa.selenium.By;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
//        int[] a  = {1,2,3,4,4,6,7,8,5};
//        for (int i=0;i<a.length;i++){
//            System.out.println(a[i]);
//        }

//        for(int temp:a){
//            System.out.println(temp);
//        }

//        int[] b = new int[3];
//
//        for (int i=0;i<b.length;i++){
//            System.out.println(b[i]=i);
//        }
//
//        Dog[] dog = new Dog[3];
//        for (int i=0;i<dog.length;i++){
//            dog[i] = new Dog();
//            dog[i].bark();
//        }
//
//        String str = "Sulaiman";
//        System.out.println("HashCode of 'Sulaiman': " + System.identityHashCode(str));
//
//        String str1 = "Sulaiman";
//        System.out.println("HashCode of 'shaik': " + System.identityHashCode(str1));
//
//        String str2 = str; //"Sulaiman";
//        System.out.println("HashCode of 'Sulaiman': " + System.identityHashCode(str2));
//
//
//        System.out.println(str.equals(str1));
//        System.out.println(str.equals(str2));
//        System.out.println(str==str1);
//        System.out.println(str==str2);


//        Integer i = new Integer(9);
//        System.out.println(i);
//
//        int a = i;
        int no_of_rows= 5;

        for( int i=1;i<no_of_rows;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }


    }
}

class Dog{

    public void bark(){
        System.out.println("woof ! woof!");
    }
}



