// Method overriding ile yapılan polimorfizmler run-time polimorphism olarak geçer. Ve çalışma zamanında belirlenir.
// Method overloading ile yapılan polimorfizmler compile-time polimorphism olarak geçer. Derleme zamanında belirlenir.
// Operator (+ & ! ) overloading de bir çeşit polimorphismdir. Java da user-defined operator overloading yapılamaz.
// ... sadece built-in operand overloading vardır. Mesela . operandının hem toplama yapması hem de string birleştirmesi.
// Polymorphic variable (Polimorfik değişkenler) Farklı şartlar altında farklı değerleri refere eden değişkenlerdir.
// ... Bu da bir çeşit polymorphism dir. Mesela Javadaki obje değişkenleri (referans tutucular) durumu göre kendi...
// ... sınıfını refere ederken duruma göre alt sınıflarını refere edebilir. Alt sınıflarının referansını tutan değişkenler.

public class Main {
    public static void main(String[] args) {
        BaseKredi baseKredi = new EgitimKredi();
        BaseKredi baseKredi1 = new TicariKredi();
        // new kullanılan constructor türündeki objenin referansını döndürür.
        // yani new ile oluşturulan objenin referans değeri basekrediye atanır.!
        System.out.println(baseKredi);
        System.out.println(baseKredi1);

        String aa= new String("oldu");
        String bb = "oldu";
        System.out.println("Stringler eşit mi?: " + aa.equals(bb));
    }
}