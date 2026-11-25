import java.util.HashSet;
import java.util.Set;

public class ex_03_CheckEmail {
    public static void main(String[] args) {
        Set<String> registeredEmails = new HashSet<>();
        registeredEmails.add("alex@example.com");
        registeredEmails.add("maria@example.com");

        String newEmail = "nikolay@example.com";
        if (registeredEmails.add(newEmail)) {
            System.out.println("Адрес зарегистрирован");
        } else {
            System.out.println("Этот адрес уже используется");
        }
    }
}
