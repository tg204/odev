import java.util.Scanner;

public class basamakSayilarinToplami{

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		  System.out.print("Sayı Giriniz :");
	        int number = input.nextInt();	        
	        int tempNumber=number;
	        int basValue;
	        int result=0;
	        	     
	        tempNumber=number;	       
	        while(tempNumber!=0) {	        	
	        	number/=10;	   
	        	basValue=tempNumber%10;
	        	result+=basValue;    
	        	tempNumber/=10;  
	        		        		        	
	        }
	        System.out.print(result);
	        
	}

}