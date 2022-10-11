// The final keyword in java is used to restrict(kısıtlamak) the user. The java final keyword can be used in many context. Final can be:
//
//variable
//method
//class

// final keyword --> stop value change, stop method overriding, stop inheritance. STOP OVI (overriding, ValueChange, Inheritance)

// Java Final Variable
// The final keyword can be applied with the variables, a final variable that have no value it is called blank final variable
// or uninitialized final variable. It can be initialized in the constructor only.
// The blank final variable can be static also which will be initialized in the static block only.
// If you make any variable as final, you cannot change the value of final variable(It will be constant)
// final variable once assigned a value can never be changed. Değiştirmeye çalışırsak hata verir.!

// JAVA Final Method
// If you make any method as final, you cannot override it. Tabii overridding için de inheritance gerekli

// JAVA Final Class
// If you make any class as final, you cannot extend it. Hata verir

// Is final method inherited?
//Ans) Yes, final method is inherited but you cannot override it. Final olan metodlar alt sınıflara inherit edilir
// .. ama alt sınıflarda override edilemezler.!
// constructorlar da final keywordu kullanılmaz.
// metodun aldığı parametreyi final olarak tanımlarsn onu değiştiremezsin

// A static final variable that is not initialized at the time of declaration is known as static blank final variable.
// It can be initialized only in static block.! Çünkü hem static hem de finaldır.
/*
class A{
  static final int data;//static blank final variable
  static{ data=50;} static block
  public static void main(String args[]){
    System.out.println(A.data);
 }
}
 */


//  Can we initialize blank final variable?
//Yes, but only in constructor. For example:
//What is blank or uninitialized final variable?
//A final variable that is not initialized at the time of declaration is known as blank final variable.
//
//If you want to create a variable that is initialized at the time of creating object and once initialized may not be changed,
// it is useful. For example PAN CARD number of an employee.
//
//It can be initialized only in constructor.

/*

class Bike10{
  final int speedlimit;//blank final variable

  Bike10(){
  speedlimit=70;
  System.out.println(speedlimit);
  }

  public static void main(String args[]){
    new Bike10();
 }
}
 */




public class Main {
    public static final int deneme;
    public static String oku="aaa";
    public void yazBakalim(){
        oku="Oldu mu";
        System.out.println("Static değişkeni non-static alanda kullanmak." + oku);
    }
    static {
        deneme=45;
    } // static final değikenler sadece ve sadece static bloğunda initinalize edilebilir eğer ilk değer verilmediyse.
    // ama sadece final olan değişkenler constructor içerisinde initialiaze edilebilir.
    public static void main(String[] args) {
        oku="ss";
        System.out.println(oku);
        Main obje = new Main();
        obje.yazBakalim();
    }
}