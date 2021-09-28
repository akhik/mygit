package com.java;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner num=new Scanner(System.in);
        System.out.println("input ");
        int x=num.nextInt();


        Scanner nu_m=new Scanner(System.in);
        System.out.println("2nd input");
        int y=nu_m.nextInt();

        Scanner operator=new Scanner(System.in);
        System.out.println("enter 1 for add " );
        System.out.println("enter 2 for subtract ");
        System.out.println("enter 3 for multiply" );
        int opera= operator.nextInt();

        if (opera==1){
            int sum=x+y;
            System.out.println("your number is "+sum);

        }
        if (opera==2){
            int diff=x-y;
            System.out.println("your number is "+diff);}

        else {
            int mul=x*y;
            System.out.println("your number is "+mul);}









    }
}
