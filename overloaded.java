public class overloaded {
    public static void main(String[]args){
        int x = add(1,2,3);
        System.out.println(x);
    }
    static int add(int a,int b){
        System.out.println("a+b");
        return a+b;
    }
    static int add(int a,int b,int c){
        System.out.println("a+b+c");
        return a+b+c;
    }
}
