package com.yi;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {

        System.out.println("輸入身高及體重");
        Scanner scanner=new Scanner(System.in);

        float height;
        float weight;
        float bmi;
        height= scanner.nextInt();
        weight=scanner.nextInt();
        bmi=(weight/(height*height)/10000);
        System.out.println("身高是"+height+"cm");
        System.out.println("體重是"+weight+"kg");
        System.out.println("BMI為"+bmi);

    }
}
