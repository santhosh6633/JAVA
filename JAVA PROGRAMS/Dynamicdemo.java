import java.io.*;
class Bike{
    void run(){
        System.out.println("Bike is running.");
    }
}
class  Honda extends Bike{
    void run()
    {
        System.out.println("Honda is running");
    }
}

class Dynamicdemo{
    public static void main(String args[]){
        Bike b=new Bike();
        Honda h=new Honda();
        b.run();
        h.run();
        Bike b1=new Honda();
        b1.run();
        
    }
}
