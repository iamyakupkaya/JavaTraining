public class Calisan {
     String name;
     String surname;
     int salary;

    public Calisan(String name, String surname, int salary){
        this.name=name;
        this.surname=surname;
        this.salary=salary;
        System.out.println("this-2 " + this);

    }

    public void BilgileriGoster(){
        System.out.println("Name: " + name);
        System.out.println("surname: " + surname);
        System.out.println("salary: " + salary);
    }

}
