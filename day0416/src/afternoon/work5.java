package afternoon;
import java.util.Scanner;
public class work5 {
    public static void main(String[] args) {
        work4 w4 = new work4();
        System.out.println(w4.add(1, 2, 3));
        System.out.println(w4.avg(1, 2, 3));
        System.out.println(w4.max(1, 2));
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数：");
        int a = sc.nextInt();
        System.out.println("请输入第二个数：");
        int b = sc.nextInt();
        int max = w4.max(a, b);
        System.out.println(max);
    }
}
