import java.util.Scanner;

public class work7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入货物的重量（单位为公斤）：");
        double weight = sc.nextDouble();
        if (weight <= 0) {
            System.out.println("输入的重量不正确！");
        } else if (weight < 20) {
            System.out.println("运费为：" + 5 + "元");
        } else if (weight < 100) {
            System.out.println("运费为：" + (5 + (weight - 20) * 0.2) + "元");
        } else {
            System.out.println("运费为：" + (5 + 16 + (weight - 100) * 0.15) + "元");
        }
    }
}
