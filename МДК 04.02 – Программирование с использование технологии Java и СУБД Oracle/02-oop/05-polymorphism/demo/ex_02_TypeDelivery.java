class Delivery{
    protected String date;
    Delivery(String date){
        this.date = date;
    }

    void delivery(){
        System.out.println("Доставим товар " + date);
    }
}

class CourierDelivery extends Delivery{
    CourierDelivery(String date){
        super(date);
    }

    @Override void delivery(){
        System.out.println("Товар доставит курьер " + date);
    }
}

class PostalDelivery extends Delivery{
    PostalDelivery(String date){
        super(date);
    }

    @Override void delivery(){
        System.out.println("Доставим товар почтой " + date);
    }
}


public class ex_02_TypeDelivery {
    public static void main(String[] args) {
        Delivery[] delivs = {new CourierDelivery("10.11.2026"), new PostalDelivery("11.11.2026")};
        for (Delivery deliv : delivs){
            deliv.delivery();
        }
        
    }
}
