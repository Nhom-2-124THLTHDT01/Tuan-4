
import java.util.Scanner;

public class Cau5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so a : ");
        int a = sc.nextInt();
        System.out.print("Nhap so b : ");
        int b = sc.nextInt();
        int ucln = UCLN(a,b);
        int bcnn = (a*b)/ucln;
        System.out.println("Uoc chung lon nhat la :" + ucln );  
        System.out.println("Boi chung nho nhat la :" + bcnn);
    }
    public static  int UCLN (int a, int b){
        int r=0;
        while (a%b != 0) {  
            if(a%b!=0){
                r = a%b ;
                a = b;
                b = r;
            }
        }
        return b;
    }
}
