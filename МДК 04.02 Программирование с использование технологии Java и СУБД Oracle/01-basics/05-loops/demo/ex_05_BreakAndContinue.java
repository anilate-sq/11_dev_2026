public class ex_05_BreakAndContinue {
    public static void main(String[] args) {
        //==========
        // break и continue
        //==========

        /*
            break - оператор для остановки работы цикла
            continue - оператор для перехода на следующую итерацию в момент вызова
        */
        
        // Пример: continue
        for(int i = 0; i < 5; i++){
            if(i == 3){
                continue; // Переход на следующую итерацию, все что будет после не выполниться
            }
            System.out.println("Итерация: " + i);
        }

        // Пример: break
        for(int i = 0; i < 5; i++){
            if(i == 3){
                break; // Цикл прекратит работу
            }
            System.out.println("Итерация: " + i);
        }
 
    }
}
