class BankAccount {
    private final String owner;
    private double balance;

    public BankAccount(String owner, double balance) {
        if (owner == null || owner.isBlank()) {
            throw new IllegalArgumentException("Имя владельца не может быть пустым");
        }
        if (!Double.isFinite(balance) || balance < 0) {
            throw new IllegalArgumentException("Начальный баланс должен быть неотрицательным");
        }
        this.owner = owner;
        this.balance = balance;
    }

    public boolean deposit(double amount) {
        if (!Double.isFinite(amount) || amount <= 0) {
            return false;
        }
        balance += amount;
        return true;
    }

    public boolean withdraw(double amount) {
        if (!Double.isFinite(amount) || amount <= 0 || amount > balance) {
            return false;
        }
        balance -= amount;
        return true;
    }

    public void showInfo() {
        System.out.printf("Владелец: %s | Баланс: %.2f%n", owner, balance);
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount first = new BankAccount("Андрей", 5000);
        BankAccount second = new BankAccount("Алексей", 1000);

        first.showInfo();
        System.out.println("Пополнение на 2000: " + first.deposit(2000));
        System.out.println("Снятие 1500: " + first.withdraw(1500));
        first.showInfo();

        System.out.println("Снятие 10000: " + first.withdraw(10000));
        System.out.println("Пополнение -100: " + first.deposit(-100));
        first.showInfo();

        second.showInfo();
        System.out.println("Пополнение на 500: " + second.deposit(500));
        second.showInfo();
    }
}
