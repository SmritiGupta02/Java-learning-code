package ex_23042024;
import java.util.Scanner;
public class lab14
{
    public static void main(String[] args)
    {
       System.out.println("Enter number");
       Scanner sc = new Scanner(System.in);
       int number = sc.nextInt();
       if (number > 20) {
           System.out.println("num>20");
       } else if (number > 10) {
           System.out.println("num is between 10 and 20");
       } else {
           System.out.println("num<20");}
    }
}
