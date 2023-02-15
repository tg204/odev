import java.util.Scanner;

public class girilenSayinin3Ve4BolumununOrtalamasi {

	public static void main(String[] args) {
		 int sayi, t = -1, toplam= 0;

	        Scanner input = new Scanner(System.in);

	        System.out.print("LÜtfen bir sayı giriniz : ");
	        sayi = input.nextInt();

	        for (int i = 0 ; i <= sayi ; i++){

	            if (i % 3 == 0 && i % 4 == 0){
	            	toplam += i;
	                 t ++;
	                 
	                System.out.println("3 ve 4'e aynı anda bölünen sayılar : " +i);
	            }
	        }
	        System.out.println("Bu sayıların toplamı : " + toplam);
	        System.out.println("Kaç adet sayı var : " +t);
	        System.out.println("Ortalamanız : " + toplam/t);
	    }
	}