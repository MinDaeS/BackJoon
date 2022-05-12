package step6;

import java.io.*;

/**
 * 다이얼 - 구현
 */
public class Num5622 {

    public static void main(String[] args) throws IOException {

        String alphabet [] = {null,null,null,"ABC","DEF","GHI","JKL","MNO","PQRS","TUV","WXYZ",null};
        int phoneNum [] = {-1,-1,1,2,3,4,5,6,7,8,9,0};   // num = 번호 / index = 초, 알파벳 매핑

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char inputStr [] = br.readLine().toCharArray();
        int timer = 0;

        for(char str : inputStr){
            for(int i=0; i<alphabet.length; i++){
                if(alphabet[i] != null && alphabet[i].contains(String.valueOf(str))){
                    timer += i;
                }
            }
        }

        System.out.println(timer);
    }
}