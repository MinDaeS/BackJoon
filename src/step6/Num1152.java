package step6;

import java.io.*;
import java.util.StringTokenizer;

/**
 * 	단어의 개수
 */
public class Num1152 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ", true);

        int index = 0;

        while (st.hasMoreTokens()){
            if(!st.nextToken().equals(" ")) index++;
        }

        System.out.println(index);
    }
}
