import java.util.Locale;
import java.util.Scanner;

public class ex_08_WeatherInWeek {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        double total = 0;
        double maxTemperature = -100;

        for (int day = 1; day <= 7; day++) {
            System.out.print("Температура в день " + day + ": ");
            double temperature = scanner.nextDouble();

            total = total + temperature;
            if (temperature > maxTemperature) {
                maxTemperature = temperature;
            }
        }

        double average = total / 7;
        System.out.println("Средняя температура: " + average);
        System.out.println("Максимум за неделю: " + maxTemperature);
        scanner.close();
    }
}
