public class Bank {

    public static void main(String[] args) {
        bankAccount();

    }

    public static void bankAccount() {

        BankAccount bankAccount = new BankAccount("Ralphael", "Obadiaru", "01-03-2001",
                12345678, 0);

        bankAccount.deposit(400);
        int balance = bankAccount.getBalance();

        bankAccount.withdrawal(200);
        int newBalance = bankAccount.getBalance();

    }
}
