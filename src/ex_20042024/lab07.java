package ex_20042024;

public class lab07 {
    public static void main(String[] args) {
        int a = 002;
        int b = 999;
        int c = 399;
        int result = (a>b)?(a>c?a:c):(b>c?b:c);
        System.out.println(result);
    }
}
