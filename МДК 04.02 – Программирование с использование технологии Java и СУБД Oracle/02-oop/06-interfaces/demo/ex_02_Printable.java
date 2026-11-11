interface Printable {
    void print(String content);
    void send();
}

class Invoice{
    public void print(String content){
        System.out.println("Выписка по счету\n" + content);
    }

    public void send(){
        System.out.println("Выписка отправлена");
    }
}

class Label{
    public void print(String content){
        System.out.println("Открытка\n" + content);
    }
    public void send(){
        System.out.println("Открытка отправлена");
    }
}

public class ex_02_Printable {
    public static void main(String[] args) {
        Invoice invoice = new Invoice();
        Label label = new Label();
        invoice.print("Общие траты 42 032 руб.");
        invoice.send();
        label.print("С днем рождения!");
        label.send();
    }
}
