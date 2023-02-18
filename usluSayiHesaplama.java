import java.util.Scanner;

public class usluSayiHesaplama {

	public static void main(String[] args) {
		int t, u;
		int total=1;
		Scanner scan=new Scanner(System.in);
		System.out.print("Taban sayıyı giriniz:");
		t=scan.nextInt();
		System.out.print("üs olacak sayıyı giriniz:");
		u=scan.nextInt();
		
		
		for(int i=1; i<=u ;i++) {
			total*=t;			
			
		}
			System.out.print("sonuç:"+total);
	}

}
