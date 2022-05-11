package step5;

import java.util.Scanner;

public class Num1065 {

    static boolean arithmeticSeq(int number){

        boolean isArith;

        int a = (number%10000)/1000;
        int b = (number%1000)/100;
        int c = (number%100)/10;
        int d = number%10;

        if(a>0){
            isArith = a-b == b-c && b-c == c-d ? true:false;
        }else if(b>0){
            isArith = b-c == c-d ? true:false;
        }else{
            isArith = true;
        }

        return isArith;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int hanSu = 0;

        for(int i=1;i<=number;i++){
           boolean isArith =  arithmeticSeq(i);

           if(isArith) hanSu++;
        }

        System.out.println(hanSu);
    }
}
