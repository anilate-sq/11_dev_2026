public class Main {
    public static void main(String[] args) {
        final double PRICE_COFFEE = 149.0;
        final double PRICE_CROISSANT = 99.0;
        final double PRICE_SANDWICH = 199.0;
        final int DISCOUNT_PERCENT = 10;

        int coffeeCount = 1;
        int croissantCount = 2;
        int sandwichCount = 1;

        // 1. Вычислите стоимость каждого вида блюд и сохраните в переменные.
        // 2. Вычислите общую сумму заказа.
        // 3. Посчитайте размер скидки и итоговую сумму к оплате.
        // 4. Выведите чек в консоль: название кафе, позиции, сумму до скидки,
        //    размер скидки и итог. Название кафе — переменная типа String.

        System.out.println("Кафе «Бариста»");
        System.out.println("Капучино x" + coffeeCount + " = ?");
        System.out.println("Круассан x" + croissantCount + " = ?");
        System.out.println("Сэндвич x" + sandwichCount + " = ?");
        System.out.println("Сумма до скидки: ?");
        System.out.println("Скидка: ?");
        System.out.println("Итого к оплате: ?");
    }
}