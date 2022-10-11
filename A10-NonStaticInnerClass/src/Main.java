// inner classlar iç içe olan classlar olduğundan bir nevi inheritace yapmış oluyoruz çünkü en dıştaki classın değişkenleri
// .. ve metodları üst block olarak sayıldığı için iç sınıflar üst sınıflarının bu metod ve değişkenlerini kullanabildiği
// .. için bir nevi inheritance yapmış oluyoruz.
public class Main {
    public static void main(String[] args) {
        // non-static inner classlarda en içteki sınıfa ulaşmak için önce en üst sınıftan başlayarak nesne oluşturulmalı
        Animals.Vertabrabes.Mammals.Humans humans = new Animals().new Vertabrabes().new Mammals().new Humans();
        humans.Info();
    }
}