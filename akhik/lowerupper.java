import java.util.Scanner;
public class lowerupper {
    public static void main(String[] args) {
        int i=1;
        while (true){
            Scanner in = new Scanner(System.in);
            System.out.println("enter your letter or number to check or press * o stop ");
            char ch = in.next().trim().charAt(0);
            if (ch >= 'a' && ch <= 'z') {
                System.out.println("lower case ");
            }
            if (ch >= 'A' && ch <= 'Z') {
                System.out.println("upper case ");
            } else if (ch >= '0' && ch <= '9') {
                System.out.println("you entered a number");
            }
            else if(ch=='*'){
                break;
}


    }
}
}