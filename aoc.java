import java.util.*;

public class aoc {
    public static void main(String args[]) {
        Scanner sc  = new Scanner(System.in);

       float pencil = sc.nextFloat();
       float eraser = sc.nextFloat();
       float pen = sc.nextFloat();
       float bill = pencil + eraser + pen ;

       
       System.out.println("bill:" + bill);
       double gst = (bill + (0.18*bill)) ;
       System.out.println("BILL AFTER GST :" + gst);
       }  
} 