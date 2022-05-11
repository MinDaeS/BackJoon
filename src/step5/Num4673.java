package step5;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Num4673 {

    static int createConstructorTry1(int number){

        int result = number;

        result += number/1000;
        result += (number%1000)/100;
        result += (number%100)/10;
        result += number%10;

        return result;
    }

    static int createConstructor(int number){

        int result = number;

        while (number !=0) {
            result += number%10;
            number /= 10;
        }

        return result;
    }

    public static void main(String[] args) throws IOException {

        int arrConstruct [] = new int[10000];
        int arrSelfNumber [] = new int[10000];

        for(int i=0; i<arrConstruct.length; i++){
            arrConstruct[i] = createConstructor(i+1);
            arrSelfNumber[i] = i+1;
        }

        for(int i=0; i<arrSelfNumber.length; i++){

            for(int j=0; j<arrConstruct.length; j++){

                if(arrSelfNumber[i] == arrConstruct[j]){
                    arrSelfNumber[i] = 0;
                }
            }
        }

        StringBuilder sb = new StringBuilder();

        for(int selfNumber: arrSelfNumber) {
            if (selfNumber != 0) {
                sb.append(selfNumber).append("\n");
            }
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
