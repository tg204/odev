import java.util.Scanner;

public class mukemmelSayi {
    public static void main(String[] args) {

        int n1;
        Scanner input=new Scanner(System.in);

        System.out.print("Bir sayısını giriniz:");
        n1=input.nextInt();
        int toplam=0;
        int carpan=1;
        int i=1;
        while(n1>i) {

            if (n1%i==0) {

                carpan = i;

                toplam+=i;
            }
                i++;

            }
        if (toplam== n1){
            System.out.println(n1+" Mükemmel sayıdır.");

        }else{
            System.out.println(n1+" Mükemmel sayı değildir.");
        }



    }

}