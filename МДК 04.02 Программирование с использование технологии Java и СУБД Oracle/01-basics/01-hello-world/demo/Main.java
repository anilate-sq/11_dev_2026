public class Main {
    public static void main(String[] args) {
        System.out.println("Привет, мир!");

        if (args.length > 0) {
            System.out.println("Привет, " + args[0] + "!");
        }
    }
}