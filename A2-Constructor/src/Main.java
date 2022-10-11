public class Main {
    public static void main(String[] args) {
        // create a object from Account
        Account account1 = new Account("Yakup", "KAYA", 12.45, (short) 45);
        System.out.println(account1.getName());
        account1.setName("Yeni isim");
        System.out.println(account1.getName());
        System.out.println("--------------------------------");
        Account account2 = new Account();
        System.out.println(account2.getName());

    }
}