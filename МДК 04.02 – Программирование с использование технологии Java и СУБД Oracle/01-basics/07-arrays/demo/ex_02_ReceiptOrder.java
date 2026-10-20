public class ex_02_ReceiptOrder {
   public static void main(String[] args) {
    String[] items = {"Капучино", "Чизкейк", "Круассан"};
    int[] prices = {220, 350, 180};

    System.out.println("=== Ваш заказ ===");
    int total = 0;
    for (int i = 0; i < items.length; i++) {
        System.out.println((i + 1) + ". " + items[i] + " — " + prices[i] + " руб.");
        total += prices[i]; // тоже самое что total = total + prices[i]
    }
    System.out.println("Итого: " + total + " руб.");

   } 
}
