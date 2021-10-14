public class FindTheithBit {
    public static void main(String[] args) {
        int n = 11;
        System.out.println(Integer.toBinaryString(n));
        System.out.println(FindBit(n, 3 ));
    }
    static int FindBit(int n, int k){
        return  ((n & (1 << (k - 1))) >> (k - 1));
    }
}
