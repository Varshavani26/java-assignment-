import java.util.Scanner;
class ass{
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        System.out.println("enter a number a=");
        int  a=in.nextInt( );
        if(a>0)
        {
          System.out.println("a is positive");
        }
        else if(a<0)
        {
            System.out.println("a is negative");
        }
        else
        {
            System.out.println("a is equal to zero");
        }
    }
}