package gr.aueb.cf.cf9.ch12;

public class Main {

    public static void main(String[] args) {
        Account aliceWAccount = new Account(1L, "GR12345", "Alice", "W.", "A12345", 100);

        try {
            aliceWAccount.deposit(500);
            System.out.println(aliceWAccount.accountToString());

            aliceWAccount.withdraw(100, "A12345");
            System.out.println(aliceWAccount.accountToString());

            aliceWAccount.withdraw(100, "A1234567899");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
