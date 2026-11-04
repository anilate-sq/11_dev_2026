class Delivery {
    protected String orderNumber;

    Delivery(String orderNumber) { this.orderNumber = orderNumber; }

    double calculateCost() {
        return 0;
    }
}

class CourierDelivery extends Delivery {
    CourierDelivery(String orderNumber) { super(orderNumber); }
    // TODO: переопределите calculateCost
}

class ParcelDelivery extends Delivery {
    ParcelDelivery(String orderNumber) { super(orderNumber); }
    // TODO: переопределите calculateCost
}

public class Main {
    public static void main(String[] args) {
        Delivery[] deliveries = {
            new CourierDelivery("A-100"), new ParcelDelivery("B-200")
        };
        // TODO: одним циклом выведите номер заказа и стоимость доставки
    }
}
