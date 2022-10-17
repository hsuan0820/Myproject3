import java.util.Random;
import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int minNum = 0;
        int maxNum = 100;
        Random r = new Random();
        int answerNum = r.nextInt(maxNum-minNum)+minNum;
        //System.out.println(answerNum);

        //重複進行迴圈直到答案正確
        while(true){
            System.out.println("請猜一個數字(介於"+minNum+"到"+maxNum+")");
                int guessNum = s.nextInt();
            if (guessNum == answerNum){
                System.out.println("你猜到了！答案是"+answerNum);
              break; //若猜到正確答案程式便可終止
            }
            else if (guessNum < answerNum && guessNum>=0) {
                minNum = guessNum+1; //guessNum如果小於answerNum，並且要>=0，便可縮減範圍
            }
            else if (guessNum> answerNum && guessNum<=100){
                maxNum = guessNum-1;//guessNum如果大於answerNum，並且要<=100，便可縮減範圍
            }
            else { //避免輸入複數或大於100的數字
                System.out.println("請輸入正確範圍內的數字");
            }
        }

    }
}
