public class Main {
    public static void main(String[] args) {
        AccountManager accountManager = new AccountManager();

        accountManager.deposit(100);
        accountManager.printBalance();
        try {
            accountManager.withdraw(900);
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }

        

    }
}