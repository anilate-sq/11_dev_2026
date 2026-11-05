class Delivery{
    protected int orderId;
    protected String orderDesc;
    Delivery(int orderId, String orderDesc){
        this.orderId = orderId;
        this.orderDesc = orderDesc;
    }
    void printInfo(){
        System.out.println("Заказ №" + orderId + "\nОписание заказа: " + orderDesc);
    }
}

class CourierDelivery extends Delivery{
    private String address;
    CourierDelivery(int orderId, String orderDesc, String address){
        super(orderId, orderDesc);
        this.address = address;
    }
    @Override void printInfo(){
        System.out.println("Заказ №" + orderId + "\nОписание заказа: " + orderDesc + "\nАдрес Доставки: " + address);
    }
}


public class ex_03_Delivery {
   public static void main(String[] args) {
        Delivery delivery = new Delivery(25, "Магнитная клавиатура и беспроводные наушники");
        delivery.printInfo();
        CourierDelivery courierDelivery = new CourierDelivery(12, "Айрогриль", "ул. Ленина 6");
        courierDelivery.printInfo();
   } 
}
