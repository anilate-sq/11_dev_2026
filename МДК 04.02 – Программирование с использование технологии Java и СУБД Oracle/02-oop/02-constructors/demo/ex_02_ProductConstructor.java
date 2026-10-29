public class ex_02_ProductConstructor {
    public static void main(String[] args) {
        Product tea = new Product("Чай", 120.0);
        System.out.println("Название: " + tea.name + "\nЦена: " + tea.price);
        
    }
}

// Класс Product
class Product {
    String name; // на эту переменную ссылается this
    double price; // на эту переменную ссылается this
    
    // Конструктор
    Product(String name, double price) {
        // this - ссылка на текущий объект
        this.name = name;
        this.price = price;
    }
}
