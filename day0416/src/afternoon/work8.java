package afternoon;

public class work8 {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        work8 w=new work8();
        w.swap(a,b);
        System.out.println(a);
        System.out.println(b);
    }

    public void swap(int a, int b){
        int temp=a;
        a=b;
        b=temp;
    }
}
