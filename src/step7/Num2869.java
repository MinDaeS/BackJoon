package step7;

import java.io.*;

public class Num2869 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String arrNum [] = br.readLine().split(" ");

        int a = Integer.parseInt(arrNum[0]);
        int b = Integer.parseInt(arrNum[1]);
        int v = Integer.parseInt(arrNum[2]);

        double day = (v-b) / (double) (a-b);
        int result = day == (v-b) / (a-b) ? (int) day : (int) day + 1;

        System.out.println(result);
    }

    /**
     * 시간 초과
     * @throws IOException
     */
    public void try1() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String arrNum [] = br.readLine().split(" ");

        int climbNum = Integer.parseInt(arrNum[0]);
        int descNum = Integer.parseInt(arrNum[1]);
        int maxNum = Integer.parseInt(arrNum[2]);
        int curHeight = 0;
        int dayNum = 0;

        while (true){
            curHeight = curHeight + climbNum-descNum;
            dayNum ++;

            if(curHeight + climbNum >= maxNum){
                dayNum ++;
                break;
            }

        }

        System.out.println(dayNum);
    }
}
