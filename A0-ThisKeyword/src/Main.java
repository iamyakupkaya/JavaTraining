// This Keyword Info --> https://www.javatpoint.com/this-keyword
// 1- There can be a lot of usage of Java this keyword. In Java, this is a reference variable that refers to the current object.
// 2- Usage of Java this keyword ...
// .. Here is given the 6 usage of java this keyword.
// 2.1-) this can be used to refer current class instance variable.
// ..... The this keyword can be used to refer current class instance variable.
// ..... If there is ambiguity between the instance variables and parameters, this keyword resolves the problem of ambiguity.
// 2.2-) this can be used to invoke current class method (implicitly - dolaylı olarak)
// ..... You may invoke the method of the current class by using the this keyword.
// ..... If you don't use the this keyword, compiler automatically adds this keyword while invoking the method
// 2.3-) this() can be used to invoke current class constructor.
// ..... The this() constructor call can be used to invoke the current class constructor.
// ..... It is used to reuse the constructor. In other words, it is used for constructor chaining.
// ..... Rule: Call to this() must be the first statement in constructor. Yoksa error verir.!
// 2.4-) this can be passed as an argument in the method call.
// 2.5-) this can be passed as argument in the constructor call.
// 2.6-) this can be used to return the current class instance from the method.


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}