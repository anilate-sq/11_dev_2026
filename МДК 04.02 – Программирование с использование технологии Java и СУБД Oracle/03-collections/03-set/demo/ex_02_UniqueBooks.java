import java.util.HashSet;
import java.util.Set;

public class ex_02_UniqueBooks {
    public static void main(String[] args) {
        Set<String> categories = new HashSet<>();
        categories.add("Книги");
        categories.add("Техника");
        categories.add("Книги");
        // categories.remove("Техника"); удаляем по названию

        System.out.println("Уникальных категорий: " + categories.size());
        for (String category : categories) {
            System.out.println(category);
        }
    }
}