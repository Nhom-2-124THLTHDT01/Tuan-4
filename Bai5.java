package Bai5;
import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhap vao so nguyen thu nhat: ");
        int a = scanner.nextInt();
        
        System.out.print("Nhap vao so nguyen thu hai: ");
        int b = scanner.nextInt();
        
        int ucln = gcd(a, b);
        int bcnn = (a * b) / ucln;
        
        System.out.print("UCLN cua " + a + " va " + b + " la: " + ucln + "\n");
        System.out.print("BCNN cua " + a + " va " + b + " la: " + bcnn + "\n");
        
        scanner.close();
    }
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}

