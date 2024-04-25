package ex_23042024;
import java.util.Scanner;
public class lab10 {
    public static void main(String[] args) {
        //even or odd number
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of your choise");
        int num = scanner.nextInt();
        if (num%2 == 0) {
            System.out.println("even number");
        }
        else
        {System.out.println("odd number");}

    }
}
