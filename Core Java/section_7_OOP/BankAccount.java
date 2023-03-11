package section_7_OOP;

interface Transactions {
    void withdraw(int amount);
    void deposit(int amount);
}

public class BankAccount implements Transactions {
    private final String owner;
    private int balance;

    public BankAccount(String owner) {
        this(owner, 0);
    }

    public BankAccount(String owner, int balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public String getOwner() {
        return owner;
    }

    public int getBalance() {
        return balance;
    }

    @Override
    public void withdraw(int amount) {
        if(amount <= 0 || balance < amount) {
            System.out.println("ERROR: withdraw amount should be >= 0 and less than the balance");
            return;
        }
        balance -= amount;
    }

    @Override
    public void deposit(int amount) {
        if(amount <= 0) {
            System.out.println("ERROR: withdraw amount should be >= 0");
            return;
        }
        balance += amount;
    }
}
