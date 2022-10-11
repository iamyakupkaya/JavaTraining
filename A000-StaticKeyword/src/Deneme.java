public class Deneme {
    private static  int aa=23;

    public  Deneme(){
        aa=45;
    }
    public void YY(){

        XX();

    }
    public static void XX(){
        System.out.println("Static metod değildir.");
    }
    public static int getAa() {

        return aa;
    }
}
