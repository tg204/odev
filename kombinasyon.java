import java.util.Scanner;
//C(n,r) = n! / (r! * (n-r)!)
public class kombinasyon {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
	int n ,r ,total1=1 ,total2=1 ,total3=1,t, sonuc;
	
	System.out.println("kombinasyon hesaplayan program için; C(n,r)");
	System.out.print("n sayısını giriniz:");
	n=input.nextInt();
	System.out.print("r sayısını giriniz:");
	r=input.nextInt();
	t=n-r;
	
	for(int i=1; i<=n ; i++) {
		total1*=i;	
	}
	for(int e=1; e<=r ; e++) {
		total2*=e;	
	}
	for(int s=1; s<=t ; s++) {
		total3*=s;	
	}
	
	
	sonuc=total1/(total2*total3);
	System.out.println("sonucunuz:"+sonuc);

	}

}
