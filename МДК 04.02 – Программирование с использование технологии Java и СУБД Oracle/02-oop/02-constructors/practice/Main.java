class Order {
    int number;
    String customer;
    double total;

    // TODO: добавьте конструктор с номером, клиентом и стоимостью

    // TODO: добавьте перегруженный конструктор без стоимости

    void printInfo() {
        System.out.println("Заказ №" + number + ", " + customer + ", " + total + " руб.");
    }
}

public class Main {
    public static void main(String[] args) {
        // TODO: создайте заказы обоими конструкторами и выведите их
    }
}
