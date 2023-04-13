
public class work5 {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int max= num[0];
        int i;
        for (i = 0; i < num.length; i++) {
            if (num[i] > num[0]) {
                int temp = num[i];
                num[i] = num[0];
                num[0] = temp;
            }

        }
        System.out.println(num[0]);
    }
}
