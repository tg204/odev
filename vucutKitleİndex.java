import java.util.Scanner;
public class vucutKitleIndex {

	public static void main(String[] args) {
		Scanner input =new Scanner (System.in);
		int kg;
		double m,index;
		System.out.print("Lütfen boyunuzu (metre cinsinden) giriniz:");
		m=input.nextDouble();
		System.out.print("Lütfen kilonuzu giriniz:");
		kg=input.nextInt();
		index=kg/(m*m);
		System.out.print("Vucut kitle indexiniz:"+index);
			

	}

}
