public class Animals {
    private int kilo=70; // private değişkenler tanımlandıkları sınıf içerisinde kullanılırlar. Ve inner classlar da
    // bu sınıfın direkt içinde olduğundan kullanabilirler.
    public int age=25;
    public class Vertabrabes{
        public void vertabrabesAnimals(){
            System.out.println("Vertabrabes Animals have 2 part. these are Warm-blood and Cold-blood");
        }
        public class Mammals{
            public boolean hasLegs=true;

            public class Humans{
                public void Info(){
                    System.out.println("Humans have 2 legs and 2 arms. They are mammals animals.");
                }
            }
        }
    }
    public class Invertabrabes{
        public void invertabrabesAnimals(){
            System.out.println("INvertabrabes Animals have 2 part. these are with legs and without legs");

        }
    }

}
