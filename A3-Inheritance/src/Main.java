public class Main {
    public static void main(String[] args) {
        Yonetici yonetici = new Yonetici();
        Calisan calisan = new Calisan("deneme", "soldu mu", 2323);
        Calisan deneme = calisan;
        System.out.println("Referans" + calisan);
        yonetici.BilgileriGoster();
        System.out.println("---------------------");
        calisan.BilgileriGoster();
        System.out.println("Eşit mi " + deneme.hashCode());

    }
}