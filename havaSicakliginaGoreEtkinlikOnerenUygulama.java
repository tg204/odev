import java.util.Scanner;
public class havaSicakliginaGoreEtkinlikOnerenUygulama {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int heat;
		
		System.out.print("Sıcaklık değerini giriniz:");
		heat=input.nextInt();
		
		if(heat<5) {
			System.out.print("Kayak yapabilirsiniz.");	
			
		}else if(heat>=5 && heat <= 10) {
			System.out.print("sinemaya gidebilirsiniz");	
			
		}else if (heat>=10 && heat <=15 ) {
				System.out.print("sinemaya gidebilirsiniz\npiknik yapabilirsiniz.");
				
				
		}else if(heat>15 && heat<26) {
			System.out.print("Piknik yapabilirsiniz.");	
		}else  {
			System.out.print("Yüzmeye gidebilirsiniz.");		
	
		

	}
	}

}