public class ex_02_CalculateTotal{

    // Метод для расчёта суммы
    public static double calculateSum(double price, int quantity) {
        return price * quantity;
    }

   public static void main(String[] args) {
        double price = 250.0;
        int quantity = 2;
        double sum = calculateSum(price, quantity);
        System.out.println("Сумма заказа: " + sum + " руб.");
   } 
}
