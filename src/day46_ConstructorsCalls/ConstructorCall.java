package day46_ConstructorsCalls;

public class ConstructorCall {
    public ConstructorCall(){//only constructor can call constructor
        method1();//if the method is not a constructor you cannot call
        method2();
        method3();

    }
    public static void method1(){
        method2();
    }
    public static void method2(){

    }

    public static void method3(){

    }
}
