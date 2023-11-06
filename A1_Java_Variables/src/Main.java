/*
** = ÖNEMLİ
*
* ÖNEMLİ NOTLAR:
* ınstance block constructordan önce çalışır.!
* Static block instance block ve constructordan önce çalışır.!
* Instance değişkenler nesne yaratılmadan var olmazlar bu yüzden kullanılamazlar asla.! Anca bir nesne yaratıldığında o
* nesnenin sınıfının instance değişkenleri var olabilir.!

* static block çalışır > instance block çalışır > constructor çalışır

Types of Variables in Java;
        1-Local Variables
        2-Instance Variables
        3-Static Variables


1. Local Variables;
--> Local variables are declared in methods, constructors, or blocks
--> Local değişkenler methodlar, constructorlar ve blocklar çalıştığında yaratılır çalışmaları bittiğinde yok edilir.
--> Access modifiers cannot be used for local variables. (No private, public etc. )
--> Local variables are visible only within the declared method, constructor, or block. (Başka yerden ulaşılamazlar)...
... sadece tanımlandıkları block, constructor ve method içerisinde ulaşılabilirlerdir.
--> Local variables are implemented at stack level internally. ( Local değişkenler Yığında tutulurlar)
--> There is no default value for local variables, so local variables should be declared and an initial value should be assigned before the first use...
... Local değişkenlerin default değerleri yoktur (int için 0 gibi) bu nedenle kullanılmadan önce deklare edilmesi ve ilk değerinin atanması gerekir.


2. Instance Variables;
--> Instance variables are declared in a class, but outside a method, constructor or any block.
--> Instance variables can be accessed only by creating objects. (Çünkü static keyword almazlar)
--> When a space is allocated for an object in the heap, a slot for each instance variable value is created...
... Bir sınıftan new keywordu ile bir obje yaratıldığında o obje ile birlikte tüm instance variable değerleri heap içerisinde yaratılır.
--> Instance variables are created when an object is created with the use of the keyword 'new' and destroyed when the object is destroyed.
--> Instance variables, birden fazla method, constructor veya blok tarafından başvurulması gereken değerleri...
... veya bir nesnenin durumunun sınıf boyunca mevcut olması gereken temel parçalarını tutar.
--> Instance variables can be declared in class level before or after use.
--> ** Access modifiers can be given for instance variables. (private public etc. )
--> The instance variables are visible for all methods, constructors and block in the class. Normally,
* it is recommended to make these variables private (access level)...
*  However, visibility for subclasses can be given for these variables with the use of access modifiers.
--> Instance variables have default values. For numbers, the default value is 0, for Booleans it is false, and for object references it is null.
* Values can be assigned during the declaration or within the constructor. We initialize instance variables using constructors while creating an object.
* We can also use instance blocks to initialize the instance variables.
--> Bir nesne yaratıldığında bu değişkenler heap te yaratılır. ve Instance bloğunda değerleri atanabilir.!
--> Instance variables can be accessed directly by calling the variable name inside the class. However,
* within static methods (when instance variables are given accessibility), they should be called using the fully qualified name. ObjectReference.VariableName.


3. Class / Static Variables;
--> Static variables are also known as class variables.
--> These variables are declared similarly to instance variables.
* The difference is that static variables are declared using the static keyword within a class outside of any method, constructor, or block.
* Static variables are rarely used other than being declared as constants. Constants are variables that are declared as public/private, final, and static.
* Default values are same as instance variables. For numbers, the default value is 0; for Booleans, it is false; and for object references, it is null.
* Values can be assigned during the declaration or within the constructor.
** Additionally, values can be assigned in special static initializer blocks.
* Constant variables never change from their initial value.
--> Static variables are stored in the static memory. It is rare to use static variables other than declared final and used as either public or private constants.
* Static variables are created when the program starts and destroyed when the program stops.
--> Visibility is similar to instance variables. However, most static variables are declared public since they must be available for users of the class.
--> Unlike instance variables, we can only have one copy of a static variable per class, irrespective of how many objects we create.
* (irrespective of how many objects we create. = kaç tane nesne oluşturduğumuza bakılmaksızın) (irrespective = ne olursa olsun )
--> Static variables are created at the start of program execution and destroyed automatically when execution ends.
--> Initialization of a static variable is not mandatory. Its default value is dependent on the data type of variable.
* For String it is null, for float it is 0.0f, for int it is 0, for Wrapper classes like Integer it is null, etc.
--> If we access a static variable like an instance variable (through an object), the compiler will show a warning message,
* which won’t halt the program. The compiler will replace the object name with the class name automatically.
* ( Örnek değişken gibi statik bir değişkene (bir nesne aracılığıyla) erişirsek, derleyici programı durdurmayan bir uyarı mesajı gösterir...
* ...Derleyici, nesne adını otomatik olarak sınıf adıyla değiştirecektir. )
********** NOTE: static değişkenin değerini isntance blockta atarsak eğer nesne oluşturmadığımız zaman instance block çalışmayacağı için orada değer atanması yapılmamış olur.
*
*
*
### Differences Between the Instance Variables and the Static Variables:
--> Each object will have its own copy of an instance variable, whereas we can only have one copy of a static variable per class, irrespective of how many objects we create.
* Thus, static variables are good for memory management.
--> Instance variables are created when an object is created with the use of the keyword ‘new’ and destroyed when the object is destroyed.
* Static variables are created when the program starts and destroyed when the program stops.
--> We can access instance variables through object references, and static variables can be accessed directly using the class name.
--> Changes made in an instance variable using one object will not be reflected in other objects as each object has its own copy of the instance variable.
* In the case of a static variable, changes will be reflected in other objects as static variables are common to all objects of a class.
 */
