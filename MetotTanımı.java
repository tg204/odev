
public class deneme{

    static int power(int base, int exp){

        int result=1;
        for(int i=1; i<=exp;i++){
            result*=base;
        }
        return result;
    }

    public static void main(String[] args) {

        System.out.print(power(2,3));

    }
}