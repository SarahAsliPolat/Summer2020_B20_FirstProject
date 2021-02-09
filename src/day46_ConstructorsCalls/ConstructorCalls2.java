package day46_ConstructorsCalls;


public class ConstructorCalls2 {

    public ConstructorCalls2(){

    }
    public ConstructorCalls2(int  a ){
        this();
        System.out.println("B");
    }

    public ConstructorCalls2 (char  a) {
        new ConstructorCalls2(10);
    }
    public ConstructorCalls2(String str){
        this (4);
        System.out.println("C");

    }

    public static void main(String[] args) {
        new ConstructorCalls2("Cybertek");


    }
}
