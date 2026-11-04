public class ex_02_Products {
    public static void main(String[] args) {
        Product productTea = new Product();
        productTea.name = "Чай";
        productTea.price = 120.0;
        productTea.printInfo();

        Product productCoffee = new Product();
        productCoffee.name = "Кофе";
        productCoffee.price = 200.00;
        productCoffee.printInfo();
    }
}

class Product{
    String name; // Характеристика 1 - название
    double price; // Характеристика 2 - цена

    // Метод для получения информации о товаре
    void printInfo() {
        System.out.println(name + ": " + price);
    }
}