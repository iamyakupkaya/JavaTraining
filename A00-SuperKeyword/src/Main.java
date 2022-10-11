// ****** Super Keyword Info **********

// 1- The super keyword in Java is a reference variable which is used to refer immediate parent class object
// 2- Whenever you create the instance of subclass, an instance of parent class is created implicitly which is referred by super reference variable.
// 3- Usage of Java super Keyword
//    3.1-) super can be used to refer immediate parent class instance variable.
// ........ We can use super keyword to access the data member or field of parent class. It is used if parent class and child class have same fields.
//    3.2-) super can be used to invoke immediate parent class method.
// ........ The super keyword can also be used to invoke parent class method. It should be used if subclass contains the same method as parent class. In other words, it is used if method is overridden.
//    3.3-) super() can be used to invoke immediate parent class constructor.
// ........ Note: super() is added in each class constructor automatically by compiler if there is no super() or this()
// ........ As we know well that default constructor is provided by compiler automatically if there is no constructor. But, it also adds super() as the first statement.

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}