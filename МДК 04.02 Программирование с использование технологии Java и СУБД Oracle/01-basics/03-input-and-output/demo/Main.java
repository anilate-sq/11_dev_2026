import java.util.Locale; // Подключаем Locale
import java.util.Scanner; // Подключаем Scanner

public class Main{
    public static void main(String[] args){

        /*
            Базовый синтаксис
        */
        Locale.setDefault(Locale.US); //  Для того чтобы назначить . разделить для дробей
        Scanner scanner = new Scanner(System.in); // Создаем Scanner
        System.out.print("Введите имя: ");
        String name = scanner.nextLine(); // Ввод текста
        System.out.println("Вас зовут: " + name);
        System.out.print("Введите возраст: ");
        int age = scanner.nextInt(); // Ввод числа
        System.out.println("Ваш возраст: " + age);
        System.out.print("Введите средний балл: ");
        double avg = scanner.nextDouble(); // Ввод дробного числа
        System.out.println("Ваш средний балл: " + avg);

        System.out.println("Привет, " + name + "! Тебе " + age + " лет."); // Конкатенация строк
        
        scanner.close(); // Закрываем сканер(делать всегда как завершите работу со сканером)

        /*
            Пример 1. Конвертер валют
        */
    }
}