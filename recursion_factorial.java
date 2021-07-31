public class recursion_factorial {
//    static int factorial(int n) {
//        if (n == 0 || n == 1) {
//            return 1;
//        } else {
//            return n*factorial(n-1);
//        }
//        if (n == 0 || n == 1) {
//            return 1;
//        } else {
//            int product=1;
//           for(int i=1;i<=n;i++){
//               product*=i;
//           }
//            return product;
//        }
        static int fibonacci(int m){
            int sum=0;

            for (    int i=0;i<= m;i++) {
                int sum2=sum+i;


                i++;
            }
            return sum;
    }

    public static void main(String[] args) {
        int x=4;
        System.out.println("the value of factorial n is: "+ fibonacci(x));
    }
}
