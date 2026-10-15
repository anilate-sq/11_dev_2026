public class ex_01_IntroFunction {
    public static void main(String[] args) {
        // Метод - именованный блок кода, к которому можно обращаться по имени

        /* 
            Базовый синтаксис
            public static типВозврата имяМетода(тип параметр1, тип параметр2) {
                // тело метода
                return значение;
            }
                
            Вызов метода
            имяМетода(аргумент1, аргумент2);
        */

        int a = 10, b = 12;
        // Пример: вызов метода sum()
        System.out.println(sum(2, 2));
        System.out.println(sum(4, 14));
        System.out.println(sum(-10, 8));
        System.out.println(sum(a, b));
    }

    // Создадим метод для суммы 2 чисел
    public static int sum(int a, int b){
        return a + b; // Возвращаем сумму двух чисел
    }

}
