public class Main {
    public static double Topla(int a, int b) {
        return a + b;
    }

    public static int Topla(int... sayilar) {
        // sayilar is a array.! topic: Java veriable arguments

        int sum = 0;
        for (int sayi : sayilar) {
            sum += sayi;
        }

        return sum;
    }

    public static String Topla(String a, String b) {
        return a + b;
    }

    public static void main(String[] args) {

        System.out.println(Topla(10, 10));
        System.out.println(Topla("Merhaba", " Nasılsın"));

    }
}