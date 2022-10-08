package com.yi;

import java.util.Scanner;

//用子句計算兩者差為10以內或以上
public class Sample7 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("請輸入兩個數");
        int num1;
        int num2;
        num1=scanner.nextInt();
        num2= scanner.nextInt();
        String ans=(num1-num2<=10 && num1-num2>=-10)?"兩者之差為10":"兩者之差為11以上";
        System.out.println(ans);
    }
}
