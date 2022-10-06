import java.util.Scanner;

public class lab2_3 {
    public static void main(String[] args) {
        Scanner vv = new Scanner(System.in);
        System.out.println("Income: ");
        int a = vv.nextInt();

        tax(a);
    }

    public static void tax(int z) {
        if (z < 35000) {
            System.out.println(z/100*15);
        }
        if (z >= 35000 && z <= 100000) {
            if (z > 50000) {
                System.out.println(z/100*30);
            } else {
                System.out.println(z/100*25);
            }
        }
        if (z > 100000) {
            System.out.println(z/100*40);
        }
    }

}
