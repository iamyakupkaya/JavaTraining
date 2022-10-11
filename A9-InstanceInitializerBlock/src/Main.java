// Intance initializer block sınıf değişkenleri atamasında kullanılır. Her obje yaratıldığında çalışır.!
// The initialization of the instance variable can be done directly but
// ...there can be performed extra operations while initializing the instance variable in the instance initializer block.
// yani sınıf değişkenleri normal şekilde başlatıldıktan sonra bu block içerisinde değerleri değiştirebilir. Eğer
// ... değer verilmemişse bu block içerisinde değer verilebilir.
/*
Why use instance initializer block?
Suppose I have to perform some operations while assigning value to instance data member e.g. a for loop to fill a
... complex array or error handling etc.

 */
/*
class Bike7{
    int speed;

    Bike7(){System.out.println("speed is "+speed);}

    {speed=100;}

    public static void main(String args[]){
    Bike7 b1=new Bike7();
    Bike7 b2=new Bike7();
    }
}

>>> speed is 100
speed is 100
 */

/*
What is invoked first, instance initializer block or constructor?
class Bike8{
    int speed;

    Bike8(){System.out.println("constructor is invoked");}

    {System.out.println("instance initializer block invoked");}

    public static void main(String args[]){
    Bike8 b1=new Bike8();
    Bike8 b2=new Bike8();
    }
}
Output:instance initializer block invoked
       constructor is invoked
       instance initializer block invoked
       constructor is invoked
In the above example, it seems that instance initializer block is firstly invoked but NO.
Instance intializer block is invoked at the time of object creation.
The java compiler copies the instance initializer block in the constructor after the first statement super().
So firstly, constructor is invoked. Let's understand it by the figure given below

ÖNEMLİ.. constructor çalıştığında önce super() i ekler daha sonrasında ise İnitializer bloğunu ekler. sonrasında yazdığımız diğer kodlar.
 */

/*

Rules for instance initializer block :
There are mainly three rules for the instance initializer block. They are as follows:
The instance initializer block is created when instance of the class is created.
The instance initializer block is invoked after the parent class constructor is invoked (i.e. after super() constructor call).
The instance initializer block comes in the order in which they appear.
 */

// ÖNEMLİ Note: The java compiler copies the code of instance initializer block in every constructor.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}