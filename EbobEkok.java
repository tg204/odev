import java.util.Scanner;

public class EbobEkok {

	public static void main(String[] args) {
		int n1,n2;
		Scanner input=new Scanner(System.in);
		
		System.out.print("n1 sayısını giriniz:");
		n1=input.nextInt();
		
		System.out.print("n2 sayısını giriniz:");
		n2=input.nextInt();
		
		int ebob =1;
		
		
		if(n1<n2) {
			int i=1;
			while(n1>=i) {
				
				if (n1%i==0 && n2%i==0) {
				
	                    ebob = i;	                   					
				}
				
				i++;				
			}
			System.out.println("Ebob="+ ebob);
			System.out.println("Ekok=" +(n1*n2)/ebob);
			
		}else{
				int k=1;
				while(n1>=k) {
					
					if (n1%k==0 && n2%k==0) {
					
		                    ebob = k;	                   					
					}
					
					k++;				
				}
				System.out.println("Ebob="+ ebob);
				System.out.println("Ekok=" +(n1*n2)/ebob);
			
		}
		
	}
}

