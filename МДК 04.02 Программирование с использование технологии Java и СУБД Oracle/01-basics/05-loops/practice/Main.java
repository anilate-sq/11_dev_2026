import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        int days = 7;
        double total = 0;
        double maxExpense = -1;
        int maxDay = 0;

        for (int day = 1; day <= days; day++) {
            System.out.print("Расход за день " + day + ": ");
            double expense = scanner.nextDouble();
            total = total + expense;
            if (expense > maxExpense) {
                maxExpense = expense;
                maxDay = day;
            }
        }

        System.out.println("Сумма за неделю: " + total + " руб.");

        // 1. Вычислите средний расход в день и выведите его.

        // 2. Выведите день с максимальным расходом и его сумму.

        System.out.print("Введите цель накопления: ");
        double goal = scanner.nextDouble();

        // 3. Циклом while уменьшайте GOAL НА СРЕДНИЙ расход до тех пор,
        //    пока она больше 0, печатая текущий остаток.
        // 4. Посчитайте число повторений и выведите его.

        scanner.close();
    }
}