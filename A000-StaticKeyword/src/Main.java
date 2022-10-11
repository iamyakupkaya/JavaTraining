// STATIC KEYWORD INFO

// STATIC VARİABLE ***
// 1- The static keyword in Java is used for memory management mainly.
// 2-  We can apply static keyword with variables, methods, blocks and nested classes.
// 3- The static keyword belongs to the class than an instance of the class. Java static property is shared to all objects.
// .. Static anahtar kelimesi objeden ziyade bir sınıfı aittir-bağlıdır.
// 4- Bir static keyword; variable, method, block, nested class olabilir. static variable sınıf değişkeni, static method
// .. sınıf metodu olarakta bilinir.!
// 5- **ÖNEMLİ** Static değişkenler sınıf yaratılırken bellekte sadece birkez oluşturulur. Her obje oluştuğunda oluşmaz.
// .. sadece sınıf oluştuğunda oluşturulur ve tüm objelerin ortak alanları için sınıf ismi ile kullanılabilir.
// .. örneğin bir şirketin çalışanlarının çalıştığı şirket ismi her çalışan için aynıdır static olarak tanımlanabilir.
// .. bu tarz durumlarda her obje (çalışan) için tekrar tekrar bellekte bu değere yer vermek yerine static olarak tanımlanırsa..
// .. bellek daha verimli kullanılmış olur. Böylece static değişken contructorda da tanınmasına gerek kalmaz çünkü değeri
// .. belli ve her yaratılacak obje için değişmeyecek değerlerdir.! mesela PI sayısı. Math.PI denilerek Math sınıfı üzerinden..
// .. direkt erişilir. Math sınfından obje yaratmaya gerek duyulmaz.!
// 6- objeler heap alanında, primitive ve referans değerleri stack alanında tutulurken static değişkenler class area da tutulur.
// 7- In this example, we have created an instance variable (sınıf içindeki metodların dışında ama sınıf içinde oluşturulan değişkenler)
// .. named count which is incremented in the constructor.
// .. Since instance variable gets the memory at the time of object creation,
// .. each object will have the copy of the instance variable. If it is incremented, it won't reflect other objects.
// .. So each object will have the value 1 in the count variable.
// .. Ama eğer counter değişkenimizi static tanımlarsak her obje değişkenin bir kopyası olmayacaktır ve değişkenin kendisi
// .. sınıf alanında tutulduğu için her obje yaratımında constructor içerisinde artım yaptımızda her objede bir artacak, SIFIRLANMAYACAKTIR.
// 8- Static olan metodlar sadece static değişkenlere ulaşabilirken, static olmayan metodlar static değişkenleri
// .. ve normal değişkenleri kullanabilir. Yani constructor bir static değikeni kullanabilir. Counter gibi mesela. ONAYLI.!
// 9- Bir static değişkeni private olarak tanımlayabiliriz. Eğer private olarak tanımlarsak direkt sınıf ismi üzerinden ERİŞEMEYİZ.!
// .. burada private static değişkenimize erişmek için getter kullanmamız gerekir. getter da static olursa direkt sınıf ismi üzerinden
// .. erişebilir. Eğer getter static olmazsa bu sefer obje üzerinden erişmemiz gerekir.! Çünkü static olmayan metodlar
// .. static değişkenleri kullanabilir ve static metodları çağırabilirler ama static metodlar sadece static değişkenleri kullanabilir
// .. ve sadece static olan metodları invoke edebilir. AMA eğer getter static olursa buna hem obje hem de sınıf üzerinden erişebiliriz.
// .. ama burada obje referansı üzerinden erişmeye çalışıtığımızda hata vermese de obje referansı.metod ismi yaptımızda
// .. metod ismini göstermez ama kendimiz yazarsak hata da vermeyecektir. Yine de sınıf ismi üzerinden kullanmak mantıklı olabilir.
//.. Static bir metoddan static olmayan bir metod ya da değişken çağırdığımızda hata vermesinin nedeni; static olan metodun
// .. program çalıştığı gibi oluşturulması ama static olmayan metodların ve değişkenlerin henüz oluşmamasından kaynaklı olarak
// .. oluşan bir şeyden oluşmamış bir şeyi çağırmaya çalışmamızıdır.!


// *********** STATIC METHODS ***************
// 1- Static metodlar da objelerden ziyade sınıflara aittir.! Bu yüzden her obje yaratıldığında değil sadece sınıf oluşturulduğunda
// .. birkez yaratılır ve sınıf ismi ile birlikte kullanılır.!
// 2- Static bir metod static data members yani static olan değişkenlere kendi içerisinde çağırabilir ve değerlerini değiştirebilir.
// .. değerinin değişmesini istemediğimiz static değişkenler için ayrıca final keywordu de kullanmalıyız.!
// 3- **ÖNEMLİ** Static metodlar için önemli iki ana kısıtlama vardır. bunlardan birincisi --> bir static metod asla ama asla
// .. static olmayan bir değişkeni içerisinde kullanamaz ve içerisinde static olmayan bir başka metodu çağıramaz.
// .. static static kullanır ve çağırır.
// 4- This ve super keywordleri static context içerisinde kullanılamaz.
// 5- Why is the Java main method static?
// .. Answer --> It is because the object is not required to call a static method. If it were a non-static method,
// .. JVM creates an object first then call main() method that will lead the problem of extra memory allocation.
// .. Her java sınıfının başlatılabilmesi için bir static main metodu gerekli; bunun nedeni ise sınıf oluşturulduğunda
//.. kodu çalıştırmak için bir main arar ama daha o oluşturulmadıysa hata verir. Bu yüzden static olarak tanımlarız ki sınıf
// .. oluşturulduğunda static main metodu da oluşturulsun ki içerisindeki kodlar çalıştırılabilsin. Ayrıca main ismi katı kuraldır
// .. main yerine başka isim kullanamayız bu ön tanımlı bir isimdir.
// 6- you cannot override a static method but you can certainly inherit a static method, if it is not hidden by subclass. with final keyword
// .. you can hide it :)

// ************* STATIC BLOCK IN JAVA ******************
// 1- Java da static blockların kullanım amacı static olan değişkenleri initilaize edebilmektir. burada sınıf oluşturulduğu gibi
// .. herhangi bir sınıf ismi ile çağırılma durumu olmadan static block çalışır.
// 2- It is executed before the main method at the time of classloading. Yani main bloğu çalışmadan bizim static block çalışır.
// ÖRNEK;
/*
class A2{
  static{System.out.println("static block is invoked");}
  public static void main(String args[]){
   System.out.println("Hello main");
  }
}
>>>
Output:static block is invoked
       Hello main
 */
// 3- Can we execute a program without main() method?
//Ans) No, one of the ways was the static block, but it was possible till JDK 1.6. Since JDK 1.7,
// .. it is not possible to execute a Java class without the main method.
/*
class A3{
  static{
  System.out.println("static block is invoked");
  System.exit(0);
  }
}

>>> static block is invoked
 */


public class Main {
    public static void main(String[] args) {
        Deneme deneme = new Deneme();
        System.out.println(deneme.getAa());
        deneme.YY();
    }
}