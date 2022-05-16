package step7;

import java.io.*;

/**
 * 벌집 - 사칙연산, 기본 수학
 */
public class Num2292 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long number = Long.parseLong(br.readLine());

        long i=0;
        long rooms = 1;

        while (true){

            rooms += 6*i;
            i++;

            if(rooms >= number) break;
        }

        System.out.println(i);
    }
}