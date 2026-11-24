import java.util.ArrayList;

public class ex_01_IntroArrayList {
    public static void main(String[] args) {
        ArrayList<String> tasks = new ArrayList<>();
        
        /*
            Ключевые операции:
            1. add() - добавление элемента;
            2. get() - получение элемента по индексу;
            3. set() - обновить элемент по индексу;
            4. remove() - удаление элемента по индексу;
            5. size() - количество элементов массива.
        */
        
        // Добавляем несколько задач
        tasks.add("Отправить письмо"); // 0
        tasks.add("Подготовить отчет"); // 1

        String firstTask = tasks.get(0);
        // System.out.println(tasks[0]); так не будет работать
        tasks.set(0, "Переотправить письмо");
        System.out.println("Первая задача: " + firstTask);
        System.out.println("Обновленный список задач" + tasks);
        tasks.remove(1);
        System.out.println("Количество элементов после удаления: " + tasks.size());
    }
}
