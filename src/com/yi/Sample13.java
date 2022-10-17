package com.yi;

public class Sample13 {
    public static void main(String[] args) {
        int i=0;
        int j=0;
        for (i=1;i<=9;i++){
            for (j=1;j<=9;j++){
                System.out.print(i+"x"+j+"\t");
                if (j==9){
                    System.out.println(" ");
                }
            }
        }
    }
}
