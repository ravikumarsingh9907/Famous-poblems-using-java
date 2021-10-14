public class Fibonacci {
    public static void main(String[] args) {
    // Function Calling----------------------
        System.out.println(series(6));
    }
// This method is used to find fibonacci series of smaller numbers, You can't calculate Fibo for bigger number with this method (METHOD-1)
    
//     static int series(int fnum){ // creating function with argument-----------------------
//          if(fnum < 2) { // Base Condition----------------
//              return fnum;
//          }
//          return series(fnum-1) + series(fnum-2); // Function calling it self--------------------
//     }
 
    
// Used to find Fibo of bigger numbers---------------------(METHOD-2)
    
    static int series(int fnum) {
        return (int)(Math.pow(((1+Math.sqrt(5))/2), fnum)/Math.sqrt(5));
    }
    
//finding fibo via recurance------------------(METHOD-3)
    
}
