public class ex_03_Switch {
    public static void main(String[] args) {
        /*
            switch - переключатель
            case - кейс
            default - по умолчанию(выполняется в случае, если ни один из кейсов не сработал)
            
            Синтаксис:
            switch(<значение>){
                case <значение>: 
                <тело_кейса> - код
                break; - нужно чтобы операция не зациклиласьы
                default:
                код, который выполниться в случае если не один из кейсов не подойдет
            }
        */

        int choice = 2;
        switch (choice) {
            case 1:
                System.out.println("Выбрано: чай");
                break;
            case 2:
                System.out.println("Выбрано: кофе");
                break;
            default:
                System.out.println("Не знаю такого пункта");
        }        
    }
}
