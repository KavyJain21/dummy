import java.util.*;
public class temp {
    public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
      System.out.println("input year:");
      int year= sc.nextInt();

    if(year!=year/4){
    System.out.println("not a leap year");
    
    if (year!=year/100){
        System.out.println(" leap year");
     if(year!=year/400)
     {
        System.out.println("NOT A LEAP YEAR");
     }   
     else
     {
        System.out.println("IT IS A LEAP YEAR");
     }
    }
    } 
}
}