import java.util.Scanner;

public class sinfGecmeDurumu {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		double mat,fizik,turkce,kimya,muzik,ort;
		
		
		System.out.print("Matematik notunuzu giriniz:");
		mat=input.nextDouble();
		System.out.print("Fizik notunuzu giriniz:");
		fizik=input.nextDouble();
		System.out.print("Türkçe notunuzu giriniz:");
		turkce=input.nextDouble();
		System.out.print("Kimya notunuzu giriniz:");
		kimya=input.nextDouble();
		System.out.print("Müzik notunuzu giriniz:");
		muzik=input.nextDouble();
		
	
		
		 if  ((mat<=0)||(mat>100)) {
			ort= (fizik+turkce+kimya+muzik)/5;
			
			
			}else if((fizik<0) ||(fizik>100)){
				ort= (mat+turkce+kimya+muzik)/5;
			
		    }else if((turkce<0)||(turkce>100)){
		    	ort= (mat+fizik+kimya+muzik)/5;	
			
		    }else if((kimya<0)||(turkce>100)) {
		    	ort= (fizik+turkce+mat+muzik)/5;
		   
		    }else if((muzik<0) || (muzik>100)) {
		    	ort= (fizik+turkce+kimya+mat)/5;
		    }else {
		    	ort= (mat+turkce+kimya+muzik+fizik)/5;
		    
		    }
		 System.out.println("Ortalamanız:"+ort);
		 
		 if (ort>55) {
			 System.out.println("Sınıfı geçtiniz TEBRİKLER");
		 }else {
			 System.out.println("Sınıfta kaldınız. SENEYE GÖRÜŞÜRÜZ.");
		 }


	}

}

