public class Main {
    public static void main(String[] args) {
        Lion lion = new Lion(); // burada lion sınıfı cats sınıfından ve cats sınıfı da animal sınıfıından türemiştir
        // bu yüzden Lion dan nesne oluştuğunda default -parametresiz- olan tüm üst sınıfların constructorları
        // en üstten başlayarak sırası ile çağırılır.!

    }
}