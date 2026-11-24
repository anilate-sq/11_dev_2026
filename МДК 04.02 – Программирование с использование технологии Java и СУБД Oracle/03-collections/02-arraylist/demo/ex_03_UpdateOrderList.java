import java.util.ArrayList;

class ex_03_UpdateOrderList{
    public static void main(String[] args) {
        ArrayList<String> orders = new ArrayList<>();
        orders.add("Заказ #104");
        orders.add("Заказ #105");
        orders.add("Заказ #106");

        orders.set(1, "Заказ #105 - оплачен");
        orders.remove(0);
        
        for (String order : orders){
            System.out.println(order);
        }
    }
}