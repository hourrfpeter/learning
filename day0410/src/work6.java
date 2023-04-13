import java.util.Scanner;

public class work6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入两个整数：");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("请选择对这两个整数的操作：");
        System.out.println("1.求和");
        System.out.println("2.求差");
        System.out.println("3.求积");
        System.out.println("4.求商");
        System.out.println("请输入您的选择：");
        int c = sc.nextInt();
        switch (c) {
            case 1:
                System.out.println("两个整数的和为：" + (a + b));
                break;
            case 2:
                System.out.println("两个整数的差为：" + (a - b));
                break;
            case 3:
                System.out.println("两个整数的积为：" + (a * b));
                break;
            case 4:
                System.out.println("两个整数的商为：" + (a / b));
                break;
            default:
                System.out.println("您的输入有误！");
                break;
        }
    }
}
