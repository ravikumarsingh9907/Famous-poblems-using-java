public class ResetTheithBit {
    public static void main(String[] args) {
        int in = 14;
        int ans = Setbit(in, 3);
        System.out.println(ans);
    }

    static int Setbit(int in, int value) {
        return (in & (~(1 << (value-1))));
    }
}
