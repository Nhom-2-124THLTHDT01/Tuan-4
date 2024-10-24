package Bai4;
import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhap vao mot so nguyen: ");
        int n = scanner.nextInt();
        
        if (n <= 1) {
            System.out.print(n + " khong phai la so nguyen to.");
        } else {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(n + " la so nguyen to.");
            } else {
                System.out.print(n + " khong phai la so nguyen to.");
            }
        }
        
        scanner.close();
    }
}

