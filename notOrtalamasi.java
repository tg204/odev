import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        int mat, fizik, kimya,edebiyat,tarih ;
        String str;
        Scanner input =new Scanner(System.in);

        System.out.print("MATEMATİK NOTUNUZU GİRİNİZ:" );
        mat=input.nextInt();
        System.out.print("FİZİK NOTUNUZU GİRİNİZ:" );
        fizik=input.nextInt();
        System.out.print("KİMYA NOTUNUZU GİRİNİZ:" );
        kimya=input.nextInt();
        System.out.print("EDEBİYAT NOTUNUZU GİRİNİZ:" );
        edebiyat=input.nextInt();
        System.out.print("TARİH NOTUNUZU GİRİNİZ:" );
        tarih=input.nextInt();
        
        int toplam=(mat+fizik+kimya+edebiyat+tarih);
        double ort= toplam /5;

        System.out.println("not ortalamanız:"+ort);

       str= (ort >=60) ? "gectiniz":"kaldınız";
       System.out.print(str);
       


    }

}

