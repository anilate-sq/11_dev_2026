import java.util.Locale;
import java.util.Scanner;

public class ex_04_PracticeExamples {
    public static void main(String[] args) {

        // Пример 1. Проверка возраста в видеоклубе
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ваш возраст: ");
        int age = scanner.nextInt();

        if (age >= 18) {
            System.out.println("Доступ к фильмам 18+ открыт.");
        } else {
            System.out.println("Доступ ограничен.");
        }

        // Пример 2. Скидки по сумме корзины

        Locale.setDefault(Locale.US);

        System.out.print("Сумма корзины: ");
        double sum = scanner.nextDouble();
        double discount = 0;

        if (sum >= 5000) {
            discount = 15;
        } else if (sum >= 2000) {
            discount = 10;
        } else if (sum >= 500) {
            discount = 5;
        }

        double finalSum = sum * (100 - discount) / 100;

        System.out.printf("Скидка: %.0f%%%n", discount);
        System.out.printf("К оплате: %.2f руб.%n", finalSum);

        // Пример 3. Меню кофейни через switch

        System.out.println("Выберите напиток:");
        System.out.println("1 — Американо (149 руб.)");
        System.out.println("2 — Капучино (199 руб.)");
        System.out.println("3 — Мокко (229 руб.)");
        System.out.print("Ваш выбор: ");
        int choice = scanner.nextInt();

        int price;
        String drinkName;

        switch (choice) {
            case 1:
                price = 149;
                drinkName = "Американо";
                break;
            case 2:
                price = 199;
                drinkName = "Капучино";
                break;
            case 3:
                price = 229;
                drinkName = "Мокко";
                break;
            default:
                price = 0;
                drinkName = "Неизвестный напиток";
        }

        System.out.println(drinkName + ": " + price + " руб.");
        scanner.close();
    }
}
