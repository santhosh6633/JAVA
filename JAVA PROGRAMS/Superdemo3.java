import java.io.*;
class Animal{
    Animal(){
        System.out.println("Animal is created");
    }
    String color="white";
    void eat(){
        System.out.println("Animal is eating");
    }
}
class Dog extends Animal{
    String color="Black";
    Dog(){
        super();
        System.out.println("The dog is created");
    }
    void printcolor(){
        System.out.println("Dog color is: "+color);
        System.out.println("Animal color is: "+super.color);
        super.eat();
    }
}
class Superdemo3{
    public static void main(String args[]) {
    Dog d=new Dog();
    d.printcolor();
}
}
