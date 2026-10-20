public class ex_05_Seller {
    public static void main(String[] args) {

        int[][] sales = {
            {12000, 9500, 11200},
            {8700, 10100, 9900}
        };
        String[] cashiers = {"Касса 1", "Касса 2"};

        for (int row = 0; row < sales.length; row++) {
            int total = 0;
            for (int col = 0; col < sales[row].length; col++) {
                total = total + sales[row][col];
            }
            System.out.println(cashiers[row] + ": " + total + " руб.");
        }
    }
}
