public class main {
    public static void main(String[] args) {
        ststic obj1= new ststic();
        ststic obj2= new ststic();

        obj1.incrementer();
        System.out.println("the obj1 counter "+obj1.counter);
        System.out.println("the obj1 timer "+obj1.time);

        obj2.incrementer();
        System.out.println("the obj1 counter "+obj2.counter);
        System.out.println("the obj1 timer "+obj2.time);

        obj1.incrementer();
        System.out.println("the obj1 counter "+obj1.counter);
        System.out.println("the obj1 timer "+obj1.time);

        obj2.incrementer();
        System.out.println("the obj1 counter "+obj2.counter);
        System.out.println("the obj1 timer "+obj2.time);

    }
}
