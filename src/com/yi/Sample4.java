package com.yi;

import java.util.Scanner;

public class Sample4 {
    public static void main(String[] args) {
        //是否為0~10
        System.out.println("請輸入一個數字");
        Scanner s= new Scanner(System.in);
        int a=0;
        a=s.nextInt();

        if (a>=0&&a<=10) {
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}
