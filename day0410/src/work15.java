import java.util.Scanner;

public class work15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个小于10的整数：");
        int n = sc.nextInt();
        int a = 1;
        for (int i = 1; i <= n; i++) {
            a = a * i;
        }
        System.out.println(a);
    }
}
