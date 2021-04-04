package Homework;

import java.util.Scanner;

public class Kirpich {
    public static void main(String[] args) {
        Scanner q = new Scanner(System.in);
        float a = q.nextFloat();
        float b = q.nextFloat();
        float c = q.nextFloat();
        float x = q.nextFloat();
        float y = q.nextFloat();
        if (a < x && b < y || a < y && b < x)
            System.out.println("Входить");
        else {
            System.out.println("Не входить");
        }
    }
}
