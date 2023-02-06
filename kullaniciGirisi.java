import java.util.Scanner;
public class login {

	public static void main(String[] args) {
		
		Scanner input =new Scanner (System.in);
		
		String userName , password ,change ;
		int  secim;
		
		
		System.out.print("Kullanıcı adınızı giriniz:");
		userName= input.nextLine();
		
		System.out.print("Şifrenizi giriniz:");
		password = input.nextLine();
		
		if(userName.equals("patika") && password.equals("java123")) {
			System.out.print("hoşgeldiniz");
				
		}else {
			System.out.println("Hatalı giriş yaptiniz.");
		    System.out.print("şifrenizi sıfırlamak ister misiniz? \n1-evet\n2-hayır\nseçim:");		    		    
		    secim=input.nextInt();
		    
		    change = input.nextLine(); 
		   
		    if(secim==1) {
		    	System.out.print("yeni şifrenizi giriniz:");
		    	change = input.nextLine();     
		    	
		    	if (password!=change) {
		    		
		    		System.out.print("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
		    	}else {
		    		System.out.print("Şifre oluşturuldu");
		    	}
			
		 	
		    }else if(secim==2) {
		    	System.out.print("eski şifrenizi tekrar deneyin.");
		    	
		  }
	  }
		    	
		   
	}
}
		    		    	
		   	
		    	
		


	

