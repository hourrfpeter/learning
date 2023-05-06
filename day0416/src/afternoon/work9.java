package afternoon;


public class work9 {
    public static void main(String[] args) {
        Swap swap=new Swap();
        swap.a=10;
        swap.b=20;
        work9 w=new work9();
        w.m(swap);
        System.out.println(swap.a);
        System.out.println(swap.b);
    }

    public void m(Swap swap){
        int temp=swap.a;
        swap.a=swap.b;
        swap.b=temp;
    }

    public static class Swap{
        int a;
        int b;
    }
}
