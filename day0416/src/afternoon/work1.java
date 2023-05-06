package afternoon;
import java.util.Scanner;
public class work1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生的姓名：");
        String name = sc.next();
        double sum = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("请输入第" + (i + 1) + "门课的成绩：");
            sum = sum + sc.nextDouble();
        }
        double avg = sum / 5;
        System.out.println(name + "的平均成绩为：" + avg);
    }
}
