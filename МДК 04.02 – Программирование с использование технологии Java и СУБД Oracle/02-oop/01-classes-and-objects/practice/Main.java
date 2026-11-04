class Product {
    String name;
    double price;
    int stock;

    void printInfo() {
        // TODO: вывести название, цену и остаток
    }

    void sell(int quantity) {
        // TODO: уменьшить stock, если товара достаточно
    }
}

public class Main {
    public static void main(String[] args) {
        Product first = new Product();
        first.name = "Товар";
        first.price = 100;
        first.stock = 5;
        first.printInfo();
        first.sell(2);
        first.printInfo();
    }
}
