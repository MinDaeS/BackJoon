package step2;

import java.util.Scanner;

public class Num2525 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int hour = scan.nextInt();
        int minute = scan.nextInt();
        int timer = scan.nextInt();

        hour += (minute+timer)/60;
        hour %= 24;
        minute = (minute+timer)%60;

        System.out.println(hour+ " " + minute);
    }

    public void backup1(){
        Scanner scan = new Scanner(System.in);

        int hour = scan.nextInt();
        int minute = scan.nextInt();
        int timer = scan.nextInt();

        int addTime = minute + timer;

        if(addTime >= 60){

            int hourCnt = addTime/60;

            for(int i=0; i<hourCnt; i++){
                hour++;
                addTime-=60;
            }

            hour = hour > 23 ? hour-24 : hour;
            minute = addTime;
        }else {
            minute = addTime;
        }

        System.out.println(hour+ " " + minute);
    }
}
