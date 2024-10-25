import java.io.*;
class Outer{
static int data=30;
static class Inner{
void message()
{
System.out.println("The value of data is:"+data);
}
}
public static void main(String args[]){
Outer.Inner obj=new Outer.Inner();
obj.message();
}
}
