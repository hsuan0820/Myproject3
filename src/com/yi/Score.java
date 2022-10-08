package com.yi;

import java.util.Scanner;

public class Score {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        float average;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your score");

        a=scanner.nextInt();
        b=scanner.nextInt();
        c=scanner.nextInt();

        average=(a+b+c)/3;

        System.out.println("student’s score "+a+"\t"+b+"\t"+ c+"\t");
        System.out.println("average is "+average);

    }
}
