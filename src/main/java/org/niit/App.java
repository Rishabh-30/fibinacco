package org.niit;

import java.util.List;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter a number");
        int num = sc.nextInt();
        Fibinaco fibinaco = new Fibinaco();
        List<Integer> result = fibinaco.fibinacci(num);
        for (int i : result
             ) {
            System.out.print(" " +i);

        }

    }
}