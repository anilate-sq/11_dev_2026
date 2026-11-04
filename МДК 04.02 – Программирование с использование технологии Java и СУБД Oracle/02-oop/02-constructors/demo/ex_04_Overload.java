public class ex_04_Overload {
    public static void main(String[] args) {
        Label label1 = new Label();
        Label label2 = new Label("Метка 2");

    }
}

class Label{
    Label(){
        this("Пустой текст");
    }

    Label(String name){
        System.out.println(name);
    }
}