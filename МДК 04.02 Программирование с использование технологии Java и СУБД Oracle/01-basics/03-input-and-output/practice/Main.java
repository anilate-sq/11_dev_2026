import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ваше имя: ");
        String name = scanner.nextLine();

        System.out.print("Сколько роллов: ");
        int rollCount = scanner.nextInt();

        System.out.print("Цена одного ролла: ");
        double rollPrice = scanner.nextDouble();

        System.out.print("Расстояние доставки, км: ");
        double distance = scanner.nextDouble();

        // 1. Вычислите стоимость роллов: rollCount * rollPrice.
        // 2. Вычислите стоимость доставки: 149 + 20 * distance.
        // 3. Вычислите итог: роллы + доставка.
        // 4. Выведите чек через printf с %s, %d, %.2f.

        scanner.close();
    }
}