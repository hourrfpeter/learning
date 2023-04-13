import java.util.Scanner;

public class work8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的税前收入：");
        double salary = sc.nextDouble();
        double tax = 0;
        if (salary <= 2000) {
            tax = 0;
        } else if (salary <= 2500) {
            tax = (salary - 2000) * 0.05;
        } else if (salary <= 4000) {
            tax = (salary - 2500) * 0.1 + 25;
        } else if (salary <= 7000) {
            tax = (salary - 4000) * 0.15 + 25 + 150;
        } else if (salary <= 22000) {
            tax = (salary - 7000) * 0.20 + 25 + 150 + 450;
        } else if (salary <= 42000) {
            tax = (salary - 22000) * 0.3 + 25 + 150 + 450 + 6000;
        } else if (salary <= 62000) {
            tax = (salary - 42000) * 0.35 + 25 + 150 + 450 + 6000 + 8750;
        } else if (salary <= 82000) {
            tax = (salary - 62000) * 0.4 + 25 + 150 + 450 + 6000 + 8750 + 12000;
        } else if (salary <= 102000) {
            tax = (salary - 82000) * 0.45 + 25 + 150 + 450 + 6000 + 8750 + 12000 + 15250;
        }
        System.out.println("你的税金为：" + tax);
        System.out.println("你的税后收入为：" + (salary - tax));
    }
}
