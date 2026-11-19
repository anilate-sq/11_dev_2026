public class ex_04_Temperature {
    public static void main(String[] args) {
        int[] temperatures = {18, 21, 16, 19, 23, 15};
        int minimum = temperatures[0];

        for (int i = 1; i < temperatures.length; i++) {
            if (temperatures[i] < minimum) {
                minimum = temperatures[i];
            }
        }
        System.out.println("Минимальная температура: " + minimum);

    }
}
