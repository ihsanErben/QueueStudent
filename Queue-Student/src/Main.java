
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Queue h = new Queue();
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("1-enqueu");
            System.out.println("2-dequeu");
            System.out.println("3-print");
            System.out.print("option: ");
            int sayi = input.nextInt();
            System.out.println("");
            switch (sayi) {

                case 0:
                    return;
                case 1:
                    System.out.print("id: ");
                    int id = input.nextInt();
                    System.out.print("name: ");
                    String name = input.next();
                    h.enqueu(id, name);
                    h.print();
                    break;
                case 2:
                    h.dequeu();
                    h.print();
                    break;
                case 3:
                    h.print();
                    break;

            }

        }

    }
}
