import java.util.Scanner;

public class work2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数，表示一个人的年龄：");
        int num = sc.nextInt();
        if (num < 0) {
            System.out.println("输入的年龄不正确！");
        } else if (num > 150) {
            System.out.println("输入的年龄不正确！");
        } else {
            if (num < 6) {
                System.out.println("儿童");
            } else if (num < 13) {
                System.out.println("少儿");
            } else if (num < 18) {
                System.out.println("青少年");
            } else if (num < 35) {
                System.out.println("青年");
            } else if (num < 50){
                System.out.println("中年");
            }else {
                System.out.println("中老年");
            }
        }
    }
}
