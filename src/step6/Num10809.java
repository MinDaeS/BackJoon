package step6;

import java.io.*;
import java.util.Arrays;

/**
 * 	알파벳 찾기
 */
public class Num10809 {

    public static void main(String[] args) throws IOException {

        int arrNum [] = new int[26];
        Arrays.fill(arrNum, -1);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String text = br.readLine();

        for(int i=0; i<text.length(); i++){
            int index = text.charAt(i)-97;

            if(arrNum[index] == -1){
                arrNum[index] = i;
            }
        }

        for(int number: arrNum){
            System.out.print(number + " ");
        }
    }
}
