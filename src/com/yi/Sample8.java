package com.yi;

public class Sample8 {
    public static void main(String[] args) {
        for (int i=1;i<=10;i++) {
            if (i % 2 == 0) {
                System.out.println("偶數為" + i);
            }
        }
        for (int i=1;i<=10;i++) {
            if (i % 2 != 0)
                System.out.println(i);

        }
    }
}
