class BankAccount {
    private int balance;

    BankAccount(int balance) {
        this.balance = balance;
    }

    boolean deposit(int amount) {
        // TODO: проверить сумму и пополнить баланс
        return false;
    }

    boolean withdraw(int amount) {
        // TODO: проверить сумму и доступный баланс
        return false;
    }

    int getBalance() { return balance; }
}

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);
        // TODO: проверьте успешные и отклонённые операции
        System.out.println(account.getBalance());
    }
}
