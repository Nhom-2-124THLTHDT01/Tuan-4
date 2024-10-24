package Bai6;
import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhap vao mot so nguyen: ");
        int n = scanner.nextInt();
        
        if (KT_DX(n)) {
            System.out.print(n + " la so doi xung.");
        } else {
            System.out.print(n + " khong la so doi xung.");
        }
        
        scanner.close();
    }
    public static boolean KT_DX(int n) {
        String str = Integer.toString(n);
        int len = str.length();
        
        for (int i = 0; i < len / 2; i++) {
            if (str.charAt(i) != str.charAt(len - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}

