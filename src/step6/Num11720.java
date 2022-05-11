package step6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * 숫자의 합
 */
public class Num11720 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int size = Integer.parseInt(br.readLine());
        String n = br.readLine();

        int sum = 0;
        for(int i=0; i<size; i++){
            sum += Integer.parseInt(String.valueOf(n.charAt(i)));
        }

        System.out.println(sum);
    }

    /**
     *
     */
    public void try1(){
        Scanner scanner = new Scanner(System.in);

        String numA = scanner.next();
        String numB = scanner.next();

        char [] arr = numB.toCharArray();

        int result = 0;

        for(char number : arr){
            result += Character.getNumericValue(number);
        }

        System.out.println(result);
    }
}