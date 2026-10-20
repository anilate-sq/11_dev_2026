public class ex_04_Matrix {
    public static void main(String[] args) {
        /*
            Массивы могут быть вложенными
            Уровней вложенности может быть несколько
        */

        int[][]matrix = new int[3][4];
        matrix[0][0] = 4;
        int[][]matrix2 = {
            {3,3,3},
            {3,3,3},
            {3,3,3}
        };
        System.out.println(matrix.length);
        // Вывощд матрицы
        for (int i = 0; i < matrix2.length; i++){
            for(int j = 0; j < matrix2.length; j++){
                System.out.println("[" + i + "]" + "[" + j + "] = " + matrix2[i][j]);
            }
            System.out.println();
        }
        
        for (int i = 0; i < matrix2.length; i++){
            for(int j = 0; j < matrix2.length; j++){
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println();
        }
        
    }
}
