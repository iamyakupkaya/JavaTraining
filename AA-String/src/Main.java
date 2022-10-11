public class Main {
    public static void main(String[] args) {
        StringBuilder s1 = new StringBuilder("Hello");    //String 1
        StringBuilder s2 = new StringBuilder(" World Oldu");    //String 2
        s1.append(s2);   //String 3 to store the result
        System.out.println(s1);
    }
}