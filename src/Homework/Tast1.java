package Homework;

import java.util.Scanner;

public class Tast1 {
    public static void main (String[] args){
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        System.out.println("first number " + x);
        int y = s.nextInt();
        System.out.println("second number " + y);
        int z = s.nextInt();
        System.out.println("third number " + z);

        System.out.println("Max number = " + Math.max(Math.max(x, y), z));
        System.out.println("Min number = " + Math.min(Math.min(x, y), z));
    }
}
