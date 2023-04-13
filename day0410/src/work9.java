import java.util.Scanner;

public class work9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个三位数：");
        int num = sc.nextInt();
        if (num < 100 || num > 999) {
            System.out.println("输入的不是三位数");
        } else {
            int a = num / 100;
            int b = num % 100 / 10;
            int c = num % 10;
            int d = a + b + c;
            System.out.println("三位数的各位数之和为：" + d);
        }
    }
}
