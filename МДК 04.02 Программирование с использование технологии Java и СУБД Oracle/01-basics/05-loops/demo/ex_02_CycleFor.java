public class ex_02_CycleFor {
    public static void main(String[] args) {
        //==========
        // for
        //==========
        
        /*
            Синтаксис:
            for(int i = <начальное значение>; <условие>; <шаг>){
                тело цикла/программный код
            }
        */

        // Пример: вывод итераций
        for(int i = 0; i < 10; i++){
            System.out.println("Итерация: " + i);
        }
        
        System.out.println();

        // Пример: обратный отсчет
        for(int i = 9; i >= 0; i--){
            System.out.println("Итерация: " + i);
        }

        System.out.println();

        // Пример: вывод четных чисел в диапозоне от 2 до 80
        for(int i = 2; i < 80; i+=2){ // i = i + 2
            System.out.println("Число: " + i);
        }
    }
}
