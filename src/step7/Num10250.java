package step7;

import java.io.*;

public class Num10250 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testNum = Integer.parseInt(br.readLine());
        String arrRoom [] = new String[testNum];

        for(int i=0; i<testNum; i++){
            String arrNum [] = br.readLine().split(" ");

            int height = Integer.parseInt(arrNum[0]);
            int number = Integer.parseInt(arrNum[2]);

            int xx = number/height;     // 방 번호
            int yy = number%height;     // 층수

            if(yy>0){
                xx = xx+1;
            }else {
                yy = height;
            }

            arrRoom[i] = ""+yy;
            arrRoom[i] += (""+xx).length() > 1 ? ""+xx : "0"+xx;
        }

        for(String room : arrRoom){
            System.out.println(room);
        }
    }
}