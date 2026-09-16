import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Сумма покупки: ");
        double sum = scanner.nextDouble();

        System.out.print("Покупок за месяц: ");
        int purchasesInMonth = scanner.nextInt();

        int discount = 0;

        // 1. Постройте цепочку if / else if / else:
        //    sum >= 5000 -> 15, sum >= 2000 -> 10, sum >= 500 -> 5, иначе 0.
        // 2. Если purchasesInMonth >= 4 и discount > 0, добавьте 3.

        // 3. Посчитайте итог: sum * (100 - discount) / 100.
        // 4. Посчитайте баллы: сколько РАЗ по 100 руб. помещается в итог.

        // 5. Выведите через printf: скидку в процентах, итог, баллы.
        // 6. Меню через switch: 1 — чек, 2 — только итог, default — предупреждение.

        scanner.close();
    }
}