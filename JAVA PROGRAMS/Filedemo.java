import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileWriter;
import java.util.*;
class Filedemo{
    public static void main(String args[]){
        File r=new File("Bunny.txt");
        try{
            r.createNewFile();
        }
        catch(IOException e){
            System.out.println("IOException caught");
        }
        try{
            FileWriter fw=new FileWriter("Bunny.txt");
            fw.write("This is my first java file program...");
            fw.close();
        }
        catch(IOException e){
            System.out.println("IOException caught..");
        }
        try{
            Scanner sc=new Scanner(r);
            while(sc.hasNextLine()){
                String line=sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        }
        catch(FileNotFoundException k){
            System.out.println("FilenotFoundException caught");
        }
        if(r.delete()){
            System.out.println("I have deleted: "+r.getName());
        }
        else{
            System.out.println("Some problem occured while deleting..");
        }
    }
}
