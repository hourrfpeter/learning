public class work16 {
    public static void main(String[] args) {
        int b = 0;
        for (int a = 3; a < 100; a = a + 3) {
            if (a % 5 != 0) {
                b = b + a;
            }
        }
        System.out.println(b);
    }
}
