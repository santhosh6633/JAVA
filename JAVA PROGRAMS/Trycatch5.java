import java.io.IOException;

class Trycatch5{
    public static void main(String[] args) {
        try{
            throw new IOException("IOException caught");
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}
