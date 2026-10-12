

public class Account {

    private String name;
    private int balance;

    public Account(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        if (amount <=0) {
            System.out.println("Medges ej");
        } else {
            balance += amount;
            System.out.println("Godkänt " + " Saldo: " + balance);
        }
    }

    public void withdraw(int amount) {
        if (amount <= 0 || amount > balance) {
            System.out.println("Medges ej");
        } else {
            balance -= amount;
            System.out.println("Godkänt! Saldo: " + balance);
        }
    }
}
