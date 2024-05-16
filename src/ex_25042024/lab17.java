package ex_25042024;
import java.util.Scanner;
public class lab17 {
    //which day of the week
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number 1 to 7, i will tell you which day is this");
        int day = sc.nextInt();
        switch (day) {
            case 1:
                System.out.println("Mon");
                break;
            case 2:
                System.out.println("tues");
                break;
            case 3:
                System.out.println("wed");
                break;
            case 4:
                System.out.println("thu");
                break;
            case 5:
                System.out.println("fri");
                break;
            case 6:
                System.out.println("Sat");
            case 7:
                System.out.println("Sun");
                break;
            default:
                System.out.println("only number 1 to 7 are allowed");
        }
    }
}