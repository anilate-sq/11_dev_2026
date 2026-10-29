public class ex_03_CreateOrder {
    public static void main(String[] args) {
        Order order = new Order(125, "ivan@gmail.com");
        order.printInfo();
    }
}

class Order {
    int number;
    String customer;
    Order(int number, String customer) { this.number = number; this.customer = customer; }
    void printInfo(){
        System.out.println("Заказ №" + this.number + " для " + this.customer);
    }
}
