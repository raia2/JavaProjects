public class avg_arrayMatrix {
    public static void main(String[] args) {
        int[][]a={{2,5,7,8,4},{5,7,3,8,9,}};
        System.out.println(a.length);
        int cols=a.length;
        int rows=a[0].length;
        for(int i=0;i<=4;i++){
            int sum=0;
            for( int j=0;j<rows;j++){

                sum=sum+a[i][j];

            }
            System.out.println(sum);
        }

    }
}
