import java.util.Scanner;
public class daireAlanhesap {

	public static void main(String[] args) {
		Scanner input =new Scanner (System.in);
		int aci,yaricap;
		double pi=3.14, alan;
		
		System.out.print("Yariçap değerini giriniz:");
		yaricap=input.nextInt();
		System.out.print("Açı değerini giriniz:");
		aci=input.nextInt();
		alan= (pi*(yaricap*yaricap)*aci)/360;
		System.out.print("Direnin alanı:"+alan);
		
		

	}

}
