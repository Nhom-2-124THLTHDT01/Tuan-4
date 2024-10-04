
import java.util.Scanner;

public class Cau4 {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Nhap n :");
       int n = sc.nextInt();
       int dem = 0;
       for(int i = 1 ; i<= n ;i++){
            if( n % i == 0)
                dem ++;
       }
       if(dem == 2)
            System.out.println("Day la so nguyen to ");
        else 
            System.out.println("Day ko phai la so nguyen to");
   } 
}
