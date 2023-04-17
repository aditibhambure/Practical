package Method;

import java.util.Scanner;
public class Average {

 public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("first num: ");
        int num1 = sc.nextInt();
        System.out.print("second num: ");
        int num2 = scan.nextInt();
        System.out.print("third num: ");
        int num3 = scan.nextInt();
        scan.close();
        System.out.print("The average is:" + avr(num1, num2, num3) );
    }

  public static int avr(int a, int b, int c)
    {
        return (a + b + c) / 3;
    }
}