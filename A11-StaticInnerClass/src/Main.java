// In Java, only nested classes are allowed to be static.
// Like regular classes, static nested classes can include both static and non-static fields and methods.
public class Main {
    public static void main(String[] args) {
        //Matematik sınfının içerisindeki usePI static classından nesne oluştur.
        Mathmatic.usePI pi = new Mathmatic.usePI();
        pi.info();
        // ayrıca static olduğu için aşağıdaki gibi de kullanılabilir
        Mathmatic.usePI.infoTwo(); // Matematik sınıfının içerisindeki useIP static sınıfının içerisindeki infoTwo static metodunu çağır

    }
}