package com.yi;

public class Sample11 {
    public static void main(String[] args) {
        int i=0;
        int sum=0;
        for (i=1;i<100;i++){
            if (i%2==1){
                sum=i+sum;
            }
        }
        System.out.println(sum);
    }
}
