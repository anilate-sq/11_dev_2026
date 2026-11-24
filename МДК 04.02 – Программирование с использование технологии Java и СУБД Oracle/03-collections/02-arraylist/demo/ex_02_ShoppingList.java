import java.util.ArrayList;

public class ex_02_ShoppingList {
    public static void main(String[] args) {
        ArrayList<String> shoppingList = new ArrayList<>();
        shoppingList.add("Хлеб");
        shoppingList.add("Молоко");
        shoppingList.add("Яблоки");

        for (int i = 0; i < shoppingList.size(); i++){
            System.out.println((i+1) + ". " + shoppingList.get(i));
        }
    }    
}
