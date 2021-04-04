package Homework;

import java.util.Scanner;

public class Task88 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int n = x.nextInt();
        System.out.println("Number = " + n);
        System.out.println("Завдання 1");
        String num = Integer.toString(n*n);
        if(num.indexOf("3")>-1)
            System.out.println("Трійка входить " + num);
        else System.out.println("Трійка не входить " + num);
        System.out.println("Zavd 2");
        String num1 = Integer.toString(n);
        StringBuilder sb=new StringBuilder(num1);
        System.out.println(sb.reverse());
        System.out.println("Zavd 3");
        char temp = num1.charAt(0);
        char end = num1.charAt(num1.length()-1);
        System.out.println(end+num1.substring(1, num1.length()-1)+temp);
        System.out.println("zavd 4");
        System.out.println("1"+num1+"1");
    }

}
