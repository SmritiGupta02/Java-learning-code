package ex_23042024;
import java.util.Scanner;
public class lab11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter first number");
        int num1 = sc.nextInt();
        System.out.println("Enter second number");
        int num2 = sc.nextInt();
        int max = Math.max(num1, num2);
        System.out.println("MAX by math.max is "+max);
        if(num1>num2)
        {System.out.println("max is ->" +num1);}
            else
            {System.out.println("max is ->" +num2);}
    }
}
