public class method_overloading {
    static int sum (int ...arr) {
        // int [] arr;
        int result = 0;
        for (int a : arr) {
            result += a;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Varargs Tutorial");
        System.out.println("the sum of 4 and 5= "+sum(4,5));
    }

}
