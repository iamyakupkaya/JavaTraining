// 1- There are two types of modifiers in Java: access modifiers and non-access modifiers.
/*
There are four types of Java access modifiers:

Private: The access level of a private modifier is only within the class. It cannot be accessed from outside the class.
Default: The access level of a default modifier is only within the package. It cannot be accessed from outside the package.
... If you do not specify any access level, it will be the default.
Protected: The access level of a protected modifier is within the package and outside the package through child class.
... If you do not make the child class, it cannot be accessed from outside the package.
Public: The access level of a public modifier is everywhere. It can be accessed from within the class, outside the class,
 ... within the package and outside the package.
 */

// 3- There are many non-access modifiers, such as static, abstract, synchronized, native, volatile, transient, etc.
// 4- ÖNEMLİ If you make any class constructor private, you cannot create the instance of that class from outside the class.
// 5- Note: A class cannot be private or protected except nested class.
// 6- DEFAULT...
// ... If you don't use any modifier, it is treated as default by default. The default modifier is accessible only within package.
// ... It cannot be accessed from outside the package. It provides more accessibility than private.
// ... But, it is more restrictive than protected, and public.
// PROTECTED...
// The protected access modifier is accessible within package and outside the package but through inheritance only.
// The protected access modifier can be applied on the data member, method and constructor. It can't be applied on the class.
// Java Access Modifiers with Method Overriding
// If you are overriding any method, overridden method (i.e. declared in subclass) must not be more restrictive from method of superclass
// Eğer üst sınıfın metodu protected ise alt sınıfta bir metod overrigin yapılacaksa bu metodun access belirleyicisi
// ... üst sınıfın belirleyicisinden daha katı olamaz. Daha geniş olmalı
// Private --> Default --> Protected --> Public

// SINIF DÜZEYİNDE ERİŞİM BELİRLEYİCİLER
// Sınıflar sadece public ve ya default olarak belirlenebilir ki eğer bir şey belirtmezsek bu zaten default olur.
// Sınıflar (Inner classlar hariç) Protected ya da private olarak tanımlanamazlar..!
// ÖNEMLİ.. Metod içerisindeki değişkenlere access modifier eklenmez. Bunlar local değişkenlerdir.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}