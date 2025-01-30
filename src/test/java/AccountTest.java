import org.bank.Repository.TransactionRepository;
import org.bank.model.Account;
import org.bank.model.StatementPrinter;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class AccountTest {

    @Test
    public void shouldPrintStatementWithAllTransactions() {
        TransactionRepository transactionRepository = mock(TransactionRepository.class);
        StatementPrinter statementPrinter = mock(StatementPrinter.class);
        Account account = new Account(transactionRepository, statementPrinter);

        account.deposit(1000);
        account.deposit(2000);
        account.withdraw(500);
        account.printStatement();

        verify(transactionRepository).addDeposit(1000);
        verify(transactionRepository).addDeposit(2000);
        verify(transactionRepository).addWithdrawal(500);
        verify(statementPrinter).print(anyList());
    }
}
