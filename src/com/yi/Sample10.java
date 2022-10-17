package com.yi;


import java.util.Scanner;

public class Sample10 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int i=0;
        int sum=0;

        do {
            System.out.println("請輸入成績");
            i= scanner.nextInt();
            sum+=i;
        }
        while(i>0);
        System.out.println("總和為"+sum);


    }
}
