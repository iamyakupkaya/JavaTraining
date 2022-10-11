// Java Interface Features..
// 1- Interface IS-A ilişkisi vardır.
// 2- Java 8 den sonrası için Interfacelerde default ve static method tanımlanabilir. Default method bodysi olabilir.
// 3- Java 9 dan sonrası için Interfacelerde private metod tanımlanabilir.
// 4- Class inherit from a class / class implement a interface / ALSO a interface inherit (extends) from a interface
// 5- Bir interface birden çok interface den inherit edilmiş olabilir. Yani bir interfacein atası birden çok interface olablr.
// 6- Interface içerisinde çağırılan static metodlar ınterface adı ile çağırılmalıdır.!
// 7- Interfacelerde constructor olmadığı için blank final variable olamaz. Yani bir değişkeni final olarak tanımyaıp değerini
// .. constructorda vermek istersek bu mümkün değildir.

public interface IMuhendis {
    // **************** IMPORTANT ******************
    int min=5; // bu aslında public static final int min =5; demektir.
    public static final int den=5;
    void print(); // bu aslında public abstract void print(); demektir
    public static void deneme(){ // public zorunlu değildir zaten public olarak tanımlanır. bir şey yazmazsak
        System.out.println("Say me Hello.!");
    } // eğer public olarak tanımlı bir metod tanımlayacaksak
    // bu noktada public access modefier olan metodları static yapmalıyız ki nesne oluşturamadığımız için erişebilelim.
    default void gel(){
        System.out.println("Bodyde kodlar olabilir. Default method in ınterface");
    }


}
