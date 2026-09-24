import java.util.Locale;
import java.util.Scanner;

public class ex_02_buyCoffee {
        public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ваше имя: ");
        String name = scanner.nextLine();

        System.out.print("Сколько чашек кофе: ");
        int coffeeCount = scanner.nextInt();

        System.out.print("Цена одной чашки: ");
        double coffeePrice = scanner.nextDouble();

        double total = coffeeCount * coffeePrice;

        // Использование форматированных строк под каждый спецсимвол %_ будет подставляться значение переменной в той же последовательности
        System.out.printf("%s, спасибо за заказ!%n", name);
        System.out.printf("Кофе x%d по %.2f руб. = %.2f руб.%n", coffeeCount, coffeePrice, total);
        System.out.printf("Итого к оплате: %.2f руб.%n", total);

        scanner.close();
    }
}
