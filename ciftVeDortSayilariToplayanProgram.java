import java.util.Scanner;
/*

Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden 
ve girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan 
programı yazıyoruz.
*/

public class ciftVeDortSayilariToplayanProgram  {

	public static void main(String[] args) {
		
		
		
		int t,total=0;
	        Scanner input = new Scanner(System.in);
	        
	        
	        do {
	        	 System.out.print("Lütfen bir sayı griniz:");
	        	 	t=input.nextInt();
	 	        if ((t%2==0) &&(t%4==0)) {
	 	        	total+=t;
	 	        }
	 	      
	        	}while(t%2==0) ;
	        
	        System.out.print("çift ve 4'e tam bölünen sayıların toplamı:"+total);
	        
	        
	}
}












