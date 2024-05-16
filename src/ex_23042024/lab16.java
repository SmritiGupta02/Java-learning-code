package ex_23042024;
import java.util.Scanner;

public class lab16 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter side1, side2, side3, i will tell you about the triangle");
        int side1 = Sc.nextInt();
        int side2 = Sc.nextInt();
        int side3 = Sc.nextInt();
        if (side1==side2 && side2==side3)
        {
            System.out.println("it is equilatral triangle");}
        else if ((side1==side2)|| (side1==side3 ) ||(side2==side3)) {
            System.out.println("iso");
        }else{
            System.out.println("scalene");
        }

    }
}
