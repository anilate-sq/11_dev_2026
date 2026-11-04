class BankAccount{
    private int balance; // создадим приватную переменную
    // создадим публичную функцию
    public int getBalance(){
        return this.balance;
    };

    public BankAccount(int Balance){
        this.balance = Balance;
    }

    // создадим публичную функцию / пополение баланса
    public boolean deposit(int amount) {
        if (amount <= 0) return false;
        balance += amount;
        return true;
    }
    // снять деньги со счета
    public boolean withdraw(int cash){
        if(cash < this.balance){
            this.balance -= cash;
            return true;
        }
        return false;
    }
}

public class ex_03_BankAccount {
   public static void main(String[] args) {
    
   } 
}
