class abc{
    int m,n;
    abc(int x,int y){
        m=x;
        n=y;
    }
    int largest(){
        if(m>n)
            return m;
        else
            return n;
    }
    void display(){
        int l=largest();
        System.out.println("largest number is: "+l);
    }
}
class Largest{
    public static void main(String args[]){
        abc a=new abc(10,20);
        a.display();
    }
}
