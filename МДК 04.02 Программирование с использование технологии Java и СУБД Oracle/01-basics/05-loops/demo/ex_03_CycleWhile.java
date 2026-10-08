public class ex_03_CycleWhile {
    public static void main(String[] args) {
        //==========
        // While
        //==========

        /*
            Синтаксис:
                while(<условие>){
                    // тело цикла/программный код        
                }
        */

        // Пример: вывод итераций
        int i = 0;
        while(i < 10){
            System.out.println("Итерации: " + i);
            i++; // Увеличиваем i на 1
        }

        // Пример: бесконечный цикл
        while(true){
            System.out.println("Я буду жить вечно");
        }
    }
}