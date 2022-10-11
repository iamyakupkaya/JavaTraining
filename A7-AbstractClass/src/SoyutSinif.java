// Abstract Sınıf Özellikleri..!
// 1- Class modifer can be public or non-modifier.!
// 2- Abstract sınıf static metodları olabilir.! Bunları direkt abstract sınıfı ismi ile çağırıyoruz.!
// 3- Abstract sınıflar başka bir sınıfı ya da abstract sınıfı extend edebilir.! Ve başka bir sınıf için parent olabilir.


abstract class SoyutSinif extends Deneme {
    protected String useThis; // subclass can use this.!
    public SoyutSinif(){
        System.out.println("Abstract Class Default Constructor.!");
    }
    public static void Deneme(){
        System.out.println("Abstract class static method.!");
    }

    public abstract void sayHello();
    public static void sayGoodbye(){
        System.out.println("Good Bye");
    }


}
