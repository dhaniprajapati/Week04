package junit;

import com.junit.BankAccount;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {
    private BankAccount bankAccount;

    @BeforeEach
    public void setUp() {
        bankAccount = new BankAccount(1000);
    }

    @Test
    public void testDeposit() {
        bankAccount.deposit(500);
        assertEquals(1500, bankAccount.getBalance());
    }

    @Test
    public void testWithdraw() {
        bankAccount.withdraw(300);
        assertEquals(700, bankAccount.getBalance());
    }

    @Test
    public void testWithdrawInsufficientFunds() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            bankAccount.withdraw(1500);
        });
        assertEquals("insufficient funds", exception.getMessage());
    }

    @Test
    public void testGetBalance() {
        assertEquals(1000, bankAccount.getBalance());
    }
}
