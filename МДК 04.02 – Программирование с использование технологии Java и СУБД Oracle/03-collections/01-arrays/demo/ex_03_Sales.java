import java.util.Locale;

public class ex_03_Sales {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        double[] sales = {1250.50, 980.00, 1430.75, 1100.00, 875.25};
        double total = 0;

        for (double sale : sales) {
            total += sale;
        }

        double average = total / sales.length;
        System.out.printf("Сумма продаж: %.2f%n", total);
        System.out.printf("Средняя продажа: %.2f%n", average);
    }
}