public class Main {

    private String instanceVariable1;
    protected String instanceVariable2 = "İlk değeri declare edilirken verildi!";
    public int instanceVariable3; // Default değeri 0 dır.!

    public  int instanceVariable4 = 10;
    public static String staticVariable;
    private static String staticVariable2 = "İlk değeri declare edildiğinde verilen static değişken";
    public static String staticVariable3;


    // static block
    static {
        staticVariable = "Static değişkenin değerini static blockta atayabiliriz.!";
        System.out.println("Static block instance block ve constructordan önce çalışır.!");
    }
    // instance block
    {
        staticVariable3 = "ÖNEMLİ: Eğer istersek static değişkenin değerini instance blockta da atayabiliriz.! \n" +
                "           Hem static blockta hem de instance blockta aynı static\n"  +
                "           değişkene atama yapılırsa en son çalışan blocktaki değeri olur ki burada instance block static blocktan sonra çalışır. " +
                "constructordan da önce çalışır.! \n" +
                "           AMA\n " +
                "           static değişkenin değerini isntance blockta atarsak eğer nesne oluşturmadığımız zaman instance block çalışmayacağı için\n" +
                "           orada değer atanması yapılmamış olur";
        System.out.println("ınstance block constructordan önce çalışır.!");
        String localVariable1 = "Bu bir local değişkendir. Block içerisinde tanımlanmıştır.";
        instanceVariable1 = "İnstance block içerisinde değeri verildi!";
        System.out.println("Default değer ile toplama yapıldı.! Ekstra değer verilmedi: " + (instanceVariable3 + 5)); // Hata vermez çünkü instanceVariable default değerlere sahiptir. default değer int için 0 dır.!

    }
    public Main(){
        System.out.println("Constructor!");
    }
    public static void main(String[] args) {
        // static degisken; --- static değişkenler sınıflara özgüdür sadece sınıf içerisinde yaratılabilirler.
        // Herhangi bir methodda (static veya non-statcic method) yaratılmazlar.
        int localVariable = 1; // this is a local variable
        int age;
        // age = age + 7; HATA verir çünkü age default değere sahip olmayan bir local değikendir bu nedenle ilk değeri verilmeliydi!
        Main nesne = new Main();
        System.out.println(nesne.instanceVariable1); // static method içerisinde obje ismi ile çağırabilirler.!
        nesne.printEmp();
        System.out.println(Main.staticVariable);
        System.out.println(Main.staticVariable2);
        System.out.println(Main.staticVariable3);
        Main nesne2 = new Main();
        System.out.println("Nesneler tarafından instance değişkenler copya olarak tutulur. Her nesne kendi belleğinde instance değişkenini tutar ve onları kullanır.!");
        // instance değişkenlerinin her biri bir nesne için copyası tutulur. bir nesnenin bir instance değişkeni değiştirmesni diğer nesnelerin
        //... copya olarak tuttuğu değişkenleri etkilemez.! Ama static değişkenler sınıflara ait olduğundan bir değişiklik hepsini etkiler !
        nesne.instanceVariable4 = 20;
        System.out.println(nesne.instanceVariable4);

        System.out.println(nesne2.instanceVariable4);


    }

    public void printEmp() {
        // Static olmayan  metodlar da ise direkt obje veya sınıf ismi olmadan çağırılabilirler..!
        System.out.println("instance variable-1 : " + instanceVariable1 );
        System.out.println("instance variable-2 : " + instanceVariable2);
    }
}