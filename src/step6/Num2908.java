package step6;

import java.io.*;

/**
 * 상수 - 문자열, 구현
 */
public class Num2908 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String text = br.readLine();
        String arrNum [] = text.split(" ");

        for(int i=0; i<arrNum.length; i++){

            char tmpNum [] = arrNum[i].toCharArray();
            char tmp = tmpNum[0];
            tmpNum[0] = tmpNum[2];
            tmpNum[2] = tmp;

            arrNum[i] = String.valueOf(tmpNum);
        }

        int max = Integer.parseInt(arrNum[0]);
        for(int i=0; i<arrNum.length; i++){
            if(Integer.parseInt(arrNum[i]) > max)
                max = Integer.parseInt(arrNum[i]);
        }
        System.out.println(max);
    }

}
