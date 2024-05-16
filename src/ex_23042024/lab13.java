package ex_23042024;

public class lab13 {
    public static void main(String[] args) {
        int itemcode = 001;
        switch (itemcode)
        {
            case 001,002,003:
                System.out.println("Electronic item");
                break;
            case 004,005,006:
                    System.out.println("mechanical item");
            default:
                    System.out.println("None");
        }
    }
}
