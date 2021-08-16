public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount julie = new BankAccount();
        BankAccount samir = new BankAccount();

        julie.accountDetails();
        julie.depositChecking(300000);
        julie.accountDetails();
        julie.depositSaving(7000000);
        julie.accountDetails();
        julie.withdrawlChecking(5000000);
        julie.withdrawlChecking(50000);
        julie.accountDetails();
        julie.withdrawlSaving(50000);
        julie.withdrawlSaving(10000000);
        julie.accountDetails();

        samir.depositSaving(7000000);
        samir.accountDetails();
        samir.withdrawlSaving(50000);
        samir.accountDetails();
        System.out.println(BankAccount.getNumOfAccts());

        samir.accountNumber();
        julie.accountNumber();
        samir.accountNumber();
    }
}
