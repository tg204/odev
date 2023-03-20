import java.util.Scanner;

public class RecursiveAsalSayi {
    static boolean isPrime(int n, int k) {

        if (n < 2) {
            return false;
        } else if (n == 2) {
            return true;
        } else if (n % k != 0 && k == n - 1) {
            return true;
        } else {
            if (n % k == 0) {
                return false;
            } else {
                return isPrime(n, k + 1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a;
        System.out.print("Sayı Giriniz : ");
        a = input.nextInt();

        if (isPrime(a,2)) {
            System.out.println(a+" Bir Asal Sayıdır !!!");
        } else {
            System.out.println(a+" Bir Asal Sayı Değildir !!!");
        }
    }
}