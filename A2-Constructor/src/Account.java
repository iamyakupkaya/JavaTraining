public class Account {
    private String name;
    private String surname;
    private double balance;
    private short age;

    // Account Constructor without Parameters
    public Account(){
        /*
        Method-1
        // if user use default constructor and no entry information. İn this fact we can add some default values.
        this.name="No Information";
        this.surname="No Information";
        this.balance=0.0;
        this.age=0;
         */
        // Method-2
        // call our the constructor which has parameters.
        this("No Information", "No Information", 0.0, (short) 0);


    }

    // Account Constructor with some Parameters.
    public Account(String name, String surname){
        this(name, surname, 0.0, (short)0);
    }

    // Account constructor with Parameters
    public Account(String name, String surname, double balance, short age){
        System.out.println("We are in constructor.!");
        this.name=name;
        this.surname=surname;
        this.balance=balance;
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public short getAge() {
        return age;
    }

    public void setAge(short age) {
        this.age = age;
    }
}
