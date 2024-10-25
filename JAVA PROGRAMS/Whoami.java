import java.io.*;
class A {
    void callme() {
        System.out.println("Iam from A");
    }
}
class B extends A {
    void callme() {
        System.out.println("Iam from B");
    }
}
class Whoami {
    public static void main(String[] args) {
    A a1=new A();
    A a2=new B();
    B b=new B();
    a1.callme();
    a2.callme();
    b.callme();
    }
}
