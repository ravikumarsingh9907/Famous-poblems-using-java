public class Fibonacci {
    public static void main(String[] args) {
    // Function Calling----------------------
        System.out.println(series(6));
    }

    static int series(int fnum){ // creating function with argument-----------------------
         if(fnum < 2) { // Base Condition----------------
             return fnum;
         }
         return series(fnum-1) + series(fnum-2); // Function calling it self--------------------
    }
}
