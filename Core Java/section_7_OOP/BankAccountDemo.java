package section_7_OOP;

public class BankAccountDemo {

    public static void main(String[] args) {
        BankAccount Account_1 = new BankAccount("john Baugh", 5000);
        BankAccount Account_2 = new BankAccount("Bob Robinson");

        Account_2.deposit(500); // deposit 500 into Account_1
        System.out.println("owner : " + Account_2.getOwner());
        System.out.println("balance : " + Account_2.getBalance());
        System.out.println();

        Account_2.withdraw(1000); // warning
        System.out.println("owner : " + Account_2.getOwner());
        System.out.println("balance : " + Account_2.getBalance());
        System.out.println();


        System.out.println("Deposit 1000?");
        Account_1.deposit(1000); // depositing 1000 into Account_2
        System.out.println("owner: " + Account_1.getOwner());
        System.out.println("balance: " + Account_1.getBalance());
        System.out.println();
    }

}

