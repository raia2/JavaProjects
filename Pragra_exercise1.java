public class Pragra_exercise1 {
    public static void main(String[] args) {
        float[] a = {5f, 7.9f, 8.6f, 4.4f, 7.9f, 5.9f, 9.9f, 2.2f, 8.8f, 7.1f};
        float sum = 0;
        int []array=new int[10];
        for (int i = 0; i <10; i++) {
            sum += a[i];
        }
        System.out.println("the sum of the values= " + sum);
        for (int num : array) {
            sum= sum+num;
        }
        System.out.println("the sum of the values= " + sum);
    }
}
