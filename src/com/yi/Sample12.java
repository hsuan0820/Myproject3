package com.yi;

public class Sample12 {
    public static void main(String[] args) {
        char Big='A', Small='a';

        for(int i=0;i<26;i++){
            System.out.println("大寫為："+Big+" 小寫為"+Small);
            Big++;
            Small++;
        }
    }

}
