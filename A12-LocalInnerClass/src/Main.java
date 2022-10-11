// Local Inner Class Info

// non-static ve static inner classlar, classların birer üyesiydi ama local inner classlar metodların birer üyesidir
// yani local inner classlar; classların içerisine değil metodların içerisine tanımlanırlar.
// local inner classlar metodların içerisinde tanımlandığı için başka metodlardan erişilemez.
// local inner classlarda public static gibi keywordlar kullanılamıyor çünkü local inner classlar metodlara özgüdür ve
// ... metod içerisinde static, public keywordlari kullanılamaz. Metod içerisinde değişken tanımlar gibi tanımlarız.

public class Main {
    public static void main(String[] args) { // local inner class metoda özgü olduğu için sadece bu metod içerisinde obje üretilebilir.
        class Alan{
            public Alan(int yariCap){
                System.out.println("Dairenin alanı: " + (yariCap*yariCap*Math.PI));
            }
        }
        //classın hemen dışına ve metodun içerisinde obje oluşturuyoryz.
        Alan alan = new Alan(5);

    }
}