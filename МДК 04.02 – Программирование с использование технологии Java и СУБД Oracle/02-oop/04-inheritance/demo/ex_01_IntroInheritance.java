// Наследование - принцип ООП, базирующийся на передаче свойств родительского класса дочернему

// Родительский класс с базовыми настройками
class Payment {
    protected double amount;
    Payment(double amount ) { this.amount = amount; }
    void pay() { System.out.println("Оплата: " + amount); }
}
class CardPayment extends Payment {
    CardPayment(double amount) { super(amount); }
    // Переопределение метода
    @Override void pay() { System.out.println("Оплата картой: " + amount); }
}

class ex_01_IntroInheritance{
    public static void main(String[] args) {
        // Создадим родительский класс
        Payment payment = new Payment(200);
        payment.pay();
        // Создадим дочерний класс
        CardPayment cardPayment = new CardPayment(300);
        cardPayment.pay();
    }
}