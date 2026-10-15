public class ex_03_CheckAge {

    // Метод проверяет, достаточно ли возраста
    public static boolean isAdult(int age) {
        return age >= 18;
    }
    public static void main(String[] args) {
        int age = 17;
        if (isAdult(age)) {
            System.out.println("Доступ разрешён");
        } else {
            System.out.println("Доступ ограничен");
        }
    }
}
