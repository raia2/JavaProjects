import com.sun.org.apache.bcel.internal.generic.ARETURN;

public class largest_smallest_array {
    public static void main(String[] args) {
        float[] a = {5f, 7.9f, 8.6f, 4.4f, 7.9f, 5.9f, 9.9f, 2.2f, 8.8f, 7.1f};
        float max=a[0];
        for(int i=0;i<10;i++){
            if(max<a[i]){
                max=a[i];
            }
        }
        System.out.println("max value="+max);
        char[]ch={'R','A','I'};
        for(char name:ch){
            System.out.print(name);
        }
    }

}
