class Product{
    private float price;
    Product(float Price){
        this.price = Price;
    }

    // Вывод цены продукта
    public float getPrice(){
        return this.price;
    }

    // Обновление цены продукта
    public void updatePrice(float newPrice){
        if (newPrice > 0){
            this.price = newPrice;
        }
    }
}

public class ex_02_ProductPrice {
    public static void main(String[] args) {
        Product product = new Product(2000);
        System.out.println("Текущая стоимость: " + product.getPrice());
        product.updatePrice(2200);
        System.out.println("Обновленная стоимость: " + product.getPrice());
    }
}