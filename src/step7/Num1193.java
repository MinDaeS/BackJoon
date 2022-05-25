package step7;

import java.io.*;

public class Num1193 {

    /**
     * 달팽이는 올라가고 싶다
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int inputNum = Integer.parseInt(br.readLine());

        int crossNum = 0, crossMaxNum = 0;  // 대각선 수, 대각선 최대값

        while (inputNum > crossMaxNum){
            crossNum ++;
            crossMaxNum += crossNum;
        }

        int gapNum = crossMaxNum - inputNum;    // 차이수
        int firstNum, secondNum;                // 앞자리, 뒷자리

        if(crossNum%2 == 0){
            // 대각선 = 짝수
            firstNum = crossNum - gapNum;
            secondNum = gapNum + 1;
        }else{
            // 대각선 = 홀수
            firstNum = gapNum + 1;
            secondNum = crossNum - gapNum;
        }

        System.out.println(firstNum+"/"+secondNum);
    }

    /**
     * 구현과 답은 나오지만 ** 메모리 초과 **
     *  1. 변수가 너무 많은듯...
     * @throws IOException
     */
    public void try1() throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());

        String arr [] = new String [10000000];

        int checkNum = 1;
        int addNum = 2;

        boolean isFlag = true;
        int leftNum = 1;
        int rightNum = 1;

        for(int i=1; i<=arr.length; i++){

            arr[i-1] = leftNum+"/"+rightNum;
            if(number == i){
                System.out.println(arr[number-1]);
            }

            if(checkNum == i){  // 확장되는 부분
                checkNum += addNum;
                addNum++;

                if(isFlag){
                    rightNum++;
                    isFlag = false;
                }else{
                    leftNum++;
                    isFlag = true;
                }

            }else{
                if(isFlag){
                    leftNum--;
                    rightNum++;
                }else{
                    leftNum++;
                    rightNum--;
                }
            }
        }
    }
}