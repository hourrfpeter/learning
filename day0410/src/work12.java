public class work12 {
    public static void main(String[] args) {
        int a = 0;
        for (int i = 1; i <= 99; i=i+2) {
            a = i + a;
        }
        System.out.println("和为：" + a);
    }
}
