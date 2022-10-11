public class Mathmatic {
    private static double PI = Math.PI;
     private int age=45;  //  we can not use non-static in static methods and static class.!

    // burada static sınıf tanımlayalım
    public static class usePI{

        public void info(){ // we can create a non-static method in static class.!
            System.out.println("Math pi is: " + PI ); // we can not use age in this method.!
        }
        // also we can create a static method in static class
        public static void infoTwo(){
            System.out.println("infoTwo --> Static method in static class and pi: " + PI);
        }
    }
}
