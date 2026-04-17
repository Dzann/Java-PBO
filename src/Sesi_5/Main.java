package Sesi_5;

public class Main {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(500000, "1234567890", "John Doe");
        System.out.println(account1);

        account1.deposit(200000);
        System.out.println("Setelah deposit: " + account1);

        account1.withdraw(150000);
        System.out.println("Setelah penarikan: " + account1);

        account1.withdraw(600000); // Penarikan melebihi saldo
    }
}
