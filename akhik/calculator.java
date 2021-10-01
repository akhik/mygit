import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        int ans = 0;
        while (true) {
            Scanner in = new Scanner(System.in);
            System.out.println("enter your operator ");
            char op = in.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                System.out.println("enter your numbers ");
                int num1 = in.nextInt();
                int num2 = in.nextInt();

                if (op == '+') {
                    ans = num1 + num2;
                }
                if (op == '-') {
                    ans = num1 - num2;
                }
                if (op == '*') {
                    ans = num1 * num2;
                }
                if (op == '/') {
                    if (num2 != 0) {
                        ans = num1 / num2;
                    }
                }
                if (op == '%') {
                    ans = num1 % num2;
                }
            }
            else if (op == 'x' || op == 'X') {
                break;
            }
            else {
                System.out.println("invalid operation");
            }
            System.out.println("your answer is " + ans);
        }
    }
    }
