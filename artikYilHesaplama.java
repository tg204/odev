
import java.util.Scanner;
public class artikYilHesaplama {
    public static void main (String[] args) {
        int yil;

        Scanner input = new Scanner(System.in);

        System.out.print("Yıl Giriniz: ");
        yil = input.nextInt();

        if (yil%4 == 0 && yil%100 == 0 && yil%400 == 0){
            System.out.println("Bu Bir Artık Yıldır");
        }else{
            System.out.println("Bu Bir Artık Yıl Değildir");
        }
    }
}
