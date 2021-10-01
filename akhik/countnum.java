
import java.util.Scanner;

public class countnum {
    public static void main(String[] args) {
         Scanner in=new Scanner(System.in);
        System.out.println("enter your number ");
        int num= in.nextInt();
        int num1= in.nextInt();
        int count=0;
        while (num>0){
            int a=num%10;
            num/=10;
            if (a==num1){
                count++;
            }
        }
        System.out.println(count);
    }

}
