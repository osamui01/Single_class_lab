import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BankAccountTest {

    @Test
    public void testDeposit() {
        BankAccount bankAccount = new BankAccount("Ralphael", "Obadiaru", "01-03-2001",
                12345678, 0);

        bankAccount.deposit(400);
        assertThat(bankAccount.getBalance()).isEqualTo(400);
    }

    @Test
    public void testWithdrawalSufficientFunds() {
        BankAccount bankAccount = new BankAccount("Ralphael", "Obadiaru", "01-03-2001",
                12345678, 500);

        bankAccount.withdrawal(200);
        assertThat(bankAccount.getBalance()).isEqualTo(300);
    }

    @Test
    public void testWithdrawalInsufficientFunds() {
        BankAccount bankAccount = new BankAccount("Ralphael", "Obadiaru", "01-03-2001",
                12345678, 100);

        bankAccount.withdrawal(200);
        assertThat(bankAccount.getBalance()).isEqualTo(100);
    }

    @Test
    public void testGettersAndSetters() {
        BankAccount bankAccount = new BankAccount("Ralphael", "Obadiaru", "01-03-2001",
                12345678, 0);

        assertThat(bankAccount.getFirstName()).isEqualTo("Ralphael");
        assertThat(bankAccount.getLastName()).isEqualTo("Obadiaru");
        assertThat(bankAccount.getDateOfBirth()).isEqualTo("01-03-2001");
        assertThat(bankAccount.getAccountNumber()).isEqualTo(12345678);

        bankAccount.setFirstName("Mark");
        bankAccount.setLastName("Smith");
        bankAccount.setDateOfBirth("02-04-1990");
        bankAccount.setAccountNumber(87654321);

        assertThat(bankAccount.getFirstName()).isEqualTo("Mark");
        assertThat(bankAccount.getLastName()).isEqualTo("Smith");
        assertThat(bankAccount.getDateOfBirth()).isEqualTo("02-04-1990");
        assertThat(bankAccount.getAccountNumber()).isEqualTo(87654321);
    }
}
