public class FindSetBitDigits {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(Setbit(n));
    }

    static int Setbit(int n) {
        int count = 0;
        while(n >0) {
            count++;
            n = n& (n-1);
        }
        return count;
    }
}
