
public class asalSayi{
    public static void main(String[] args) {

        for(int i = 2; i < 100; i++){

            int sayaci = 0;

            for(int k = 1 ; k <= i ; k++){

                if(i % k == 0){
                    sayaci++;
                }
            }
            if(sayaci <= 2){
                System.out.print(i);
                System.out.print(" ");
            }

            }
        }
    }
