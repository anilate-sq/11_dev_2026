public class ex_01_IntroArrays {
    public static void main(String[] args){
        /*
            Массив - упорядоченная колекция однотипных элементов
            Массив имеет фиксированное количество элементов

            Синтаксис:
            <тип_данных>[] <название_переменной> = new <тип_данных>[<количество_элементов>]
        */
        
        // Создадим массив
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;

        System.out.println(arr[3]); // Вывод конкретного массива

        int[] arr2 = {1, 2, 3}; // быстрое создание
        
        // Проход циклом по массиву
        // length - получение длины массива(количества элементов)
        System.out.println(arr2);
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
