package step6;

import java.io.*;

/**
 * 단어 공부
 */
public class Num1157 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String text = br.readLine();

        char arrText [] = text.toCharArray();
        int arrAlphabetCnt [] = new int[26];

        for(char thisText : arrText){

            int index = thisText > 96 ? thisText-97:thisText-65;

            for(int i=0; i<arrAlphabetCnt.length; i++){
                if(index == i) arrAlphabetCnt[i] += 1;
            }
        }

        int max = arrAlphabetCnt[0];
        int maxIdx = 0;

        for(int i=0; i<arrAlphabetCnt.length; i++){

            if(arrAlphabetCnt[i] > max){
                max = arrAlphabetCnt[i];
                maxIdx = i;
            }else if(arrAlphabetCnt[i] == max && i != 0){
                maxIdx = -1;
            }
        }

        char result = maxIdx == -1 ? '?' : (char) (maxIdx+65);

        System.out.println(result);
    }
}
