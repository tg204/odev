import java.util.Scanner;

public class UsAlma {
    static  int usAlma(int taban,int us){
        if(us<1)return 1;
        else return taban * usAlma(taban,us-1);
    }
    public static void main(String[] args) {
        Scanner tara = new Scanner(System.in);
        int t,u;

        System.out.print("Sayının tabanını giriniz: ");
        t = tara.nextInt();

        System.out.print("Sayının üssünü giriniz: ");
        u = tara.nextInt();

        System.out.println("Sonuc: " + usAlma(t,u));


    }
}