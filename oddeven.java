import java.util.*;

public class oddeven {
    public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       System.out.println("ENTER A:");
       int a = sc.nextInt();
       System.out.println("ENTER B:");
       int b = sc.nextInt();
       System.out.println("ENTER A OPERATOR:");
       char operator = sc.next().charAt(0);
       

       switch(operator)
       {
        case '+' : System.out.println(a+b);
        break;
        case '-': System.out.println(a-b);
        break;
        case'*' : System.out.println(a*b);
        break;
        case '/' : System.out.println(a/b); 
        break;
        case'%' : System.out.println(a%b);
        break;
        default : System.out.println("invalid");
       }
    }
}


