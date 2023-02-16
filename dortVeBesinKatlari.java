import java.util.Scanner;
/*Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana
 yazdıran programı yazıyoruz.  
 */
public class dortVeBesinKatlari {

	public static void main(String[] args) {
		int t;
	Scanner input=new Scanner(System.in);
	
	System.out.println("Sınır değer giriniz:");
	t=input.nextInt();
	for(int i=1; i<=t;i*=4) {
		System.out.println(i);
	}
	
		for(int i=1; i<=t;i*=5) {
			System.out.println(i);
		}
			
		}
	}



