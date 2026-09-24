import java.util.Locale;
import java.util.Scanner;

public class ex_01_conVal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Сколько рублей меняем: ");
        double rubles = scanner.nextDouble();

        System.out.print("Курс доллара: ");
        double rate = scanner.nextDouble();

        double dollars = rubles / rate;

        System.out.printf("%.2f руб. = %.2f USD%n", rubles, dollars);
        scanner.close();
    }
}