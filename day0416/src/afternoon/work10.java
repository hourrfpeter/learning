package afternoon;

public class work10 {
    public static void main(String[] args) {
        int f = f(5);
        System.out.println(f);
    }
    public static int f(int n){
        if(n==1){
            return 1;
        }else {
            return n*f(n-1);
        }
    }
}
