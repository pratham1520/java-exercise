import java.util.Scanner;
public class Add {
    int a,b,c ;
    public Add(int a , int b ){
        this.a = a;
        this.b = b;
    }
    public void performAdd(){
        c = a + b ;
        System.out.println("Addition "+c);
    }
    public static void main(String[] args){
        Add add = new Add(5,4);
        add.performAdd();
    }
}


