package step6;

import java.io.*;

/**
 * 그룹 단어 체커
 */
public class Num1316 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int textCnt = Integer.parseInt(br.readLine());
        int groupWordCnt = 0;

        for(int i=0; i<textCnt; i++){

            char [] arrWord = br.readLine().toCharArray();
            char [] arrNotGrp = new char[arrWord.length];
            boolean isNotGrp = true;

            for(int j=0; j<arrWord.length; j++){

                if(j!=0 && arrWord[j-1] == arrWord[j]){
                    continue;
                }else {

                    for(char notGrpWord : arrNotGrp){
                        if(notGrpWord == arrWord[j]){
                            isNotGrp = false;
                            break;
                        }
                    }
                    arrNotGrp[j] = arrWord[j];
                }
            }

            if(isNotGrp) groupWordCnt++;
        }

        System.out.println(groupWordCnt);
    }
}