# Условия

## Цель занятия

Научиться писать программы, которые принимают решения в зависимости от данных: `if`, `else if`, `else` и `switch`.

## Что сегодня изучаем?

- сравнение значений: `==`, `!=`, `<`, `>`, `<=`, `>=`;
- результат сравнения — тип `boolean`;
- ветвление `if` / `else if` / `else`;
- логические операторы `&&` (и), `||` (или), `!` (не);
- оператор `switch` и `default`;
- сравнение строк через `.equals()`;

## Основная терминология

| Термин | Определение |
| ------ | ----------- |
| Boolean-выражение | Выражение, которое даёт `true` или `false` |
| Оператор сравнения | Знак, сравнивающий два значения: `==`, `>`, `<=` |
| Логический оператор | `&&`, `||`, `!` — соединяют boolean-выражения |
| Ветвление | Развилка в программе: какая часть кода выполнится |
| `switch` | Оператор выбора по нескольким вариантам значения |
| Fallthrough | «Проваливание» — продолжение выполнения в следующий case без `break` |

## Теория

Программы редко выполняются строго сверху вниз. Почти всегда нужно что-то проверить: достаточно ли денег, есть ли место, разрешён ли доступ. Для этого и нужны условия.

Условие — это boolean-выражение: `age >= 18` даёт либо `true`, либо `false`. Конструкция `if (условие) { ... }` выполняет блок, только если условие истинно. Если веток несколько — дополняем `else if`, закрываем `else`.

Когда нужно выбрать один вариант из нескольких конкретных значений (1, 2, 3 или «капучино», «латте»), удобнее `switch`, чем цепочка `if`.

Два важных нюанса для новичков:

- сравнение пишется как `==` (два знака равно), а не `=` (один — это присваивание);
- строки через `==` сравнивать нельзя — только через `.equals()`: `name.equals("Мария")`.

## Базовый синтаксис

```java
int age = 17;

if (age >= 18) {
    System.out.println("Добро пожаловать!");
} else if (age >= 14) {
    System.out.println("Нужно согласие родителей.");
} else {
    System.out.println("Доступ запрещён.");
}

int choice = 2;
switch (choice) {
    case 1:
        System.out.println("Выбрано: чай");
        break;
    case 2:
        System.out.println("Выбрано: кофе");
        break;
    default:
        System.out.println("Не знаю такого пункта");
}
```

- В `if` первым всегда идёт самое строгое условие, дальше — мягче.
- `boolean result = age >= 18;` — результат сравнения можно сохранить в переменную.
- В `switch` каждый `case` заканчивается `break`, иначе код «провалится» дальше. `default` — ветка «если ничего не подошло».

## Практические примеры

### Пример 1. Проверка возраста в видеоклубе

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ваш возраст: ");
        int age = scanner.nextInt();

        if (age >= 18) {
            System.out.println("Доступ к фильмам 18+ открыт.");
        } else {
            System.out.println("Доступ ограничен.");
        }

        scanner.close();
    }
}
```

Одно условие — одна развилка. С `>= 18` работает и человеку 18, и 40.

### Пример 2. Скидки по сумме корзины

```java
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

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

        scanner.close();
    }
}
```

Благодаря порядку `if → else if` достаточно проверить нижнюю границу каждой ступени: 5000 поймает всё, что больше, и не «уедет» ниже. `%.0f%%` выводит целое число процентов и сам знак `%`.

### Пример 3. Меню кофейни через switch

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

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
```

## Разбор примера

Разберём пример 2 — систему скидок.

- `double discount = 0;` — переменная объявлена **до** условий. Если бы мы объявили её внутри `if`, снаружи она была бы не видна — переменная существует только внутри своего блока `{}`.
- Цепочка `if (>=5000) → else if (>=2000) → else if (>=500)` проверяется по очереди и останавливается на первом истинном. При сумме 3000 сработает только вторая ветка: до `>=5000` не дойдёт, но `>=2000` истинно.
- Формула `sum * (100 - discount) / 100` — скидка в процентах превращается в коэффициент.
- В примере 3 `switch` присваивает цену и название по номеру. При `choice = 5` сработает `default`: цена 0 и честное сообщение. Датапаттерн «выбор из меню» — самый частый случай применения `switch`.

## Итоги занятия

- `if (условие) { ... } else if { ... } else { ... }` — ветвление по boolean-выражению.
- Сравнение: `==`, `!=`, `<`, `>`, `<=`, `>=`. Присваивание — один `=`.
- Строки сравниваются только через `.equals()`.
- `&&`, `||`, `!` — логические операторы.
- `switch` выбирает из конкретных вариантов, обязателен `break` или `default`.
- Переменная живёт внутри блока `{}`, где объявлена.

## Вопросы для самопроверки

- Чем `==` отличается от `=` и что будет, если перепутать?
- Почему при сумме 3000 срабатывает скидка 10%, а не 5%?
- Что случится в `switch` без `break`?
- Почему `name == "Мария"` работает не так, как ожидается?
- Можно ли использовать `switch` для дробного числа и почему?

## Дополнительные материалы

- [Оператор if-then-else (Oracle Tutorial)](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/if.html)
- [Оператор switch (Oracle Tutorial)](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/switch.html)
- [Логические операторы (Oracle Tutorial)](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/op2.html)