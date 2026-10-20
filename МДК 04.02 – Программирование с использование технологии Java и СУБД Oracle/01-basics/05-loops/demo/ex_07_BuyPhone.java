import java.util.Scanner;

public class ex_07_BuyPhone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Сколько откладываете в месяц: ");
        int monthly = scanner.nextInt();

        System.out.print("Сколько нужно накопить: ");
        int goal = scanner.nextInt();

        int total = 0;
        int months = 0;

        while (total < goal) {
            months++;
            total = total + monthly;
            System.out.println("Месяц " + months + ": накоплено " + total + " руб.");
        }

        System.out.println("Цель достигнута за " + months + " месяцев!");
        scanner.close();
    }
}
