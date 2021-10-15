public class FindnthMAgicNumber {
    public static void main(String[] args) {
        int n = 6;
        int baseValue = 5;
        int Againbase = 5;
        int ans =0;
        while(n>0) {
            int last = n&1;
            n = n>>1;
            ans += last*baseValue;
            baseValue = baseValue*Againbase;
        }
        System.out.println(ans);
    }
}
