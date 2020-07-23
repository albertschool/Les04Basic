package com.videxedge;

import java.util.Scanner;

public class Main {
    public static Scanner input = new Scanner(System.in);

    public static void seqex01() {
        System.out.println("Number of numbers:");
        int num = input.nextInt();

    }

    public static void seqex02() {
        int num,dig1,dig2,diff=0,maxD1=0,maxD2=0;
        System.out.println("Enter number (2 digits):");
        num = input.nextInt();
        while(num>=10) {
            dig1 = num%10;
            dig2 = (num/10)%10;
            if(diff<Math.abs(dig1-dig2)) {
                diff = Math.abs(dig1-dig2);
                maxD1 = dig1;
                maxD2 = dig2;
            }
            num = num/10;
        }
        System.out.println("Maximum difference is: "+diff);
        System.out.println("between the numbers: "+maxD1+", "+maxD2);
    }

    public static void seqex03() {
        int num,dig1,dig2,dig3;
        boolean found = false;
        System.out.println("Enter number (3 digits):");
        num = input.nextInt();
        while(num>=100&& !found) {
            dig1 = num%10;
            dig2 = (num/10)%10;
            dig3 = (num/100)%10;
            if(dig2>dig1&&dig2>dig3) {
                found = true;
            }
            num = num/10;
        }
        if(found)
            System.out.println("Hill number");
        else
            System.out.println("Not hill number");
    }

    public static void p2exe01nest() {
        final int PLANES=203;
        int passNum;
        for (int i=0; i<203; i++) {
            System.out.println("Enter number of passengers:");
            passNum = input.nextInt();

        }
        boolean found = false;
        System.out.println("Enter number (3 digits):");
        num = input.nextInt();
        while(num>=100&& !found) {
            dig1 = num%10;
            dig2 = (num/10)%10;
            dig3 = (num/100)%10;
            if(dig2>dig1&&dig2>dig3) {
                found = true;
            }
            num = num/10;
        }
        if(found)
            System.out.println("Hill number");
        else
            System.out.println("Not hill number");
    }

public static void main(String[] args) {
//        seqex01();
//        seqex02();
//        seqex03();
        p2exe01nest();
    }
}
