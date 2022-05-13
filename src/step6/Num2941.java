package step6;

import java.io.*;

/**
 * 	크로아티아 알파벳
 */
public class Num2941 {

    public static void main(String[] args) throws IOException {

        String cAlphabets [] = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};   // 크로아티아 알파벳 선언

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cnt = 0;    // 매칭된 알파벳 개수
        String texts [] = br.readLine().split("");  // String 배열로 담기

        for(int i=0; i<texts.length-2; i++){    // 3개 짜리

            String tmpAlpha = texts[i]+ texts[i+1]+texts[i+2];

            if(cAlphabets[2].equals(tmpAlpha)){
                cnt++;
                texts[i] = "";
                texts[i+1] = "";
                texts[i+2] = "";
            }
        }

        for(int i=0; i<texts.length-1; i++){    // 2개 짜리

            String tmpAlpha = texts[i]+ texts[i+1];

            for(String croAlpha:cAlphabets){
                if(croAlpha.equals(tmpAlpha)){
                    cnt++;
                    texts[i] = "";
                    texts[i+1] = "";
                }
            }
        }

        for(String text:texts){ // 1개 짜리
            if(!text.equals("")){
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}