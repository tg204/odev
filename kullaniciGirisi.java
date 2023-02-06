import java.util.Scanner;
public class ucgenAlanHesaplama {

	public static void main(String[] args) {
		Scanner input =new Scanner (System.in);
		int a,b,c;
		double u, alan;
      
		System.out.print("A kenarı giriniz:");
		a=input.nextInt();
		System.out.print("B kenarı giriniz:");
		b=input.nextInt();
		System.out.print("C kenarı giriniz:");
		c=input.nextInt();
		u=(a+b+c)/2;
		alan = Math.sqrt((u*(u-a)*(u-b)*(u-c)));
		System.out.print("ÜÇGENİN ALANI:"+alan);
		
		
	}

}

