package step6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 문자열 반복
 */
public class Num2675 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testCaseCnt = Integer.parseInt(br.readLine());
        String returnStr = "";

        for (int i=0; i<testCaseCnt; i++){

            String text = br.readLine();
            char cnt = text.charAt(0);  // 첫번째 숫자

            for(int j=2; j<text.length(); j++){

                for(int k=0; k<cnt-'0'; k++){   // -'0' : char to int
                    returnStr += text.charAt(j);
                }
            }

            returnStr = i == testCaseCnt-1? returnStr: returnStr + "\n";
        }

        System.out.println(returnStr);
    }
}