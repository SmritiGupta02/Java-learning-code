package ex_23042024;
import java.util.Scanner;
public class lab08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();
        if (age > 18) {
            System.out.println("you can watch the movie");
        } else {
            System.out.println("you can not watch the movie");
        }
    }
}