
import java.util.Scanner;

public class Cau1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n : ");
        int n = sc.nextInt();
        int s = 0;
        for( int i =1 ; i <=n ; i++ )
            s = s + i ;    
        System.out.println("Tong cac so tu 1 den n la : " + s);
    }
}
