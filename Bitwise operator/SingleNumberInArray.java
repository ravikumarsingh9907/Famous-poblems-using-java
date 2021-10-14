public class SingleNumberInArray{
    public static void main(String[] args) {
        int[] arr = {1,2,3,6,4,3,2,1,4};
        System.out.println(FindNum(arr));
    }

    static int FindNum(int[] arr) {
        int Unique = 0;
        for (int n: arr){
            Unique ^= n;
        }
        return Unique;
    }
}
