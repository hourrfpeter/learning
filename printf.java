public class printf {
    public static void main(String[]args){
        System.out.printf("hello %d \n",123);
        System.out.printf("%d hello \n",123);
        boolean my1 = true;
        char my2 = 'a';
        String my3 = "hello";
        int my4 = 100;
        double my5 = 3.14;
        System.out.printf("%b %c %10s %+d %.2f",my1,my2,my3,my4,my5);

    }
}
