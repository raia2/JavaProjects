public class pattern {
    static void pattern1(int n){
        for(int i=n;i<=n && i>0;i--) {
            for (int j = i; j <= i && j>0; j--) {
                System.out.print("*");
            }
            System.out.println("  ");
        }
    }
    public static void main(String[] args) {
        pattern1(4);

    }

}
