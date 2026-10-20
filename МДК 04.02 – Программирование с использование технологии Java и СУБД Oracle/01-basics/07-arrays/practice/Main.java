import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Сколько дней анализируем (3-30): ");
        int days = scanner.nextInt();

        double[] sales = new double[days];

        for (int i = 0; i < sales.length; i++) {
            System.out.print("Продажа за день " + (i + 1) + ": ");
            sales[i] = scanner.nextDouble();
        }

        System.out.println("=== Итоги ===");

        // 1. Общая сумма продаж за период.

        // 2. Средняя продажа в день (сумма / число дней).

        // 3. День с максимальной продажей: номер (индекс + 1) и сумма.

        // 4. День с минимальной продажей: номер и сумма.

        // 5. Сколько дней продажа была выше средней.

        scanner.close();
    }
}
