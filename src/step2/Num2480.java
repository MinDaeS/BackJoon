package step2;

import java.util.Scanner;

public class Num2480 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int arrDi[] = new int[3];

        for(int i=0;i<arrDi.length;i++){
            arrDi[i] = scan.nextInt();
        }

        int duplCnt = 0;
        int duplIdx = -1;
        int cash;

        for(int i=0;i<arrDi.length;i++){

            for(int j=i+1;j<=arrDi.length-j+1;j++){

                if(arrDi[i] >= arrDi[j]){
                    int tmp = arrDi[i];
                    arrDi[i] = arrDi[j];
                    arrDi[j] = tmp;

                    if(arrDi[i] == arrDi[j]){
                        duplCnt++;
                        duplIdx=i;
                    }
                }

            }
        }

        if(duplCnt == arrDi.length){
            cash = 10000 + arrDi[duplIdx]*1000;
        }else if(duplCnt > 0){
            cash = 1000 + arrDi[duplIdx]*100;
        }else{
            cash = arrDi[2]*100;
        }

        System.out.println(cash);
    }

}
