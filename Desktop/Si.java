import java.util.Scanner;
public class Si {
    public static void main(String[] args){
            Scanner num=new Scanner(System.in);
            System.out.println("enter your principal");
            int name=num.nextInt();

            Scanner rate=new Scanner(System.in);
            System.out.println("enter your rate");
            float Rate =rate.nextFloat();

            Scanner time=new Scanner(System.in);
            System.out.println("enter your time");
            int Time=time.nextInt();

            float a=name*Rate*Time/100;
        System.out.println(a);








        }
}
