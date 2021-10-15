public class SetTheithBit {
    public static void main(String[] args) {
        int in = 14;
        int ans = Setbit(in, 1);
        System.out.println(ans);
    }

    static int Setbit(int in, int i) {
        return (in | (1 << (i-1)));
    }
}
