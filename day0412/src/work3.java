import java.util.Scanner;

public class work3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double [] money1 = new double[5];
        for (int i = 1; i <= 5; i++) {
            System.out.print("请输入第"+i+"笔购物金额：");
            double money2 = sc.nextDouble();
            money1[i-1] = money2;
        }
        System.out.println("序号\t\t金额(元)");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i+"\t\t"+money1[i-1]);
        }
        System.out.println("总金额\t"+(money1[0]+money1[1]+money1[2]+money1[3]+money1[4]));
    }
}
