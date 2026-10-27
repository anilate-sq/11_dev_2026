class Delivery {
    protected String orderNumber;

    Delivery(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    void printInfo() {
        System.out.println("Заказ " + orderNumber);
    }
}

// TODO: создайте подкласс CourierDelivery с адресом и переопределённым printInfo

public class Main {
    public static void main(String[] args) {
        Delivery delivery = new Delivery("A-100");
        delivery.printInfo();
        // TODO: создайте и выведите курьерскую доставку
    }
}
