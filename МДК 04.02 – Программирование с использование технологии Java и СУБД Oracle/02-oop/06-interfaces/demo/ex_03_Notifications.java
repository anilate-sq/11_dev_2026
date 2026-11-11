interface Notifier{
    void send(String message, String date);
}

class Email implements Notifier{
    public void send(String message, String date){
        System.out.println("Уведомление на почту от " + date + ":\n" + message);
    }
}

class SMS implements Notifier{
    public void send(String message, String date){
        System.out.println("Уведомление на почту от " + date + ":\n" + message);
    }
}

public class ex_03_Notifications {
    public static void main(String[] args) {
        Email email = new Email();
        SMS sms = new SMS();
        email.send("Нужно исправить баг в корзине", "18.03.2022");
        sms.send("Купи молоко", "20.03.2022");
    }
}