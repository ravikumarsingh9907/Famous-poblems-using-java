public class FindDigitInBinary {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(digit(n, 10));
    }

    static int digit(int n, int base) {
        return (int)(Math.log(n) / Math.log(base) +1 );
        }
    }
