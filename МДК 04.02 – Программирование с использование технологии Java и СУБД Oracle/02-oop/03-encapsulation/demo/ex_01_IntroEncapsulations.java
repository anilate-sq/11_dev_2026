class BankAccount{
    private int balance; // создадим приватную переменную
    // создадим публичную функцию
    public int getBalance(){
        return this.balance;
    };
    public BankAccount(int Balance){
        this.balance = Balance;
    }
    // создадим публичную функцию
    public boolean deposit(int amount) {
        if (amount <= 0) return false;
        balance += amount;
        return true;
    }
}

public class ex_01_IntroEncapsulations{
    public static void main(String[] args) {
        BankAccount bank = new BankAccount(2000);
        System.out.println(bank.getBalance());
        System.out.println(bank.deposit(1000));
    }
}

// Инкапсуляция - один из 4 принципов ООП, базирующийся на раделении логики и управлением доступом.
