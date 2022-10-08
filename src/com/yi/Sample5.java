package com.yi;

import java.util.Scanner;
//switch case practice
public class Sample5 {
    public static void main(String[] args) {

        System.out.println("請輸入數字");
        Scanner scanner=new Scanner(System.in);
        int a=0;
        a= scanner.nextInt();

        switch (a){
            case 1:
                System.out.println("請拼命加油吧");
                break;

            case 2:
                System.out.println("請再加油一點");
                break;

            case 3:
                System.out.println("您還可以做得更好");
                break;
            case 4:
                System.out.println("幹得好");
                break;

            case 5:
                System.out.println("您真是太優秀了");
                break;
        }

    }
}
