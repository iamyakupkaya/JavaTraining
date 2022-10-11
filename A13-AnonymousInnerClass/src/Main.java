// Anonymous Inner Class
// The variables that are declared inside the class but outside the scope of any method are called instance variables in Java.
// Anonymous inner classlar ile herhangi bir class tanımı olmadan bir tane obje yaratabiliyoruz.
// Interface ve Abstract ile obje yaratilmemizi sağlar.
// Interface ile bir referans oluşturduktan sonra o interface ile new anahtar kelimesini kullanıp metodları direkt orada yazıyoruz.
public class Main {
    public static void main(String[] args) {
        IAnonymousInterface ogrenci = new IAnonymousInterface() {
            @Override
            public void dersCalis() {
                System.out.println("Derse Çalışıyorum Interface");
            }

            @Override
            public void derseGir() {
                System.out.println("Derse Giriyorum Interface");

            }
        }; // buradaki interface bir statement gibi olduğu için noktalı virgülü unutmamak gerek.

        // interface referansı üzerinden metodlara ulaşalım.
        ogrenci.dersCalis();
        ogrenci.derseGir();

        // ****************************
        AnonymousAbstraction okullu = new AnonymousAbstraction("Yakup KAYA", 28) {
            @Override
            public void okulaGit() {
                System.out.println(getAge() + " yaşındaki " + getIsim() + " okula gidiyor..!" );
            }
        };
        okullu.okulaGit();
        okullu.okuldangel();
    }
    // bir tane non-static inner class oluşturalım ama bu interface olsun. istersek ayrı bir dosyada da yazabilirz. Farketmez.
    public interface IAnonymousInterface{
        public abstract void dersCalis();
        void derseGir(); // yukarıdaki yazım şekli java dan class a complier edilince otomatik eklenen keywordlerdir.
    }

    // bir tanede static-inner class olarak abstract sınıfı yazalım. Bunun static olması şart yoksa main içerisinde kullanamayız
    // interfacelerde böyle bir durum yok çünkü onlar sınıf değiller ama abstractlar sınıftır ve static içerisinde kullanmamız
    // gerekiyorsa static olarak tanımlamalıyız.
    public static abstract class AnonymousAbstraction{
        private String isim;
        private int age;
        public AnonymousAbstraction(String isim, int age){
            this.isim=isim;
            this.age=age;
        }
        // getter ve setter ile bunu abstract nesnesinin içerisinde kullanabilirz.
        public String getIsim() {
            return isim;
        }

        public void setIsim(String isim) {
            this.isim = isim;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public abstract void okulaGit();
        public void okuldangel(){
            System.out.println("Okuldan geliyorumm..!");
        }


    }
}