class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        // Намеренная логическая ошибка для разбора у доски:
        name = name;
        age = age;
    }

    public void showInfo() {
        System.out.println(name + ", " + age);
    }
}

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Alex", 18);
        student.showInfo(); // Почему выводится "null, 0"?

        // Задание: исправьте конструктор, присваивая параметры полям объекта.
        // Ожидаемый вывод после исправления: Alex, 18
    }
}
