import java.util.Scanner;
public class switchCase {

	public static void main(String[] args) {
		Scanner input =new Scanner (System.in);
		
		int n1,n2,select;
		
		System.out.print("ilk sayıyı giriniz:");
		n1=input.nextInt();
		System.out.print("ikinci sayıyı giriniz:");
		n2=input.nextInt();
		
		System.out.println("\n1-toplama\n2-çıkarma\n3-çarpma\n4-bölme");
		System.out.print("seçiminiz:");
		select=input.nextInt();
		
		switch(select) {
		
			case 1:
				System.out.print("toplam:" +(n1+n2));
				break;
			case 2:
				System.out.print("çıkarma:" +(n1-n2));
				break;
			case 3:
				System.out.print("çarpma:" +(n1*n2));
				break;
			case 4:
				if(n2==0) {
					System.out.print("ikinci sayı 0 olamaz!");
				}else 
					System.out.print("bölme:" +(n1/n2));
				
				break;
				
			
			default :
			System.out.print("hatalı seçim yaptınız!");
	
		}

	}

}
