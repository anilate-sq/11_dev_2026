interface Printable {
    void print();
}

class Invoice implements Printable {
    @Override
    public void print() {
        // TODO: вывести данные счёта
    }
}

class ShippingLabel implements Printable {
    @Override
    public void print() {
        // TODO: вывести данные доставки
    }
}

public class Main {
    public static void main(String[] args) {
        Printable[] documents = { new Invoice(), new ShippingLabel() };
        // TODO: вызовите print для каждого документа одним циклом
    }
}
