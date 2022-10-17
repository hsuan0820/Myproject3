package com.yi;

import java.util.Scanner;

public class Sample9 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("請輸入一個數字");
        int i=0;//*輸入的數字
        int j=0;
        i= scanner.nextInt();
        for (j=1;j<=i;j++){
            System.out.print("*");
            if (j%5==0){
                System.out.println(" ");
            }
        }
    }
}
