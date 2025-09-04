import java.util.*;
public class ac {
    public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       
       int number;
       int i;

       System.out.println("ENTER A NUMBER");
       number=sc.nextInt();
       System.out.println("table of"+number+":");

       for(i=1;i<=10;i++){
        System.out.println(number+"*"+i+"="+ number*i);
       }
     
    }
}