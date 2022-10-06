import java.util.Scanner;

public class lab2_1 {
    
    static void tempr(int x) {
        if (x < 10) {
            System.out.println("Холодно");
        }
        if (x > 10 && x <= 25) {
            System.out.println("Тепло");
        }
        if (x > 25) {
            System.out.println("Жара");
        }
    }

    public static void main(String args []) {
        Scanner vv = new Scanner(System.in);
        System.out.println("Temperature: ");
        int a = vv.nextInt();

        tempr(a);
    }
}
