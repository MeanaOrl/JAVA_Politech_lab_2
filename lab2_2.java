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

        rob(a, b, c);
    }

    public static void rob(String c, int tab, int poz) {
        if ((c.equals("вперёд")) == true) {
            int f = (poz + tab);
            if (f > 99) {
                System.out.println("99");
            } else {
                System.out.println(f);
            }
        }
        if ((c.equals("назад")) == true) {
            int f = (poz - tab);
            if (f < 0) {
                System.out.println("0");
            } else {
                System.out.println(f);
            }
        }
    }
}
