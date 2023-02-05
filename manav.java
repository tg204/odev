import java.util.Scanner;
public class manav {

	public static void main(String[] args) {
		Scanner input =new Scanner (System.in);
		
		int armut, elma, domates, muz, patlican;
		double tutar;
		
		System.out.print("Armut kaç kilo? :");
		armut=input.nextInt();
		System.out.print("Elma kaç kilo? :");
		elma=input.nextInt();
		System.out.print("Domates kaç kilo? :");
		domates=input.nextInt();
		System.out.print("Muz kaç kilo? :");
		muz=input.nextInt();
		System.out.print("Patlıcan kaç kilo? :");
		patlican=input.nextInt();
		
		tutar= (armut*2.14)+(elma*3.67)+(domates*1.11)+(muz*0.95)+(patlican*5);
		System.out.print("Toplam tutar:" + tutar );
		System.out.print("₺");
		
	}

}
