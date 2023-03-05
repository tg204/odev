public class deneme {

    static boolean isPalindrome(int n) {
        int temp = n, lastnumber ,reverse = 0;

        while (temp != 0) {
            lastnumber = temp % 10;
            reverse = (reverse * 10) + lastnumber;
            temp/=10;
        }
        return n == reverse;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(1));
    }
}