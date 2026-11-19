
public class ex_02_Arrays {
    public static void main(String[] args) {
        int[] quantities = {4, 7, 2};
        int[] scores = new int[5];

        for (int i = 0; i < quantities.length; i++) {
            System.out.println("Элемент " + i + ": " + quantities[i]);
        }

        for (int score : scores) {
            System.out.println(score);
        }

        int random = (int)Math.random();
        int randomInt = 1 + (int)(Math.random() * (10 - 1 + 1)); // Формула min + Math.random() * (max - min + min)
        System.out.println("Рандомное число: " + Math.floor(random) + "Рандомное число от 1 до 10" + randomInt );

    }    
}
