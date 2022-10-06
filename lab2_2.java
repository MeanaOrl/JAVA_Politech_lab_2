import java.util.Scanner;

public class lab2_2 {
    public static void main(String[] args) {
        Scanner w = new Scanner(System.in);
        System.out.println("? вперёд или назад ");
        String a;
        a = w.nextLine();
        System.out.println("Число ячеек: ");
        int b = w.nextInt();
        System.out.println("Позиция: ");
        int c = w.nextInt();

        System.out.println(rob(a, b, c));
    }

    static int rob(String c, int tab, int poz) {
        if (c.equals("вперёд")) {
            int f = (poz + tab);
            if (f > 99) {
                return 99;
            } else {
                return f;
            }
        }
        if (c.equals("назад")) {
            int f = (poz - tab);
            if (f < 0) {
                return 0;
            } else {
                return f;
            }
        }
        return tab;
    }
}
