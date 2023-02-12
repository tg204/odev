import java.util.Scanner;

public class cinZodyagi {

	public static void main(String[] args) {
		Scanner input= new Scanner (System.in);
		int age, result ;

		System.out.print("Doğum yılınızı giriniz:");
		age=input.nextInt();
		
		result=age%12;
		
		if (result==0) {
			System.out.print("Çin zodyağı burcunuz: MAYMUN");	
		
		}else if (result==1) {
			System.out.print("Çin zodyağı burcunuz: HOROZ");	
		}else if (result==2) {
			System.out.print("Çin zodyağı burcunuz: KÖPEK");	
		}else if (result==3) {
			System.out.print("Çin zodyağı burcunuz: DOMUZ");	
		}else if (result==1) {
			System.out.print("Çin zodyağı burcunuz: FARE");	
		}else if (result==5) {
			System.out.print("Çin zodyağı burcunuz: ÖKÜZ");	
		}else if (result==6) {
			System.out.print("Çin zodyağı burcunuz: KAPLAN");	
		}else if (result==7) {
			System.out.print("Çin zodyağı burcunuz: TAVŞAN");	
		}else if (result==8) {
			System.out.print("Çin zodyağı burcunuz: EJDERHA");	
		}else if (result==9) {
			System.out.print("Çin zodyağı burcunuz: YILAN");	
		}else if (result==10) {
			System.out.print("Çin zodyağı burcunuz: KAPLAN");	
		}else if (result==11) {
			System.out.print("Çin zodyağı burcunuz: AT");	
		}else if (result==12) {
			System.out.print("Çin zodyağı burcunuz: KOYUN");	
		}else {
			System.out.print("Hatalı giriş yaptınız. Tekrar deneyiniz.");	
		
	}
}

}
