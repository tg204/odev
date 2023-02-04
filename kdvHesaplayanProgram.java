import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double kdvsizFiyat, kdvliFiyat, kdv, kdvOran1=0.18,kdvOran2=0.08;


        Scanner input =new Scanner(System.in);
        System.out.print("KDV'siz fiyatı giriniz:");
        kdvsizFiyat =input.nextDouble();

        if((kdvsizFiyat>0)&& (kdvsizFiyat <1000)){
            kdvliFiyat=(0.18*kdvsizFiyat)+kdvsizFiyat;
            System.out.println("KDV'li fiyatı:"+kdvliFiyat);
            kdv=kdvliFiyat-kdvsizFiyat;
            System.out.println("KDV:"+kdv);
            System.out.println("KDV oranı:"+kdvOran1);
        }else if (1000 <= kdvsizFiyat){
            kdvliFiyat=(0.08*kdvsizFiyat)+kdvsizFiyat;
            System.out.println("KDV'li fiyatı:"+kdvliFiyat);
            kdv=kdvliFiyat-kdvsizFiyat;
            System.out.println("KDV:"+kdv);
            System.out.println("KDV oranı:"+kdvOran2);

        }else {
            System.out.println("Yanlış Bir Rakam Girdiniz:");
        }


    }
}


    }

}

