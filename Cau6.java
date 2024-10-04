
import java.util.Scanner;

public class Cau6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n : ");
        int n = sc.nextInt();
        int daonguoc = daonguoc(n);
        if(daonguoc == n )
            System.out.println("Day la so doi xung ");
        else
            System.out.println("Day khong phai la so doi xung ");
    }
    public static int daonguoc(int n){
        int so = 0, r ;
        while (n!=0) { 
            r = n % 10;
            so = so*10 +r;
            n = n / 10;
        }
        return so;
    }
}
