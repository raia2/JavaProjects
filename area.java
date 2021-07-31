public class area {
    static class square{
        int side;
        int l,b;
        public int area(){
            return side*side;
        }
        public int parameter(){
            return 4*side;
        }
        public int area2(){
            return l*b;
        }
    }

    public static void main(String[] args) {
        square sq= new square();
        square rec= new square();
        rec.l=5;
        rec.b=10;
        System.out.println(rec.area2());
        sq.side=5;
        System.out.println(sq.area());
        System.out.println(sq.parameter());
    }
}
