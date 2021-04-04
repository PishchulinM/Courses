package Homework;

import java.util.Scanner;

public class Task {
    public static void main (String[] args){
        Scanner s = new Scanner(System.in);
        float x = s.nextFloat();
        System.out.println("first number " + x);
        float y = s.nextFloat();
        System.out.println("second number " + y);
        float z = s.nextFloat();
        System.out.println("third number " + z);
        if ( x<=5 && x>=-5 && y<=5 && y>=-5 && z<=5 && z>=-5  )
        {
            System.out.println(" Numbers belong to range [-5; 5] ");
        }
        else{
            System.out.println("Numbers don't belong to range [-5; 5] ");
        }
    }
}

