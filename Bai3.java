package Bai3;
import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhap vao mot so nguyen duong: ");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("Vui long nhap mot so nguyen duong!");
        } else {
            long factorial = 1;
            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }
            System.out.println("Giai thua cua " + n + " la: " + factorial);
        }
        
        scanner.close();
    }
}

