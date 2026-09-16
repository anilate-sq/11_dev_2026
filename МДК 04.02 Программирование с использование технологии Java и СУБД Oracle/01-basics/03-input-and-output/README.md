# Ввод и вывод

## Цель занятия

Научиться делать программы интерактивными: читать данные с клавиатуры и выводить результат в аккуратном, отформатированном виде.

## Что сегодня изучаем?

- класс `Scanner` и строка `import java.util.Scanner`;
- чтение строки (`nextLine()`) и чисел (`nextInt()`, `nextDouble()`);
- разница между `print` и `println`;
- форматированный вывод через `printf`;
- почему дробные числа «падают», если вводить с точкой, и как это исправить;
- закрытие сканера методом `close()`.

## Основная терминология

| Термин | Определение |
| ------ | ----------- |
| Scanner | Класс Java, который умеет читать данные из источника |
| `System.in` | Стандартный вход — клавиатура; источник данных для сканера |
| Промпт (prompt) | Текст-подсказка перед вводом: «Введите возраст: » |
| Формат-спецификатор | Место в строке под значение: `%d` — целое, `%s` — строка, `%.2f` — дробное с 2 знаками |
| Локаль (Locale) | Настройки системы: в русской системе дробный разделитель — запятая |
| Newline | Перенос строки в выводе |

## Теория

До сих пор все данные были записаны прямо в коде. Но реальные программы получают данные от человека. В Java для чтения ввода используется класс `Scanner`.

Правило для трёх действий:

1. **Подключить класс:** `import java.util.Scanner;` — без этой строки Java не знает, что такое `Scanner`.
2. **Создать сканер:** `Scanner scanner = new Scanner(System.in);` — говорим «читай с клавиатуры».
3. **Читать методом под нужный тип:** `nextLine()` — строка, `nextInt()` — целое, `nextDouble()` — число с дробью.

В конце программы сканер закрывают: `scanner.close();`.

Для вывода используем уже знакомые `println` и `print` (с переносом строки и без). Новое — `printf`: он подставляет значения в текст по формату и позволяет выводить деньги с фиксированным числом знаков.

**Важно про дробные числа.** В русской операционной системе Java ждёт, что десятичная часть отделяется запятой: ввод `89.90` с точкой упадёт с ошибкой. Чтобы программа одинаково понимала точку на любом компьютере, первой строкой в `main` задаём англоязычную локаль:

```java
Locale.setDefault(Locale.US);
```

Эта одна строка заодно делает одинаковым и вывод `printf` (точка вместо запятой). Добавьте её в каждую программу, которая читает или выводит дробные числа.

## Базовый синтаксис

```java
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите имя: ");
        String name = scanner.nextLine();

        System.out.print("Введите возраст: ");
        int age = scanner.nextInt();

        System.out.println("Привет, " + name + "! Тебе " + age + " лет.");
        scanner.close();
    }
}
```

Пример запуска:

```
Введите имя: Мария
Введите возраст: 17
Привет, Мария! Тебе 17 лет.
```

- `Locale.setDefault(Locale.US);` идёт первой строкой `main` и делает дробный разделитель точкой.
- `System.out.print` выводит текст без перевода строки — курсор остаётся рядом, чтобы человек сразу видел, что вводить.
- `nextLine()` / `nextInt()` / `nextDouble()` — каждая команда ждёт, пока человек наберёт значение и нажмёт Enter.
- `.close()` освобождает ресурс. Сканер закрывается один раз, в конце.

## Практические примеры

### Пример 1. Конвертер валют

```java
import java.util.Locale;
import java.util.Scanner;

public class Main {
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
```

Вывод:

```
Сколько рублей меняем: 5000
Курс доллара: 92.5
5000.00 руб. = 54.05 USD
```

`printf` подставляет значения по очереди вместо `%.2f`. `%n` — перенос строки.

### Пример 2. Касса кафе с чеком

```java
import java.util.Locale;
import java.util.Scanner;

public class Main {
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

        System.out.printf("%s, спасибо за заказ!%n", name);
        System.out.printf("Кофе x%d по %.2f руб. = %.2f руб.%n", coffeeCount, coffeePrice, total);
        System.out.printf("Итого к оплате: %.2f руб.%n", total);

        scanner.close();
    }
}
```

Вывод:

```
Ваше имя: Мария
Сколько чашек кофе: 2
Цена одной чашки: 89.90
Мария, спасибо за заказ!
Кофе x2 по 89.90 руб. = 179.80 руб.
Итого к оплате: 179.80 руб.
```

## Разбор примера

Разберём пример 2.

- `Scanner scanner = new Scanner(System.in);` — создаём один сканер в `main`. Не нужно создавать новый сканер перед каждым вводом.
- Строка читается через `nextLine()`, но **после** неё идут числовые методы. Важный нюанс: если сначала вызвать `nextInt()`, а потом `nextLine()`, вторая команда «съест» пустой символ переноса и имя не прочитается. Поэтому здесь порядок выбран так: строка → числа.
- `Locale.setDefault(Locale.US);` гарантирует, что и ввод, и вывод используют точку как разделитель. Без этой строки на русской системе ввод `89.90` упал бы с `InputMismatchException`.
- `%.2f` выводит ровно два знака после запятой — `89.90`, а не `89.9`. Для денег это то, что нужно.
- `%d` — целое число, `%s` — строка. Количество формат-спецификаторов должно совпадать с количеством аргументов.

## Итоги занятия

- `Scanner` подключается через `import` и создаётся с `System.in`.
- Для каждого типа данных — свой метод: `nextLine()`, `nextInt()`, `nextDouble()`.
- `Locale.setDefault(Locale.US);` первым в `main` — чтобы дробные числа работали одинаково везде.
- `print` не переносит строку, `println` переносит, `printf` форматирует.
- `printf("%.2f", value)` выводит число с ровно двумя знаками после запятой.
- Сканер закрывают в конце программы через `close()`.

## Вопросы для самопроверки

- Зачем нужен `import java.util.Scanner;`?
- Почему после `nextInt()` нельзя сразу писать `nextLine()`?
- Чем `%d`, `%s` и `%.2f` отличаются друг от друга?
- Что делает `Locale.setDefault(Locale.US);` и зачем он нужен?
- Как вывести текст без перехода на новую строку?

## Дополнительные материалы

- [Документация класса Scanner](https://docs.oracle.com/javase/8/docs/api/java/util/Scanner.html)
- [Форматирование чисел (Oracle Tutorial)](https://docs.oracle.com/javase/tutorial/java/data/numberformat.html)
- [Системные потоки ввода-вывода (Oracle Tutorial)](https://docs.oracle.com/javase/tutorial/essential/io/cl.html)