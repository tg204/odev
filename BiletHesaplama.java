import java.util.Scanner;

public class BiletHesaplama {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //km birim fiyatı :0.10$
		// 12 yaşından küçkse %50indirim
		// 12-24 yaş arasında ise %10 indirim 
		// 65 yaşından büyükse %30 indirim 
		// gidiş dönüs alırsa %20 indrim
		// bu koşula göre bilet alırsa uçak bileti fiyatı hesaplayan program yaszınız
		
		Scanner input= new Scanner(System.in);
		int km, yas, tip;
		System.out.print("KM GİRİNİZİN:");
		km =input.nextInt();
		System.out.print("YAŞ GİRİNİZİN:");
		yas =input.nextInt();
		System.out.print("1-GİDİŞ\n2-GİDİŞ DÖNÜŞ\nTİP SEÇİNİZ:");
		tip =input.nextInt();
		
	double normalfiyat,yasindirimi, tipindirimi;
	
	if (km>0 && yas>0 && (tip==1 || tip==2)) {
		
	normalfiyat =km*0.10;
	     if (yas<12) {
		yasindirimi=normalfiyat*0.5;
	     }else if (yas<24 && yas>12){
		yasindirimi=normalfiyat*0.10;
	     }else if (yas>65) {
		yasindirimi=normalfiyat*0.30;
	     }else {
	     yasindirimi =0 ;
	     
	     normalfiyat -= yasindirimi;
	     }
	     
	     
	     if (tip==2) {
	    	tipindirimi=normalfiyat*0.20; 
	    	normalfiyat=(normalfiyat-tipindirimi )*2; 
	     }
	     System.out.println("BİLET FİYATI:"+normalfiyat+"$");
		
	
		
		}else { 
		System.out.println("YANLIŞ DEĞERLER GİRDİNİZ TEKRAR DENEYİNİZ.");		
		
		
	}

	}

}