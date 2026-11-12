// Родительский класс
class Payment{
    protected int amount;
    Payment(int amount){
        this.amount = amount;
    }

void info(){
        System.out.println("Оплата: " + amount);
    }
}

// Дочерний класс
class CardPayment extends Payment{
    CardPayment(int amount){
        super(amount);
    }

    @Override void info(){
        System.out.println("Способ оплаты: по карте" + "\nСумма оплаты: " + amount);
    }
}

// Дочерний класс
class CashPayment extends Payment{
    CashPayment(int amount){
        super(amount);
    }

    @Override void info(){
        System.out.println("Способ оплаты: наличными" + "\nСумма оплаты: " + amount);
    }
}


public class ex_01_IntoPolymorphism {
    public static void main(String[] args) {
        Payment[] payment = {new CardPayment(2000), new CashPayment(1500)}; // Полиморфизм
        for (Payment item : payment){
            item.info();
        }
        payment[0].info();
    }
}
