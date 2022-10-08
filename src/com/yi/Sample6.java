package com.yi;

import java.util.Scanner;

//判斷個位數、十位數、百位數
public class Sample6 {
    public static void main(String[] args) {
        System.out.println("請輸入數字");
        Scanner scanner= new Scanner(System.in);

        int a=0;
        a= scanner.nextInt();

        if (a<10&&a>=0||a>-10&&a<0){
            System.out.println("個位數");
        }else if (a<100&&a>=10||a>-100 && a<=-10){
            System.out.println("十位數");
        }else if (a<1000&&a>=100|| a>-1000&&a<=-100){
            System.out.println("百位數");
        }else{
            System.out.println("無法判斷");
        }
    }
}
