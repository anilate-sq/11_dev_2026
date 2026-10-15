public class ex_04_PrintReceipt {

    // Расчет стоимость
    public static double calculateTotal(double price, int quantity) {
        return price * quantity;
    }

    // Вывод чека заказа
    public static void printReceipt(String itemName, double price, int quantity, double total) {
        System.out.println("Чек заказа:");
        System.out.println(itemName + " x " + quantity);
        System.out.println("Цена за 1 шт.: " + price + " руб.");
        System.out.println("Итого: " + total + " руб.");
    }
    public static void main(String[] args) {
        String itemName = "Чизбургер";
        double price = 1250.0;
        int quantity = 2;
        double total = calculateTotal(price, quantity);
        printReceipt(itemName, price, quantity, total);
    }
}
