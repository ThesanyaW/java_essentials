package objects;

public record Account(
        int id,
        String name,
        double balance
) {

    public static void main(String[] args){

        Account account = new Account(2233, "Thesanya", 2000.50);
        System.out.println(account);

        double balance = account.balance();
        System.out.println(balance);
    }
}