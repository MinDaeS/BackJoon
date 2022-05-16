package step7;

import java.io.*;
import java.util.Arrays;

/**
 * 손익분기점 - 사칙연산, 구현
 */
public class Num1712 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String [] inputStr = br.readLine().split(" ");
        long [] arrNum = Arrays.stream(inputStr).mapToLong(Long::parseLong).toArray();
        long brkEvtPoint = 1;

        if(arrNum[1] >= arrNum[2]){  // 가변 비용 > 판매 비용
            brkEvtPoint = -1;
        }else {
            brkEvtPoint += arrNum[0]/(arrNum[2]-arrNum[1]);
        }

        System.out.println(brkEvtPoint);
    }
}