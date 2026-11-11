interface Payable {
    void pay(double amount);
}

class Card implements Payable{
    public void pay(double amount){
        System.out.println("Оплата картой: " + amount);
    }
}

class Cash implements Payable{
    public void pay(double amount){
        System.out.println("Оплата наличными: " + amount);
    }
}

class ex_01_IntroIntercace{
    public static void main(String[] args) {
        Card card = new Card();
        Cash cash = new Cash();
        card.pay(2000);
        cash.pay(1400);
    }
}