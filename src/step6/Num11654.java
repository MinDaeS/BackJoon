package step6;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 * 아스키 코드 변환
 */
public class Num11654 {

    public static void main(String[] args) throws IOException {

        System.out.println(System.in.read());
    }

    public void try1(){
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        System.out.println(text.getBytes(StandardCharsets.US_ASCII)[0]);
    }
}
