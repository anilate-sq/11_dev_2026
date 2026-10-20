import java.util.Locale;
import java.util.Scanner;

public class ex_03_GradesStudent {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);
        int[] marks = new int[5];

        for (int i = 0; i < marks.length; i++) {
            System.out.print("Оценка " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
        }

        int sum = 0;
        int max = marks[0];
        int min = marks[0];
        for (int mark : marks) {
            sum = sum + mark;
            if (mark > max) {
                max = mark;
            }
            if (mark < min) {
                min = mark;
            }
        }

        double average = (double) sum / marks.length;
        System.out.println("Средний балл: " + average);
        System.out.println("Максимум: " + max + ", минимум: " + min);
        scanner.close();
    }
}
