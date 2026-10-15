import java.util.Locale;
import java.util.Scanner;

public class Main {
    
    // TODO: Создайте метод для расчёта суммы заказа
    // Он должен принимать цену товара (double) и количество (int)
    // и возвращать сумму (double)
    
    // TODO: Создайте метод для вывода чека
    // Он должен принимать название товара, цену, количество, сумму
    // Ничего не возвращать (void), выводить информацию на экран
    
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Введите название товара: ");
        String productName = scanner.nextLine();
        
        System.out.print("Введите цену за 1 шт.: ");
        double price = scanner.nextDouble();
        
        System.out.print("Введите количество: ");
        int quantity = scanner.nextInt();
        
        // TODO: Вызовите метод расчёта суммы и сохраните результат в переменную
        // TODO: Вызовите метод вывода чека
        
        scanner.close();
    }
}